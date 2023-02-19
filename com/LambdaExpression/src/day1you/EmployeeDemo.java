package day1you;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDemo {
	private int id;
	private String name;
	private int age;
	private long salary;
	
	public EmployeeDemo(int id, String name, int age, long salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the salary
	 */
	public long getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDemo [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "\n";
	}
	
	
	public static void main(String[] args) {
		List<EmployeeDemo> list = new ArrayList<>();
		list.add(new EmployeeDemo(1,"Rajesh",26,35000));
		list.add(new EmployeeDemo(5,"Suresh",24,15000));
		list.add(new EmployeeDemo(2,"Ramesh",32,25000));
		list.add(new EmployeeDemo(4,"Roopesh",23,45000));
		list.add(new EmployeeDemo(3,"Gynanesh",21,60000));
		
		Collections.sort(list, ( o1,  o2)-> {
			// TODO Auto-generated method stub
			return (int) (o1.getSalary() - o2.getSalary());
		});

		System.out.println(list);
		
		Collections.sort(list, (o1,o2) ->  o1.getAge()-o2.getAge());
		System.out.println(list);
		
		Collections.sort(list, (o1,o2)-> o1.getName().compareTo(o2.getName()));
		System.out.println(list);
		
	}
	
}

