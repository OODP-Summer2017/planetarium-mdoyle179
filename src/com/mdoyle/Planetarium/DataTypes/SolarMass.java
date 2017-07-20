package com.mdoyle.Planetarium.DataTypes;

import java.math.BigDecimal;

public class SolarMass extends Quantity implements Convertable{
	
	public SolarMass(BigDecimal value) {
		super(value);
	}

	final BigDecimal EARTH_MASS_CONVERSION_FACTOR = new BigDecimal("333000.0");
	
	@Override
	public Quantity convertTo() {
		//Convert to Earth Mass
		EarthMass earthMass = new EarthMass(super.getValue().multiply(EARTH_MASS_CONVERSION_FACTOR));
		return earthMass;
	}
	
	@Override
	public String getUnit() {
		return "SOLAR_MASS";
	}
}
