package com.mdoyle.Planetarium.DataTypes;

import java.math.BigDecimal;

public class LightYears extends Quantity implements Convertable{

	public LightYears(BigDecimal value) {
		super(value);
	}

	final BigDecimal LY_CONVERSION_FACTOR = new BigDecimal("0.000015812281999789");
	
	@Override
	public Quantity convertTo() {
		//ConvertToAU from Lightyears
		AstronomicalUnit au = new AstronomicalUnit(super.getValue().multiply(LY_CONVERSION_FACTOR));
		return au;
	}

	@Override
	public String getUnit() {
		return "ly";
	}
}
