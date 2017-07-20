package com.mdoyle.Planetarium;

import java.math.BigDecimal;
import java.util.List;

import com.mdoyle.Planetarium.DataTypes.LightYears;
import com.mdoyle.Planetarium.DataTypes.SolarMass;

public class GiantStar extends Star{

	private GiantnessType giantness;

	public GiantStar(String commonName, String constellationDesignation, StarTempType spectralType,
			BigDecimal apparentMagnitude, BigDecimal absoluteMagnitude, LightYears distanceFromSun, List<Planet> planets,
			GiantnessType giantness, SolarMass starMass) {
		super(commonName, constellationDesignation, spectralType, apparentMagnitude, absoluteMagnitude, distanceFromSun,
				planets, starMass);
		this.giantness = giantness;
	}

	@Override
	public String getCelestialClassification() {
		return "Giant Star";
	}
	
	@Override
	public String getFactualSummary() {
		return super.getFactualSummary() +
				"Giantness = " + getGiantness() + System.lineSeparator();
	}
	
	public GiantnessType getGiantness() {
		return giantness;
	}

	public void setGiantness(GiantnessType giantness) {
		this.giantness = giantness;
	}

}
