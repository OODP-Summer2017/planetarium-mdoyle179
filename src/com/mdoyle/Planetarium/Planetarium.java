package com.mdoyle.Planetarium;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Planetarium {
	public static void main(String[] args) {
		
		//create object to represent each concrete class
		//invoke getFactualSummary() method, and print results to the console. use polymorphism
		List<AstroEntity> entities = new ArrayList<AstroEntity>();
		
		List<String> earthSatellites = new ArrayList<String>();
		earthSatellites.add("Moon");
		TerrestialPlanet earth = new TerrestialPlanet("Earth", 1.0, 1.0, 365.256, 1, earthSatellites, false, true);
		entities.add(earth);
		
		List<String> jupiterSatellites = new ArrayList<String>();
		jupiterSatellites.add("Ganymede");
		jupiterSatellites.add("Callisto");
		jupiterSatellites.add("IO");
		GasGiantPlanet jupiter = new GasGiantPlanet("Jupiter", 5.203, 0.41, 4332.71, 67, jupiterSatellites, true, true);
		entities.add(jupiter);
	
		List<String> plutoSatellites = new ArrayList<String>();
		plutoSatellites.add("Charon");
		plutoSatellites.add("Nix");
		plutoSatellites.add("Hydra");
		DwarfPlanet pluto = new DwarfPlanet("Pluto", 39.53, 6.386, 90800, 5, plutoSatellites, false, true);
		entities.add(pluto);
		
		List<Planet> algolPlanets = new ArrayList<Planet>();	
		GiantStar algol = new GiantStar("Algol", "Beta Persei", StarTempType.K, 2.12, -.10, 93, algolPlanets, GiantnessType.SUB_GIANT);
		entities.add(algol);
		
		List<Planet> sanduleakPlanets = new ArrayList<Planet>();
		
		Calendar peakBrillianceDate = Calendar.getInstance();
		peakBrillianceDate.set(Calendar.MONTH, Calendar.MAY);
		peakBrillianceDate.set(Calendar.DAY_OF_MONTH, 20);
		peakBrillianceDate.set(Calendar.YEAR, 1987);
		
		SupernovaStar sanduleak = new SupernovaStar("Sanduleak -69 - 202", "Supernova 1987A", StarTempType.B, 2.9, -15.6, 163000.0, sanduleakPlanets, SupernovaType.II, peakBrillianceDate.getTime());
		entities.add(sanduleak);
		
		CelestialVisitorImpl halleysComet = new CelestialVisitorImpl("Halley's Comet");
		entities.add(halleysComet);
		
		List<Planet> sunPlanets = new ArrayList<Planet>();	
		sunPlanets.add(earth);
		sunPlanets.add(jupiter);
		sunPlanets.add(pluto);
		MainSequenceStar sun = new MainSequenceStar("Sun", "Our Sun", StarTempType.G, -26.75, 4.82, 0.0, sunPlanets, 1.0);
		entities.add(sun);

		for(AstroEntity entity : entities) {
			System.out.println(entity.getFactualSummary());
		}
	}
}
