package com.mdoyle.Planetarium;

import java.math.BigDecimal;
import java.util.List;

import com.mdoyle.Planetarium.DataTypes.LightYears;
import com.mdoyle.Planetarium.DataTypes.SolarMass;

public class MainSequenceStar extends Star{
	
	private BigDecimal relativeMassToSun;

	public MainSequenceStar(String commonName, String constellationDesignation, StarTempType spectralType,
			BigDecimal apparentMagnitude, BigDecimal absoluteMagnitude, LightYears distanceFromSun, List<Planet> planets,
			BigDecimal relativeMassToSun, SolarMass starMass) {
		super(commonName, constellationDesignation, spectralType, apparentMagnitude, absoluteMagnitude, distanceFromSun,
				planets, starMass);
		this.relativeMassToSun = relativeMassToSun;
	}

	public BigDecimal getRelativeMassToSun() {
		return relativeMassToSun;
	}

	public void setRelativeMassToSun(BigDecimal relativeMassToSun) {
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
