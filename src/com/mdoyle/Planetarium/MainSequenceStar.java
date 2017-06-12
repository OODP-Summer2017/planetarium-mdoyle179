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
		// TODO Auto-generated method stub
		return "Main Sequence Star";
	}
	
//	@Override
//	public String toString() {
//
//	}
	
	@Override
	public String getFactualSummary() {
		return "Name = " + super.getCommonName() + "\n" + 
				"Celestial Classification = " + getCelestialClassification() + "\n" + 
				"Constellation Desgination = " + super.getConstellationDesignation() + "\n" + 
				"Spectral Type = " + super.getSpectralType() + "\n" + 
				"Apparent Magnitude = " + super.getApparentMagnitude() + "\n" + 
				"Absolute Magnitude = " + super.getAbsoluteMagnitude() + "\n" + 
				"Distance from Sun = " + super.getDistanceFromSun() + "\n" +
				"Planets = " + super.getPlanets().get(0).getCommonName() + "\n" + //TODO: fix the way this line prints out
				"Relative Mass = " + getRelativeMassToSun() + "\n";
	}
}
