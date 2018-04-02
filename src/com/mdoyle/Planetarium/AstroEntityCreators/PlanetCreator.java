package com.mdoyle.Planetarium.AstroEntityCreators;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.mdoyle.Planetarium.DataTypes.AstronomicalUnit;
import com.mdoyle.Planetarium.DataTypes.EarthDay;
import com.mdoyle.Planetarium.DataTypes.EarthMass;
import com.mdoyle.Planetarium.Planets.DwarfPlanet;
import com.mdoyle.Planetarium.Planets.GasGiantPlanet;
import com.mdoyle.Planetarium.Planets.Planet;
import com.mdoyle.Planetarium.Planets.TerrestialPlanet;

public class PlanetCreator {
	
	public static List<TerrestialPlanet> createTerrestrialPlanets(){
		List<TerrestialPlanet> terrestialPlanets = new ArrayList<TerrestialPlanet>();
		
		List<String> mercurySatellites = new ArrayList<String>();
		AstronomicalUnit mercuryDistanceFromSun = new AstronomicalUnit(new BigDecimal(".39"));
		EarthDay mercurySiderealDay = new EarthDay(new BigDecimal("58.65"));
		EarthDay mercuryPeriod = new EarthDay(new BigDecimal("87.97"));
		EarthMass mercuryMass = new EarthMass(new BigDecimal(".0553"));
		TerrestialPlanet mercury = new TerrestialPlanet("Mercury", mercuryDistanceFromSun, mercurySiderealDay, mercuryPeriod, 0, mercurySatellites, false, false, mercuryMass);
		
		terrestialPlanets.add(mercury);
		
		List<String> venusSatellites = new ArrayList<String>();
		AstronomicalUnit venusDistanceFromSun = new AstronomicalUnit(new BigDecimal(".72"));
		EarthDay venusSiderealDay = new EarthDay(new BigDecimal("243.1"));
		EarthDay venusPeriod = new EarthDay(new BigDecimal("224.70"));
		EarthMass venusMass = new EarthMass(new BigDecimal(".815"));
		TerrestialPlanet venus = new TerrestialPlanet("Venus", venusDistanceFromSun, venusSiderealDay, venusPeriod, 0, venusSatellites, false, false, venusMass);
		
		terrestialPlanets.add(venus);
		
		List<String> earthSatellites = new ArrayList<String>();
		earthSatellites.add("Moon");
		AstronomicalUnit earthDistanceFromSun = new AstronomicalUnit(new BigDecimal("1.0"));
		EarthDay earthSiderealDay = new EarthDay(new BigDecimal("1.0"));
		EarthDay earthPeriod = new EarthDay(new BigDecimal("365.256"));
		EarthMass earthMass = new EarthMass(new BigDecimal("1.0"));
		TerrestialPlanet earth = new TerrestialPlanet("Earth", earthDistanceFromSun, earthSiderealDay, earthPeriod, 1, earthSatellites, false, true, earthMass);
		
		terrestialPlanets.add(earth);
		
		List<String> marsSatellites = new ArrayList<String>();
		marsSatellites.add("Phobos");
		marsSatellites.add("Deimos");
		AstronomicalUnit marsDistanceFromSun = new AstronomicalUnit(new BigDecimal("1.524"));
		EarthDay marsSiderealDay = new EarthDay(new BigDecimal("1.026"));
		EarthDay marsPeriod = new EarthDay(new BigDecimal("687.0"));
		EarthMass marsMass = new EarthMass(new BigDecimal(".107"));
		TerrestialPlanet mars = new TerrestialPlanet("Mars", marsDistanceFromSun, marsSiderealDay, marsPeriod, 2, marsSatellites, false, true, marsMass);
		
		terrestialPlanets.add(mars);
		return terrestialPlanets;
	}
	
