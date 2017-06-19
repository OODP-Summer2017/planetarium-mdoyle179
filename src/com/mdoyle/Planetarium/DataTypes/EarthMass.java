package com.mdoyle.Planetarium.DataTypes;

public class EarthMass extends Quantity implements Convertable{

	public EarthMass(double value) {
		super(value);
	}

	final double SOLAR_MASS_CONVERSION_FACTOR = 0.000003003;
	final double MICRO_SUN_CONVERSION_FACTOR = 3.003;
	
	@Override
	public Quantity convertTo() {
		//CONVERT TO MicroSun
		MicroSun microSun = new MicroSun(super.getValue() * MICRO_SUN_CONVERSION_FACTOR);
		return microSun;
	}
	
	@Override
	public String getUnit() {
		return "EARTH_MASS";
	}
}
