package com.mdoyle.Planetarium.DataTypes;

public class SolarMass extends Quantity implements Convertable{
	
	public SolarMass(double value) {
		super(value);
	}

	final double EARTH_MASS_CONVERSION_FACTOR = 333000.0;
	
	@Override
	public Quantity convertTo() {
		//Convert to Earth Mass
		EarthMass earthMass = new EarthMass(super.getValue() * EARTH_MASS_CONVERSION_FACTOR);
		return earthMass;
	}
	
	@Override
	public String getUnit() {
		return "SOLAR_MASS";
	}
}
