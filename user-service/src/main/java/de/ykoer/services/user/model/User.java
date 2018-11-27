package de.ykoer.services.user.model;

public class User {

	private Long id;
	private String firstName;
	private String lasteName;

	public User() {

	}
	
	public User(String firstName, String lasteName) {
		this.firstName = firstName;
		this.lasteName = lasteName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLasteName() {
		return lasteName;
	}

	public void setLasteName(String lasteName) {
		this.lasteName = lasteName;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lasteName='" + lasteName + '\'' +
				'}';
	}
}
