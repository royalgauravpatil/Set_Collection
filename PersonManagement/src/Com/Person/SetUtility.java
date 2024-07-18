package Com.Person;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class SetUtility {

	public static void main(String[] args) {
		Set<p> hashSet = new HashSet<>(); 
		Set<p> linkedHashSet = new LinkedHashSet<>(); 
		p person1 = new p(1, "gaurav", 30);
		p person2 = new p(2, "sonu", 25);
		p person3 = new p(3, "Chetan", 35);
		p person4 = new p(1, "abhi", 30); 

		addPerson(hashSet, person1);
		addPerson(hashSet, person2);
		addPerson(hashSet, person3);
		addPerson(hashSet, person4);

		addPerson(linkedHashSet, person1);
		addPerson(linkedHashSet, person2);
		addPerson(linkedHashSet, person3);
		addPerson(linkedHashSet, person4);
		System.out.println("========================================================================================================================");

		System.out.println("HashSet: " + hashSet);
		System.out.println("LinkedHashSet: " + linkedHashSet);
		
		System.out.println("========================================================================================================================");


		Set<p> unionSet = union(hashSet, linkedHashSet);
		Set<p> intersectionSet = intersection(hashSet, linkedHashSet);
		Set<p> differenceSet1 = difference(hashSet, linkedHashSet);
		Set<p> differenceSet2 = difference(linkedHashSet, hashSet);
		System.out.println("==========================================================================================================================");

		System.out.println("Union: " + unionSet);
		System.out.println("Intersection: " + intersectionSet);
		System.out.println("Difference (HashSet - LinkedHashSet): " + differenceSet1);
		System.out.println("Difference (LinkedHashSet - HashSet): " + differenceSet2);
		
		System.out.println("==========================================================================================================================");

	}

	
	private static void addPerson(Set<p> set, p person) {
		set.add(person);
	}

	
	private static Set<p> union(Set<p> set1, Set<p> set2) {
		Set<p> resultSet = new HashSet<>(set1);
		resultSet.addAll(set2);
		return resultSet;
	}

	
	private static Set<p> intersection(Set<p> set1, Set<p> set2) {
		Set<p> resultSet = new HashSet<>(set1);
		resultSet.retainAll(set2);
		return resultSet;
	}

	
	private static Set<p> difference(Set<p> set1, Set<p> set2) {
		Set<p> resultSet = new HashSet<>(set1);
		resultSet.removeAll(set2);
		return resultSet;
	}
}
