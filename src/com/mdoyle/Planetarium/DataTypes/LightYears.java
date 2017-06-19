package com.mdoyle.Planetarium.DataTypes;

public class LightYears extends Quantity implements Convertable{

	public LightYears(double value) {
		super(value);
	}

	final double LY_CONVERSION_FACTOR = 0.000015812281999789;
	
	@Override
	public Quantity convertTo() {
		//ConvertToAU from Lightyears
		AstronomicalUnit au = new AstronomicalUnit(super.getValue() * LY_CONVERSION_FACTOR);
		return au;
	}

	@Override
	public String getUnit() {
		return "ly";
	}
}