	public static List<GasGiantPlanet> createGasGiantPlanets(){
		List<GasGiantPlanet> gasGiantPlanets = new ArrayList<GasGiantPlanet>();
		
		List<String> jupiterSatellites = new ArrayList<String>();
		jupiterSatellites.add("Ganymede");
		jupiterSatellites.add("Callisto");
		jupiterSatellites.add("IO");
		AstronomicalUnit jupiterDistanceFromSun = new AstronomicalUnit(new BigDecimal("5.203"));
		EarthDay jupiterSiderealDay = new EarthDay(new BigDecimal("0.41"));
		EarthDay jupiterPeriod = new EarthDay(new BigDecimal("4332.71"));
		EarthMass jupiterMass = new EarthMass(new BigDecimal("317.8"));
		GasGiantPlanet jupiter = new GasGiantPlanet("Jupiter", jupiterDistanceFromSun, jupiterSiderealDay, jupiterPeriod, 67, jupiterSatellites, true, true, jupiterMass);
	
		gasGiantPlanets.add(jupiter);
		
		List<String> saturnSatellites = new ArrayList<String>();
		saturnSatellites.add("Titan");
		saturnSatellites.add("Rhea");
		saturnSatellites.add("Iapetus");
		AstronomicalUnit saturnDistanceFromSun = new AstronomicalUnit(new BigDecimal("9.540"));
		EarthDay saturnSiderealDay = new EarthDay(new BigDecimal("0.426"));
		EarthDay saturnPeriod = new EarthDay(new BigDecimal("10759.5"));
		EarthMass saturnMass = new EarthMass(new BigDecimal("95.2"));
		GasGiantPlanet saturn = new GasGiantPlanet("Saturn", saturnDistanceFromSun, saturnSiderealDay, saturnPeriod, 62, saturnSatellites, true, true, saturnMass);
		
		gasGiantPlanets.add(saturn);
		
		List<String> uranusSatellites = new ArrayList<String>();
		uranusSatellites.add("Titania");
		uranusSatellites.add("Oberon");
		uranusSatellites.add("Umbriel");
		AstronomicalUnit uranusDistanceFromSun = new AstronomicalUnit(new BigDecimal("19.19"));
		EarthDay uranusSiderealDay = new EarthDay(new BigDecimal("0.717"));
		EarthDay uranusPeriod = new EarthDay(new BigDecimal("30685"));
		EarthMass uranusMass = new EarthMass(new BigDecimal("14.5"));
		GasGiantPlanet uranus = new GasGiantPlanet("Uranus", uranusDistanceFromSun, uranusSiderealDay, uranusPeriod, 27, uranusSatellites, true, false, uranusMass);
		
		gasGiantPlanets.add(uranus);
		
		List<String> neptuneSatellites = new ArrayList<String>();
		neptuneSatellites.add("Triton");
		neptuneSatellites.add("Proteus");
		neptuneSatellites.add("Nereid");
		AstronomicalUnit neptuneDistanceFromSun = new AstronomicalUnit(new BigDecimal("30.06"));
		EarthDay neptuneSiderealDay = new EarthDay(new BigDecimal("0.671"));
		EarthDay neptunePeriod = new EarthDay(new BigDecimal("60190.0"));
		EarthMass neptuneMass = new EarthMass(new BigDecimal("17.1"));
		GasGiantPlanet neptune = new GasGiantPlanet("Neptune", neptuneDistanceFromSun, neptuneSiderealDay, neptunePeriod, 14, neptuneSatellites, true, false, neptuneMass);

		gasGiantPlanets.add(neptune);
		
		return gasGiantPlanets;
	}
	
	public static List<DwarfPlanet> createDwarfPlanets() {
		List<DwarfPlanet> dwarfPlanets = new ArrayList<DwarfPlanet>();
		List<String> plutoSatellites = new ArrayList<String>();
		plutoSatellites.add("Charon");
		plutoSatellites.add("Nix");
		plutoSatellites.add("Hydra");
		AstronomicalUnit plutoDistanceFromSun = new AstronomicalUnit(new BigDecimal("39.53"));
		EarthDay plutoSiderealDay = new EarthDay(new BigDecimal("6.386"));
		EarthDay plutoPeriod = new EarthDay(new BigDecimal("90800"));
		EarthMass plutoMass = new EarthMass(new BigDecimal(".0022"));
		DwarfPlanet pluto = new DwarfPlanet("Pluto", plutoDistanceFromSun, plutoSiderealDay, plutoPeriod, 5, plutoSatellites, false, false, plutoMass);
		
		dwarfPlanets.add(pluto);
		
		return dwarfPlanets;
	}
	
	public static List<Planet> createAllPlanets() {
		List<Planet> allPlanets = new ArrayList<Planet>();
		
		List<TerrestialPlanet> terrestrialPlanets = PlanetCreator.createTerrestrialPlanets();
		List<GasGiantPlanet> gasPlanets = PlanetCreator.createGasGiantPlanets();
		List<DwarfPlanet> dwarfPlanets = PlanetCreator.createDwarfPlanets();

		for (Planet terrestrialPlanet: terrestrialPlanets) {
			allPlanets.add(terrestrialPlanet);
		}
		for (Planet gasPlanet: gasPlanets) {
			allPlanets.add(gasPlanet);
		}
		for (Planet dwarfPlanet: dwarfPlanets) {
			allPlanets.add(dwarfPlanet);
		}
		return allPlanets;
	}
}
