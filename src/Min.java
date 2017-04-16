import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.function.*;

public class Min {
	
	public static void main(String[] args)
	{
		ArrayList<Person> pepole=new ArrayList<>();
		pepole.add(new Person("Scott Farmson", 26, Person.Gender.MAIL));
		pepole.add(new Person("Sara larson", 36, Person.Gender.FEMAIL));
		pepole.add(new Person("Rolf Ericsson", 30, Person.Gender.MAIL));
		pepole.add(new Person("Noor Semson", 20, Person.Gender.FEMAIL));
		pepole.add(new Person("Bassam Aldalati", 28, Person.Gender.MAIL));
		
		
	String[] names=	pepole.stream().filter((Person p) -> {return p.gender == Person.Gender.FEMAIL;})
		.filter((Person p)->{return p.age>=10;})
		.sorted(Person::comparAge)
		.map((p)->{return p.firstName;})
		.toArray((l)->{return new String[l];});
	for (String str : names) {
		System.out.println(str);
		
	}
		
	
	}

}


