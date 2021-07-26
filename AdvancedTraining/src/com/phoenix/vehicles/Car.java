package com.phoenix.vehicles;

import com.phoenix.annotations.CopyrightInfo;

/*
 * @author md.faisal
 * @version1.0
 * @creation date 12-jul-2021
 */
public class Car {
	@CopyrightInfo(copyright="stl",author="md.faisal")
	private int id;
	private String model;
	private float price;
	
	public static int count;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(int id, String model, float price) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
		count++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", price=" + price + "]";
	}
	//Overriding equals method of object class
	public boolean equals(Object ob) {
		
		if(ob instanceof Car) {//RTTI
		Car car=(Car) ob;
		if(this.id==car.id && 
				this.model.equals(car.model) 
				&& this.price==car.price)
			return true;
		else
			return false;
	}else 
		return false;
	}
		//Overiding hashcode method of object class
		public int hashCode() {
			return id + model.hashCode() + (int)price;
		
	
	}
}
