package com.mdoyle.Planetarium;

import java.util.List;

public class GasGiantPlanet extends Planet{

	private boolean hasCloudBelt;

	public GasGiantPlanet(String commonName, double distanceFromSun, double siderealDay, double orbitalPeriod,
			int numOfSatellites, List<String> namesOfBiggestSatellies, boolean hasRings, boolean hasCloudBelt) {
		super(commonName, distanceFromSun, siderealDay, orbitalPeriod, numOfSatellites, namesOfBiggestSatellies,
				hasRings);
		this.hasCloudBelt = hasCloudBelt;
	}

	@Override
	public String getCelestialClassification() {
		// TODO Auto-generated method stub
		return "Gas Giant Planet";
	}

	public boolean hasCloudBelt() {
		return hasCloudBelt;
	}

	public void setHasCloudBelt(boolean hasCloudBelt) {
		this.hasCloudBelt = hasCloudBelt;
	}
	
	@Override
	public String getFactualSummary() {
		return super.getFactualSummary() +
				"Has ice caps = " + hasCloudBelt() + "\n";
	}
}
