package com.mdoyle.Planetarium.DataTypes;

import java.math.BigDecimal;

public class MicroSun extends Quantity{

	public MicroSun(BigDecimal value) {
		super(value);
	}

	@Override
	public String getUnit() {
		return "MICRO_SUN";
	}
}
