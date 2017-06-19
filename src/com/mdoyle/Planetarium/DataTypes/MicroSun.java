package com.mdoyle.Planetarium.DataTypes;

public class MicroSun extends Quantity{

	public MicroSun(double value) {
		super(value);
	}

	@Override
	public String getUnit() {
		return "MICRO_SUN";
	}
}
