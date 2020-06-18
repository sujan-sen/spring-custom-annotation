package com.example.springcustomannotation.util;

import java.lang.annotation.Annotation;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.example.springcustomannotation.annotation.Bing;
import com.example.springcustomannotation.annotation.Google;
import com.example.springcustomannotation.constant.SearchEngine;
/**
 * This is the utility class which will detect the corresponding Bean Variant, based on user input or other logic.
 * The detected bean instance will be obtained from spring's ApplicationContext {@link ApplicationContext}
 * 
 * @author Sujan Sen
 *
 */
@Component
public class BeanUtil {
	//Injecting Application Context
	@Autowired
	private ApplicationContext applicationContext;

	public <T> T findBeanImplByAnnotation(Class<T> interfaceType, SearchEngine engineType) {
		Class<? extends Annotation> annotationType = null;
		T bean = null;
		//Detecting the annotation type
		if (engineType.equals(SearchEngine.GOOGLE)) {
			annotationType = Google.class;
		} else if (engineType.equals(SearchEngine.BING)) {
			annotationType = Bing.class;
		}
		// Getting all implementation beans for this particular interface
		String[] beans = applicationContext.getBeanNamesForType(interfaceType);
		int beanCount = 0;
		Annotation annotationOnBean = null;
		for (int i = 0; i < beans.length; i++) {
			//Looking for selected annotation in all implementation types
			annotationOnBean = applicationContext.findAnnotationOnBean(beans[i], annotationType);
			if (annotationOnBean != null) {
				bean = applicationContext.getBean(beans[i], interfaceType);
				beanCount++;//Increasing the counter to detect more that 1 implementation with same annotation type
			}
		}
		
		if (beanCount == 0) {
			//No implementation found with the selected annotation
			throw new NoSuchBeanDefinitionException(interfaceType,
					"No Bean definition found for " + engineType+" search engine type");
		} else if (beanCount > 1) {
			//More than 1 implementation found with the selected annotation
			throw new BeanCreationException(
					"No qualifying bean found. Expected 1 bean but found 2 matching definition for "
							+ interfaceType.getSimpleName() + " for " + engineType + " search engine type.");
		}
		//returning the implementation bean
		return bean;
	}

}