package com.mdoyle.Planetarium.DataTypes;

import java.math.BigDecimal;

public class EarthMass extends Quantity implements Convertable{

	public EarthMass(BigDecimal value) {
		super(value);
	}

	final BigDecimal SOLAR_MASS_CONVERSION_FACTOR = new BigDecimal("0.000003003");
	final BigDecimal MICRO_SUN_CONVERSION_FACTOR = new BigDecimal("3.003");
	
	@Override
	public Quantity convertTo() {
		//CONVERT TO MicroSun
		MicroSun microSun = new MicroSun(super.getValue().multiply(MICRO_SUN_CONVERSION_FACTOR));
		return microSun;
	}
	
	@Override
	public String getUnit() {
		return "EARTH_MASS";
	}
}
