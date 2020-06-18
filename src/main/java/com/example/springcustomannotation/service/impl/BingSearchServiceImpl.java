package com.example.springcustomannotation.service.impl;

import org.springframework.stereotype.Service;

import com.example.springcustomannotation.annotation.Bing;
import com.example.springcustomannotation.service.SearchService;
/**
 * Service implementation class for bing search service. From here one can
 * call the bing search engine API to search through bing. This is not shown
 * here.
 * 
 * This service is annotated with @Bing {@link Bing}. This will help to
 * detect the right variant for the business implementation class
 * 
 * @author Sujan Sen
 *
 */
@Bing
@Service
public class BingSearchServiceImpl implements SearchService {

	@Override
	public String getSearchResult(String searchString) {
		// TODO: Write the corresponding business logic here for Bing search
		System.out.println("Going to search in bing search engine through rest call");
		return "Result from BING search";
	}

}
