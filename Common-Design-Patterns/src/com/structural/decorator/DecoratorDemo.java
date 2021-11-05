package com.structural.decorator;

public class DecoratorDemo {

	public static void main(String[] args) {
		 
		FilterQuery filterQuery = new BusinessFilterQuery(new RecordStatusFilterQuery(new MandatoryFilterQuery()));
		System.out.println(filterQuery.createFilterQuery());

	}

}
