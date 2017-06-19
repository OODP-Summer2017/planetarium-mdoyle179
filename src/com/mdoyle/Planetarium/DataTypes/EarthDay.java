package com.mdoyle.Planetarium.DataTypes;

public class EarthDay extends Quantity{

	public EarthDay(double value) {
		super(value);
	}

	@Override
	public String getUnit() {
		return "EARTH_DAY";
	}
}
