package com.mdoyle.Planetarium;

import java.util.List;

public class DwarfPlanet extends Planet{
	private boolean hasIrregularShape;

	public DwarfPlanet(String commonName, double distanceFromSun, double siderealDay, double orbitalPeriod,
			int numOfSatellites, List<String> namesOfBiggestSatellies, boolean hasRings, boolean hasIrregularShape) {
		super(commonName, distanceFromSun, siderealDay, orbitalPeriod, numOfSatellites, namesOfBiggestSatellies,
				hasRings);
		this.hasIrregularShape = hasIrregularShape;
	}

	@Override
	public String getCelestialClassification() {
		return "Dwarf Planet";
	}
	
	@Override
	public String getFactualSummary() {
		return super.getFactualSummary() +
				"Has Irregular Shape = " + hasIrregularShape() + "\n";
	}
	
	public boolean hasIrregularShape() {
		return hasIrregularShape;
	}

	public void setIrregularShape(boolean hasIrregularShape) {
		this.hasIrregularShape = hasIrregularShape;
	}

}
