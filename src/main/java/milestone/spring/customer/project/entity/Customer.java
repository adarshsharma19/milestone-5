package milestone.spring.customer.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	private int id;
	private String name;
	private String gender;
	private int age;
	private String preferredfood;
	
	public Customer() {}
	
	
	public Customer(int id, String name, String gender, int age, String preferredfood) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.preferredfood = preferredfood;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPreferredfood() {
		return preferredfood;
	}
	public void setPreferredfood(String preferredfood) {
		this.preferredfood = preferredfood;
	}
	
	
}
