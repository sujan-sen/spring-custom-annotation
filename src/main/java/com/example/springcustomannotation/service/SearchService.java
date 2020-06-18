package com.example.springcustomannotation.service;

/**
 * This is the service interface which will be used by the implementing classes
 * to write their respective versions. This will then be used in controller to
 * call the implementation service classes.
 * 
 * @author Sujan Sen
 *
 */
public interface SearchService {
	String getSearchResult(String searchString);
}
