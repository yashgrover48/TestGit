package io.javabrains.unit1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import io.javabrains.common.Person;

public class StreamsExample1 {
	public static void main(String[] args){
		List<Person> people = Arrays.asList(
				new Person("Charles","Dickens",65),
				new Person("Lewis","Carroll",32),
				new Person("John","Smith",48),
				new Person("Thomas","Cryan",24),
				new Person("Mathew","Arnold",74)
				);
		
		people.stream()
		.filter(p -> p.getLastName().startsWith("C")) // for example, we want the person who has lastName starting with letter 'C'
		// so for this we use filter and if predicate returns true, then only that instance of person will be moved 
		// towards the forEach loop.
		//.collect(Collectors.toList())
		.forEach(p -> System.out.println(p.getFirstName()));// terminal condition or end condition
		
		long count = people.stream()
				.filter(p -> p.getLastName().startsWith("C"))
				.count();
		
		System.out.println("Count:"+count);
	}

}
