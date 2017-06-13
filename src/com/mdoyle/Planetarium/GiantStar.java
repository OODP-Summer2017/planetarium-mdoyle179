package com.mdoyle.Planetarium;

import java.util.List;

public class GiantStar extends Star{

	private GiantnessType giantness;

	public GiantStar(String commonName, String constellationDesignation, StarTempType spectralType,
			double apparentMagnitude, double absoluteMagnitude, double distanceFromSun, List<Planet> planets,
			GiantnessType giantness) {
		super(commonName, constellationDesignation, spectralType, apparentMagnitude, absoluteMagnitude, distanceFromSun,
				planets);
		this.giantness = giantness;
	}

	@Override
	public String getCelestialClassification() {
		return "Giant Star";
	}
	
	@Override
	public String getFactualSummary() {
		return super.getFactualSummary() +
				"Giantness = " + getGiantness() + "\n";
	}
	
	public GiantnessType getGiantness() {
		return giantness;
	}

	public void setGiantness(GiantnessType giantness) {
		this.giantness = giantness;
	}

}
