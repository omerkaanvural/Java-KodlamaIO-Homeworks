package project.Entity;

public class Customer {
	private String name;
	private String surname;
	private long tcNo;
	private int birthYear;
	
	public Customer() {}
	
	public Customer(String name, String surname, long tcNo, int birthYear) {
		this.name = name;
		this.surname = surname;
		this.tcNo = tcNo;
		this.birthYear = birthYear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public long getTcNo() {
		return tcNo;
	}
	public void setTcNo(long tcNo) {
		this.tcNo = tcNo;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
}
