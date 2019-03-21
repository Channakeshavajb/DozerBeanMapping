package com.xworkz.dozer.model;

public class TigerEntity {

	private String name;
    private int age;
    private String address;
    
    public TigerEntity() {
		System.out.println("created\t" + this.getClass().getSimpleName());
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "TigerEntity [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
    
    
}
