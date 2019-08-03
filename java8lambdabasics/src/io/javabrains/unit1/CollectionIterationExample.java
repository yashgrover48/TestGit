package io.javabrains.unit1;

import java.util.Arrays;
import java.util.List;

import io.javabrains.common.Person;

public class CollectionIterationExample {
	
	public static void main(String[] args){
		List<Person> people = Arrays.asList(
				new Person("Charles","Dickens",65),
				new Person("Lewis","Carroll",32),
				new Person("John","Smith",48),
				new Person("Thomas","Bryan",24),
				new Person("Mathew","Arnold",74)
				);
		
		System.out.println("Using for loop");
		
		for(int i=0;i<people.size();i++){
			System.out.println(people.get(i));
		}
		
		System.out.println("Using for-in loop");
		for(Person p : people){
			System.out.println(p);
		}
		
		System.out.println("Using lammbda forEach():");
		people.forEach(p -> System.out.println(p));
		// OR people.forEach(System.out::println);
	}
}
