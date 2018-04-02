package com.mdoyle.Planetarium.Planets;

import java.util.List;

import com.mdoyle.Planetarium.DataTypes.AstronomicalUnit;
import com.mdoyle.Planetarium.DataTypes.EarthDay;
import com.mdoyle.Planetarium.DataTypes.EarthMass;

public class TerrestialPlanet extends Planet{

	private boolean hasIceCap;
	
	public TerrestialPlanet(String commonName, AstronomicalUnit distanceFromSun, EarthDay siderealDay, EarthDay orbitalPeriod,
			int numOfSatellites, List<String> namesOfBiggestSatellies, boolean hasRings, boolean hasIceCap, EarthMass mass) {
		super(commonName, distanceFromSun, siderealDay, orbitalPeriod, numOfSatellites, namesOfBiggestSatellies,
				hasRings, mass);
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
			"Has ice caps = " + hasIceCap() + System.lineSeparator();
	}
}
