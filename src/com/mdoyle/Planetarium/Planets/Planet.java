package com.mdoyle.Planetarium.Planets;

import java.util.List;

import com.mdoyle.Planetarium.AstroEntity;
import com.mdoyle.Planetarium.DataTypes.AstronomicalUnit;
import com.mdoyle.Planetarium.DataTypes.EarthDay;
import com.mdoyle.Planetarium.DataTypes.EarthMass;

/**
 * Defines general characteristics of Planets
 *
 */
public abstract class Planet extends AstroEntity{
	
	private AstronomicalUnit distanceFromSun;
	private EarthDay siderealDay;
	private EarthDay orbitalPeriod;
	private int numOfSatellites;
	private List<String> namesOfBiggestSatellites;
	private boolean hasRings;
	private EarthMass planetMass;
	
	public Planet(String commonName, AstronomicalUnit distanceFromSun, EarthDay siderealDay, EarthDay orbitalPeriod,
			int numOfSatellites, List<String> namesOfBiggestSatellites, boolean hasRings, EarthMass planetMass) {
		super(commonName);
		this.distanceFromSun = distanceFromSun;
		this.siderealDay = siderealDay;
		this.orbitalPeriod = orbitalPeriod;
		this.numOfSatellites = numOfSatellites;
		this.namesOfBiggestSatellites = namesOfBiggestSatellites;
		this.hasRings = hasRings;
		this.planetMass = planetMass;
	}
	
	public String getFactualSummary() {
		StringBuilder satelliteNames = new StringBuilder();
		List<String> satelliteList = getNamesOfBiggestSatellites();
		
		for(int i = 0; i < satelliteList.size(); i++) {
			satelliteNames.append(satelliteList.get(i));
			
			// don't append the comma if it's the last item in the list
			if (i != satelliteList.size()-1){
				satelliteNames.append(", ");
			}
		}		
		
		return  super.getFactualSummary() + 
				"Relative Mass = " + getMass().toString() + " = " + getMass().convertTo() + System.lineSeparator() +
				"Distance from Sun = " + getDistanceFromSun().toString() + System.lineSeparator() + 
				"Sidereal Day = " + getSiderealDay().toString() + System.lineSeparator() + 
				"Orbital Period = " + getOrbitalPeriod().toString() + System.lineSeparator() + 
				"Has rings = " + hasRings() + System.lineSeparator() + 
				"Number of Satellites = " + getNumOfSatellites() + System.lineSeparator() +
				"Largest Satellites = " + satelliteNames + System.lineSeparator();
	}
	
	@Override
	public EarthMass getMass() {
		return planetMass;
	}

	public void setPlanetMass(EarthMass planetMass) {
		this.planetMass = planetMass;
	}
	
	public AstronomicalUnit getDistanceFromSun() {
		return distanceFromSun;
	}
	public void setDistanceFromSun(AstronomicalUnit distanceFromSun) {
		this.distanceFromSun = distanceFromSun;
	}
	public EarthDay getSiderealDay() {
		return siderealDay;
	}
	public void setSiderealDay(EarthDay siderealDay) {
		this.siderealDay = siderealDay;
	}
	public EarthDay getOrbitalPeriod() {
		return orbitalPeriod;
	}
	public void setOrbitalPeriod(EarthDay orbitalPeriod) {
		this.orbitalPeriod = orbitalPeriod;
	}
	public int getNumOfSatellites() {
		return numOfSatellites;
	}
	public void setNumOfSatellites(int numOfSatellites) {
		this.numOfSatellites = numOfSatellites;
	}
	public List<String> getNamesOfBiggestSatellites() {
		return namesOfBiggestSatellites;
	}
	public void setnamesOfBiggestSatellites(List<String> namesOfBiggestSatellites) {
		this.namesOfBiggestSatellites = namesOfBiggestSatellites;
	}
	public boolean hasRings() {
		return hasRings;
	}
	public void setRings(boolean hasRings) {
		this.hasRings = hasRings;
	}
}
