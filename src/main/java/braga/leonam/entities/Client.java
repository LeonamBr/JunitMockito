package braga.leonam.entities;

import java.time.Instant;

public class Client {
	
	private String name;
	
	private Integer age;
	
	private Instant birthDate;
	
	public Client() {
	}

	public Client(String name, Integer age, Instant birthDate) {
		this.name = name;
		this.age = age;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Instant getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}
	
}
