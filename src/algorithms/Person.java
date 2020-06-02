package algorithms;

public class Person {
	private String fullName;

	public Person(String fullName) {
		this.fullName = fullName;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		if(fullName.trim().length()!=0) {
			this.fullName = fullName;
		} else {
			System.err.println("Name can't be empty!");
		}
	}
	
	
}
