package com.mdoyle.Planetarium;

import java.util.List;

import com.mdoyle.Planetarium.DataTypes.AstronomicalUnit;
import com.mdoyle.Planetarium.DataTypes.EarthDay;
import com.mdoyle.Planetarium.DataTypes.EarthMass;

public class DwarfPlanet extends Planet{
	private boolean hasIrregularShape;

	public DwarfPlanet(String commonName, AstronomicalUnit distanceFromSun, EarthDay siderealDay, EarthDay orbitalPeriod,
			int numOfSatellites, List<String> namesOfBiggestSatellies, boolean hasRings, boolean hasIrregularShape, EarthMass mass) {
		super(commonName, distanceFromSun, siderealDay, orbitalPeriod, numOfSatellites, namesOfBiggestSatellies,
				hasRings, mass);
		this.hasIrregularShape = hasIrregularShape;
	}

	@Override
	public String getCelestialClassification() {
		return "Dwarf Planet";
	}
	
	@Override
	public String getFactualSummary() {
		return super.getFactualSummary() +
				"Has Irregular Shape = " + hasIrregularShape() + System.lineSeparator();
	}
	
	public boolean hasIrregularShape() {
		return hasIrregularShape;
	}

	public void setIrregularShape(boolean hasIrregularShape) {
		this.hasIrregularShape = hasIrregularShape;
	}

}
