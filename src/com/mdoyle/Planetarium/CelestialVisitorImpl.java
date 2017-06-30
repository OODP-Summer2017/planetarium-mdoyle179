package com.mdoyle.Planetarium;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Implementation of the CelestialVisitor
 */
public class CelestialVisitorImpl extends AstroEntity implements CelestialVisitor {

	private Date nextAppearsOn;
	private Date lastAppearedOn;
	private boolean isPredictable;
	

	public CelestialVisitorImpl(String commonName, Date nextAppearsOn, Date lastAppearedOn, boolean isPredictable) {
		super(commonName);
		this.nextAppearsOn = nextAppearsOn;
		this.lastAppearedOn = lastAppearedOn;
		this.isPredictable = isPredictable;
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
				"Date next appears = " + formattednextAppears + "\n";
	}
	
	@Override
	public Date nextAppearsOn() {
		return nextAppearsOn;
	}

	public void setNextAppearsOn(Date nextAppearsOn) {
		this.nextAppearsOn = nextAppearsOn;
	}

	public Date lastAppearedOn() {
		return lastAppearedOn;
	}

	public void setLastAppearedOn(Date lastAppearedOn) {
		this.lastAppearedOn = lastAppearedOn;
	}

	@Override
	public boolean isPredictable() {
		return isPredictable;
	}
	
	public void setPredictable(boolean isPredictable) {
		this.isPredictable = isPredictable;
	}

}
