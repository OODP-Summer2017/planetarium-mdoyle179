package com.mdoyle.Planetarium.DataTypes;

public abstract class Quantity {

	private double value;
	private String unit;
	
	public Quantity(double value) {
		this.value = value;
		this.unit = getUnit();
	}
	
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public abstract String getUnit();
	
	public String toString() {
		return this.value + " " + this.unit;
	}
}
