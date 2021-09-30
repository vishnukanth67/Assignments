import java.util.*;

class Employee implements Comparable<Employee>{
	
	private String name;
	private int age;
	
	public Employee(String name, int age, int salary) {
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
	public int compareTo(Employee o) {
		return this.age - o.age;
	}
	
}
public class Comparableinterface {

	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("siva",23,23000));
		list.add(new Employee("pradeep",24,22000));
		list.add(new Employee("chandu",27,31000));
		list.add(new Employee("manoj",22,20000));
		list.add(new Employee("ramana",23,25000));
		
		System.out.println("Ascending Order based on age");
		Collections.sort(list);
		
		for(Employee employee: list) {
			System.out.println(employee.getName()+ " " + employee.getAge());
		}
		
		System.out.println("Descending Order based on age");
		Collections.reverse(list);
		
		for(Employee employee1: list) {
			System.out.println(employee1.getName()+ " " + employee1.getAge());
		}

	}

}
