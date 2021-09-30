import java.util.*;
import java.io.*;

class Employers implements Comparable<Employers>{
	
	private String name;
	private int age;
	
	public Employers(String name, int age, int salary) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Employers o) {
		return this.age - o.age;
	}	
}

class Namecompare implements Comparator<Employers> {
	public int compare(Employers e1, Employers e2) {
		return e1.getName().compareTo(e2.getName());
	}
}
public class Comparatorinterface {

	public static void main(String[] args) {
	
		ArrayList<Employers> list = new ArrayList<Employers>();
		list.add(new Employers("siva",23,23000));
		list.add(new Employers("pradeep",24,22000));
		list.add(new Employers("chandu",27,31000));
		list.add(new Employers("manoj",22,20000));
		list.add(new Employers("ramana",23,25000));
		
		System.out.println("Sorted by name ascending order");
		
        Namecompare namecompare = new Namecompare();
        Collections.sort(list, namecompare);
        
        for (Employers employers: list) {
            System.out.println(employers.getName() + " " + employers.getAge());
        }
        
        System.out.println("Sorted by name descending order");
        Collections.reverse(list);
        
        for (Employers employers: list) {
            System.out.println(employers.getName() + " " + employers.getAge());
        }
	
        System.out.println("Sorted by age ascending order");
	
        Collections.sort(list);
    
        for (Employers employers1: list) {
        	System.out.println(employers1.getName() + " " + employers1.getAge());
        }
        
        System.out.println("Sorted by age descending order");
    	
        Collections.reverse(list);
    
        for (Employers employers1: list) {
        	System.out.println(employers1.getName() + " " + employers1.getAge());
        }
	}
}
