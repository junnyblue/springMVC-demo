package org.june.model.dto;

public class UsersDTO {

	private Integer id;
	private String name;
	private Integer age;

	public UsersDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsersDTO(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "\n\tUsersDTO [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

}
