/**
 * 
 */
package com.bldea.crorepathiapp.package1;

/**
 * @author hp
 *
 */
public class Candidate {
	 private String name;
	 private int age;
	  private static int amount;
	 private String city;
	 private String state;
	/**
	 * @param name
	 * @param age
	 * @param city
	 * @param state
	 */
	public Candidate(String name, int age, String city, String state) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.state = state;
	}
	/**
	 * @return the amount
	 */
	
	/**
	 * @param amount the amount to set
	 */
	public  static void setAmount(int amt) {
		amount = amt;
	}
	public int getAmount() {
		return amount;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
}