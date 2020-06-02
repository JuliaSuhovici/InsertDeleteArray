package algorithms;

public class PersonArray {
	public static void run() {
		Person[] people = new Person[4];

		people[0] = new Person("Sarah Blair");
		people[1] = new Person("Ben Affleck");
		people[2] = new Person("Jessy Jay");
		people[3] = new Person("Bill Jacobs");
		
		output("Default: ", people);
		
		//----DELETE----//
		int indexToDelete = 2;
		Person[] newPeople = new Person[people.length-1];
		
		
		for(int oi=0, ci=0; oi<people.length; oi++) {
			if(oi != indexToDelete) {
				newPeople[ci++] = people[oi];
			}
		}
		 
		people = newPeople;
		output("Delete: ", people);
		 
		//----Insert----//
		 int indexToInsert = 1;
		 Person[] newPeopleInsert = new Person[people.length+1];
		 Person insertPerson = new Person("Frank Sinatra");
		 
		 for(int oi=0, ci=0; ci<newPeopleInsert.length; ci++) {
			 if(ci != indexToInsert) {
					newPeopleInsert[ci] = people[oi++];
			 } else {
				 newPeopleInsert[ci] = insertPerson;
			 }
		 }
		 
		 people = newPeopleInsert;
		 output("Insert: ", people);
	}
	
	public static void output(String operation, Person[] people) {
		System.out.print(operation);
		for(Person i : people) {
			 System.out.print(i.getFullName() + "; ");
		 }
		 System.out.println();
	}
	
}

