package com.mdoyle.Planetarium.DataTypes;

import java.math.BigDecimal;

public abstract class Quantity {

	private BigDecimal value;
	private String unit;
	
	public Quantity(BigDecimal value) {
		this.value = value;
		this.unit = getUnit();
	}
	
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public abstract String getUnit();
	
	public String toString() {
		return this.value + " " + this.unit;
	}
}
