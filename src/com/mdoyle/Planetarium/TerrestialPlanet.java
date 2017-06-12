package com.mdoyle.Planetarium;

import java.util.List;

public class TerrestialPlanet extends Planet{

	private boolean hasIceCap;
	
	public TerrestialPlanet(String commonName, double distanceFromSun, double siderealDay, double orbitalPeriod,
			int numOfSatellites, List<String> namesOfBiggestSatellies, boolean hasRings, boolean hasIceCap) {
		super(commonName, distanceFromSun, siderealDay, orbitalPeriod, numOfSatellites, namesOfBiggestSatellies,
				hasRings);
		this.hasIceCap = hasIceCap;
	}

	public boolean hasIceCap() {
		return hasIceCap;
	}

	public void setIceCap(boolean hasIceCap) {
		this.hasIceCap = hasIceCap;
	}

	@Override
	public String getCelestialClassification() {
		return "Terrestial Planet";
	}

	@Override
	public String getFactualSummary() {
		return super.getFactualSummary() +
			"Has ice caps = " + hasIceCap() + "\n";
	}
	//TODO: Generate equals and hash codes for all classes
}
