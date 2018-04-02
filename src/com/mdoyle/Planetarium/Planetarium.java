package com.mdoyle.Planetarium;

import java.util.ArrayList;
import java.util.List;

import com.mdoyle.Planetarium.AstroEntityCreators.CelestialVisitorCreator;
import com.mdoyle.Planetarium.AstroEntityCreators.PlanetCreator;
import com.mdoyle.Planetarium.AstroEntityCreators.StarCreator;
import com.mdoyle.Planetarium.CelestialVisitors.CelestialVisitorImpl;
import com.mdoyle.Planetarium.Planets.Planet;
import com.mdoyle.Planetarium.Stars.Star;

/**
 * Driver class for the program. Creates all of the astro entities and prints them to the console.
 */
public class Planetarium {
	
	public static void main(String[] args) {		
		List<AstroEntity> allAstroEntities = new ArrayList<AstroEntity>();
		
		List<Planet> allPlanets = PlanetCreator.createAllPlanets();
		List<Star> allStars = StarCreator.createAllStars();
		List<CelestialVisitorImpl> allCelestialVisitors = CelestialVisitorCreator.createCelestialVisitors();

		for (Planet planet: allPlanets){
			allAstroEntities.add(planet);
		}
		for (Star star: allStars){
			allAstroEntities.add(star);
		}
		for (CelestialVisitorImpl celestialVisitor: allCelestialVisitors){
			allAstroEntities.add(celestialVisitor);
		}

		System.out.println("Planetarium");
		System.out.println("*********************");
		
		// Print results to the console using polymorphism
		for(AstroEntity astroEntity : allAstroEntities) {
			System.out.println(astroEntity.getFactualSummary());
		}
	}
}
