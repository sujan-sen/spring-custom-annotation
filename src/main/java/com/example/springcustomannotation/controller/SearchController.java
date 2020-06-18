package com.example.springcustomannotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springcustomannotation.constant.SearchEngine;
import com.example.springcustomannotation.service.SearchService;
import com.example.springcustomannotation.util.BeanUtil;
/**
 * Controller which will expose the rest end point
 * 
 * @author Sujan Sen
 *
 */
@RestController
public class SearchController {
    @Autowired
	private BeanUtil beanUtil;
    
	@GetMapping("/search")
	public String searchString(@RequestParam(value = "searchString") String searchString,
			@RequestParam(value = "searchEngine") SearchEngine searchEngine) {
		String searchResultJson = null;
		SearchService service = beanUtil.findBeanImplByAnnotation(SearchService.class, searchEngine);
		searchResultJson = service.getSearchResult(searchString);

		return searchResultJson;
	}
}

