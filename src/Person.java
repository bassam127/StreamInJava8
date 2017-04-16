
public class Person {

	 public String firstName,lastName;
	 public int age;
	 public Gender gender;
	 
	 public Person(String firstName, String lastName, int age,Gender g)
	 {
		 this.firstName=firstName;
		 this.lastName=lastName;
		 this.age=age;
		 this.gender=g;
	 }
	 public Person(String firstName, int age,Gender g)
	 {
		 this(firstName.split(" ")[0],firstName.split(" ")[1],age,g);
	 }
	 
	 public static int comparName(Person p1,Person p2)
	 {
		 return p1.firstName.compareTo(p2.firstName);
		 
	 }
	 public static int comparSurName(Person p1,Person p2)
	 {
		 return p1.lastName.compareTo(p2.lastName);
		 
	 }
	 public static int comparAge(Person p1,Person p2)
	 {
		 return  Integer.compare(p1.age,p2.age);
		 
	 }
	 public static int comparGender(Person p1,Person p2)
	 {
		 return p1.gender==p2.gender?0:p1.gender==Gender.MAIL?1:-1;
		 
	 }
	 
	 
	 public static enum Gender
	 {
		 MAIL(),FEMAIL();
	 }
	 @Override
	public String toString() {
		
		return this.firstName +" "+this.lastName+" : "+this.age+"year old " +this.gender.toString();
	}

}
