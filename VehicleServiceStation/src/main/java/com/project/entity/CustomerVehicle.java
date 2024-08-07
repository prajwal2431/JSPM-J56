package com.project.entity;

public class CustomerVehicle {
	
	private String vehicle_number;
	private int customer_id;
	private int vehicle_id;
	
	public CustomerVehicle() {
		
		
	}
	
	public CustomerVehicle(String vehicle_number, int customer_id, int vehicle_id) {
		super();
		this.vehicle_number = vehicle_number;
		this.customer_id = customer_id;
		this.vehicle_id = vehicle_id;
	}

	public String getVehicle_number() {
		return vehicle_number;
	}

	public void setVehicle_number(String vehicle_number) {
		this.vehicle_number = vehicle_number;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}

	@Override
	public String toString() {
		return "CustomerVehicle [vehicle_number=" + vehicle_number + ", customer_id=" + customer_id + ", vehicle_id="
				+ vehicle_id + "]";
	}
	
}
