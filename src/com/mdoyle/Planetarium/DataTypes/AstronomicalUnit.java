package com.mdoyle.Planetarium.DataTypes;

public class AstronomicalUnit extends Quantity implements Convertable{

	public AstronomicalUnit(double value) {
		super(value);
	}

	final double LY_CONVERSION_FACTOR = 0.000015812281999789;
	
	@Override
	public Quantity convertTo() {
		
		//convertToLightYears from AU
		LightYears ly = new LightYears(super.getValue() * LY_CONVERSION_FACTOR);
		return ly;
	}

	@Override
	public String getUnit() {
		return "AU";
	}
}
