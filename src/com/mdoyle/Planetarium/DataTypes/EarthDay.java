package com.mdoyle.Planetarium.DataTypes;

import java.math.BigDecimal;

public class EarthDay extends Quantity{

	public EarthDay(BigDecimal value) {
		super(value);
	}

	@Override
	public String getUnit() {
		return "EARTH_DAY";
	}
}
