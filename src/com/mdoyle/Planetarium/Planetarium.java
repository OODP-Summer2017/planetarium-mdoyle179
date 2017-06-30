package com.mdoyle.Planetarium;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Driver class for the program. Creates instances of all the concrete classes
 */
public class Planetarium {
	public static void main(String[] args) {
		
		// List of all the astronomical entities
		List<AstroEntity> entities = new ArrayList<AstroEntity>();

		// Terrestial Planets
		List<String> mercurySatellites = new ArrayList<String>();
		TerrestialPlanet mercury = new TerrestialPlanet("Mercury", .39, 58.65, 87.97, 0, mercurySatellites, false, false);
				
		List<String> venusSatellites = new ArrayList<String>();
		TerrestialPlanet venus = new TerrestialPlanet("Venus", .72, 243.1, 224.70, 0, venusSatellites, false, false);
		
		List<String> earthSatellites = new ArrayList<String>();
		earthSatellites.add("Moon");
		TerrestialPlanet earth = new TerrestialPlanet("Earth", 1.0, 1.0, 365.256, 1, earthSatellites, false, true);
		
		List<String> marsSatellites = new ArrayList<String>();
		marsSatellites.add("Phobos");
		marsSatellites.add("Deimos");
		TerrestialPlanet mars = new TerrestialPlanet("Mars", 1.524, 1.026, 687, 2, marsSatellites, false, true);
		
		// Gas Giant Planets
		List<String> jupiterSatellites = new ArrayList<String>();
		jupiterSatellites.add("Ganymede");
		jupiterSatellites.add("Callisto");
		jupiterSatellites.add("IO");
		GasGiantPlanet jupiter = new GasGiantPlanet("Jupiter", 5.203, 0.41, 4332.71, 67, jupiterSatellites, true, true);
	
		List<String> saturnSatellites = new ArrayList<String>();
		saturnSatellites.add("Titan");
		saturnSatellites.add("Rhea");
		saturnSatellites.add("Iapetus");
		GasGiantPlanet saturn = new GasGiantPlanet("Saturn", 9.540, 0.426, 10759.5, 62, saturnSatellites, true, true);
		
		List<String> uranusSatellites = new ArrayList<String>();
		uranusSatellites.add("Titania");
		uranusSatellites.add("Oberon");
		uranusSatellites.add("Umbriel");
		GasGiantPlanet uranus = new GasGiantPlanet("Uranus", 19.19, 0.717, 30685, 27, uranusSatellites, true, false);
		
		List<String> neptuneSatellites = new ArrayList<String>();
		neptuneSatellites.add("Triton");
		neptuneSatellites.add("Proteus");
		neptuneSatellites.add("Nereid");
		GasGiantPlanet neptune = new GasGiantPlanet("Neptune", 30.06, 0.671, 60190, 14, neptuneSatellites, true, false);
		
		// Dwarf Planets
		List<String> plutoSatellites = new ArrayList<String>();
		plutoSatellites.add("Charon");
		plutoSatellites.add("Nix");
		plutoSatellites.add("Hydra");
		DwarfPlanet pluto = new DwarfPlanet("Pluto", 39.53, 6.386, 90800, 5, plutoSatellites, false, false);
		
		// Main Sequence Stars
		List<Planet> sunPlanets = new ArrayList<Planet>();	
		sunPlanets.add(mercury);
		sunPlanets.add(venus);
		sunPlanets.add(earth);
		sunPlanets.add(mars);
		sunPlanets.add(jupiter);
		sunPlanets.add(saturn);
		sunPlanets.add(uranus);
		sunPlanets.add(neptune);
		sunPlanets.add(pluto);
		MainSequenceStar sun = new MainSequenceStar("Sun", "Our Sun", StarTempType.G, -26.75, 4.82, 0.0, sunPlanets, 1.0);
		
		// Giant Stars
		List<Planet> algolPlanets = new ArrayList<Planet>();	
		GiantStar algol = new GiantStar("Algol", "Beta Persei", StarTempType.K, 2.12, -.10, 93, algolPlanets, GiantnessType.SUB_GIANT);
		
		// Supernova Stars
		List<Planet> sanduleakPlanets = new ArrayList<Planet>();
		Calendar peakBrillianceDate = Calendar.getInstance();
		peakBrillianceDate.set(Calendar.MONTH, Calendar.MAY);
		peakBrillianceDate.set(Calendar.DAY_OF_MONTH, 20);
		peakBrillianceDate.set(Calendar.YEAR, 1987);
		SupernovaStar sanduleak = new SupernovaStar("Sanduleak - 69 - 202", "Supernova 1987A", StarTempType.B, 2.9, -15.6, 163000.0, sanduleakPlanets, SupernovaType.II, peakBrillianceDate.getTime());
		
		// Celestial Visitors
		Calendar nextAppearsOn = Calendar.getInstance();
		nextAppearsOn.set(Calendar.MONTH, Calendar.JANUARY);
		nextAppearsOn.set(Calendar.DAY_OF_MONTH, 1);
		nextAppearsOn.set(Calendar.YEAR, 1986);	
		
		Calendar lastAppearedOn = Calendar.getInstance();
		lastAppearedOn.set(Calendar.MONTH, Calendar.JANUARY);
		lastAppearedOn.set(Calendar.DAY_OF_MONTH, 1);
		lastAppearedOn.set(Calendar.YEAR, 2061);		
		CelestialVisitorImpl halleysComet = new CelestialVisitorImpl("Halley's Comet", nextAppearsOn.getTime(), lastAppearedOn.getTime(), true);		

		//Add the entities to the list
		entities.add(sun);
		entities.add(mercury);
		entities.add(venus);
		entities.add(earth);
		entities.add(mars);
		entities.add(jupiter);
		entities.add(saturn);
		entities.add(uranus);
		entities.add(neptune);
		entities.add(pluto);
		entities.add(algol);
		entities.add(sanduleak);
		entities.add(halleysComet);
		
		System.out.println("Planetarium");
		System.out.println("*********************");
		// Print results to the console using polymorphism
		for(AstroEntity entity : entities) {
			System.out.println(entity.getFactualSummary());
		}
	}
}
