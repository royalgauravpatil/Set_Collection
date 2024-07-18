package Com.Person;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class AdvancedOperations {

	public static void main(String[] args) {
		Set<p> hashSet = new HashSet<>(); 
		Set<p> linkedHashSet = new LinkedHashSet<>();

		hashSet.add(new p(1, "Gaurav", 30));
		hashSet.add(new p(2, "vinay", 25));
		hashSet.add(new p(3, "abhi", 35));

		linkedHashSet.add(new p(4, "Tushar", 20));
		linkedHashSet.add(new p(5, "Nilima", 28));
		linkedHashSet.add(new p(6, "Sonu", 33));

		System.out.println("=======================================================================================================================");
		System.out.println("Max age in HashSet: " + findMaxAge(hashSet));
		System.out.println("=======================================================================================================================");

		System.out.println("Min age in HashSet: " + findMinAge(hashSet));
		System.out.println("=======================================================================================================================");

		System.out.println("Max age in LinkedHashSet: " + findMaxAge(linkedHashSet));
		System.out.println("=======================================================================================================================");

		System.out.println("Min age in LinkedHashSet: " + findMinAge(linkedHashSet));
		System.out.println("=======================================================================================================================");

		List<p> sortedHashSet = sortByAge(hashSet);
		System.out.println("Sorted HashSet by age: " + sortedHashSet);
		System.out.println("========================================================================================================================");

		List<p> sortedLinkedHashSet = sortByAge(linkedHashSet);
		System.out.println("Sorted LinkedHashSet by age: " + sortedLinkedHashSet);
		System.out.println("=========================================================================================================================");

		Set<p> filteredSet = filterByAge(hashSet, 26);
		System.out.println("Filtered HashSet (age > 26): " + filteredSet);
		System.out.println("==========================================================================================================================");

	}


	private static p findMaxAge(Set<p> set) {
		return set.stream().max(Comparator.comparingInt(p::getAge)).orElse(null);
	}

		private static p findMinAge(Set<p> set) {
		return set.stream().min(Comparator.comparingInt(p::getAge)).orElse(null);
	}

		private static List<p> sortByAge(Set<p> set) {
		List<p> list = new ArrayList<>(set);
		list.sort(Comparator.comparingInt(p::getAge));
		return list;
	}

	
	private static Set<p> filterByAge(Set<p> set, int age) {
		Set<p> resultSet = new HashSet<>();
		for (p person : set) {
			if (person.getAge() > age) {
				resultSet.add(person);
			}
		}
		return resultSet;
	}
}