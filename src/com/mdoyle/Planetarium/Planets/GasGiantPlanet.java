package com.mdoyle.Planetarium.Planets;

import java.util.List;

import com.mdoyle.Planetarium.DataTypes.AstronomicalUnit;
import com.mdoyle.Planetarium.DataTypes.EarthDay;
import com.mdoyle.Planetarium.DataTypes.EarthMass;

public class GasGiantPlanet extends Planet{

	private boolean hasCloudBelt;

	public GasGiantPlanet(String commonName, AstronomicalUnit distanceFromSun, EarthDay siderealDay, EarthDay orbitalPeriod,
			int numOfSatellites, List<String> namesOfBiggestSatellies, boolean hasRings, boolean hasCloudBelt, EarthMass mass) {
		super(commonName, distanceFromSun, siderealDay, orbitalPeriod, numOfSatellites, namesOfBiggestSatellies,
				hasRings, mass);
		this.hasCloudBelt = hasCloudBelt;
	}

	@Override
	public String getCelestialClassification() {
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
				"Has cloud belts = " + hasCloudBelt() + System.lineSeparator();
	}
}
