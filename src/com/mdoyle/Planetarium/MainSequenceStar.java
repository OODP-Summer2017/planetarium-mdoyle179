package com.mdoyle.Planetarium;

import java.util.List;

public class MainSequenceStar extends Star{
	
	private double relativeMassToSun;

	public MainSequenceStar(String commonName, String constellationDesignation, StarTempType spectralType,
			double apparentMagnitude, double absoluteMagnitude, double distanceFromSun, List<Planet> planets,
			double relativeMassToSun) {
		super(commonName, constellationDesignation, spectralType, apparentMagnitude, absoluteMagnitude, distanceFromSun,
				planets);
		this.relativeMassToSun = relativeMassToSun;
	}

	public double getRelativeMassToSun() {
		return relativeMassToSun;
	}

	public void setRelativeMassToSun(double relativeMassToSun) {
		this.relativeMassToSun = relativeMassToSun;
	}
	
	@Override
	public String getCelestialClassification() {
		return "Main Sequence Star";
	}
	
	
	@Override
	public String getFactualSummary() {
		return super.getFactualSummary() +
				"Relative Mass = " + getRelativeMassToSun() + "\n";
	}
}
