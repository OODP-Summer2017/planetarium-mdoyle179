package com.mdoyle.Planetarium;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Implementation of the CelestialVisitor
 */
public class CelestialVisitorImpl extends AstroEntity implements CelestialVisitor {
	
	public CelestialVisitorImpl(String commonName) {
		super(commonName);
	}

	@Override
	public Date lastAppearedOn() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.MONTH, Calendar.JANUARY);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.YEAR, 1986);		
		return calendar.getTime();
	}

	@Override
	public Date nextAppearsOn() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.MONTH, Calendar.JANUARY);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.YEAR, 2061);	
		return calendar.getTime();
	}

	@Override
	public boolean isPredictable() {
		return true;
	}

	@Override
	public String getCelestialClassification() {
		return "Celestial Visitor";
	}

	@Override
	public String getFactualSummary() {
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM d, yyyy");
		Date lastAppeared = lastAppearedOn();
		Date nextAppears = nextAppearsOn();
		String formattedlastAppeared = sdf.format(lastAppeared.getTime());
		String formattednextAppears = sdf.format(nextAppears.getTime());
		
		return super.getFactualSummary() +
				"Is predictable = " + isPredictable() + "\n" + 
				"Date last appeared = " + formattedlastAppeared + "\n" +
				"Date next appeares = " + formattednextAppears + "\n";
	}
}
