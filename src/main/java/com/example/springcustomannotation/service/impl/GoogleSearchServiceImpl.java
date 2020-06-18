package com.example.springcustomannotation.service.impl;

import org.springframework.stereotype.Service;

import com.example.springcustomannotation.annotation.Google;
import com.example.springcustomannotation.service.SearchService;

/**
 * Service implementation class for Google search service. From here one can
 * call the google search engine API to search through google. This is not shown
 * here.
 * 
 * This service is annotated with @Google {@link Google}. This will help to
 * detect the right variant for the business implementation class
 * 
 * @author Sujan Sen
 *
 */
@Google
@Service
public class GoogleSearchServiceImpl implements SearchService {

	@Override
	public String getSearchResult(String searchString) {
		// TODO: Write the corresponding business logic here for Google search
		System.out.println("Going to search in Google search engine through rest call");
		return "Result from GOOGLE search";
	}

}
