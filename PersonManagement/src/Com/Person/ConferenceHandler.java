package Com.Person;


import java.util.HashSet;
import java.util.Set;

public class ConferenceHandler {

	private Set<p> attendees = new HashSet<>(); 

	
	public void addParticipant(p person) {
		attendees.add(person);
	}

	
	public void removeParticipant(p person) {
		attendees.remove(person);
	}

	
	public Set<p> findDuplicateAttendees() {
		Set<p> uniqueAttendees = new HashSet<>();
		Set<p> duplicateAttendees = new HashSet<>();
		for (p attendee : attendees) {
			if (!uniqueAttendees.add(attendee)) {
				duplicateAttendees.add(attendee);
			}
		}
		return duplicateAttendees;
	}

	
	public Set<p> listUniqueAttendees() {
		return new HashSet<>(attendees);
	}

	
	public Set<p> findAttendeesWithinAgeRange(int minAge, int maxAge) {
		Set<p> result = new HashSet<>();
		for (p attendee : attendees) {
			if (attendee.getAge() >= minAge && attendee.getAge() <= maxAge) {
				result.add(attendee);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		ConferenceHandler conference = new ConferenceHandler();

		conference.addParticipant(new p(1, "Abhi", 30));
		conference.addParticipant(new p(2, "Boby", 25));
		conference.addParticipant(new p(3, "gaurav", 35));
		conference.addParticipant(new p(1, "vinay", 30));
		System.out.println("===============================================================================================================================");

		System.out.println("All Attendees: " + conference.attendees);
		System.out.println("Duplicate Attendees: " + conference.findDuplicateAttendees());
		System.out.println("Unique Attendees: " + conference.listUniqueAttendees());
		System.out.println("Attendees aged 20-30: " + conference.findAttendeesWithinAgeRange(20, 30));
		
		System.out.println("===============================================================================================================================");

	}
}
