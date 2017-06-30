package com.mdoyle.Planetarium.DataTypes;

import java.math.BigDecimal;

public class AstronomicalUnit extends Quantity implements Convertable{

	public AstronomicalUnit(BigDecimal value) {
		super(value);
	}

	final BigDecimal LY_CONVERSION_FACTOR = new BigDecimal("0.000015812281999789");
	
	@Override
	public Quantity convertTo() {
		
		//convertToLightYears from AU
		LightYears ly = new LightYears(super.getValue().multiply(LY_CONVERSION_FACTOR));
		return ly;
	}

	@Override
	public String getUnit() {
		return "AU";
	}
}
