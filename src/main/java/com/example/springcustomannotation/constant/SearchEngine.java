package com.example.springcustomannotation.constant;
/**
 * ENUM to show different types of search engine supported
 * 
 * @author Sujan Sen
 *
 */
public enum SearchEngine {
	GOOGLE("google"), BING("bing");

	private String value;

	SearchEngine(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

}
