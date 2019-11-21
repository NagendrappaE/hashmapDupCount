/**
 * 
 */
package com.evolvus.mapwithshop;

/**
 * @author user
 *
 */
public class Shop {

	
	public Shop(String color, String size) {
		super();
		this.color = color;
		this.size = size;
	}

	private String color;
	
	private String size;

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}
	
	
}
