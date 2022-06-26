package it.polito.tdp.bar.model;

import java.time.Duration;

public class Event implements Comparable<Event>{
	
	public enum EventType {
		ARRIVO_GRUPPO_CLIENTI,
		TAVOLO_LIBERATO
	}
	
	private Duration time;
	private EventType type;
	private int nPersone;
	private Duration durata;
	private double tolleranza;
	private Tavolo tavolo;
	
	public Event(Duration time, EventType type, int nPersone, Duration durata, double tolleranza, Tavolo tavolo) {
		super();
		this.time = time;
		this.type = type;
		this.nPersone = nPersone;
		this.durata = durata;
		this.tolleranza = tolleranza;
		this.tavolo = tavolo;
	}

	public Duration getTime() {
		return time;
	}

	public EventType getType() {
		return type;
	}

	public int getnPersone() {
		return nPersone;
	}

	public Duration getDurata() {
		return durata;
	}

	public double getTolleranza() {
		return tolleranza;
	}

	public Tavolo getTavolo() {
		return tavolo;
	}

	public void setTavolo(Tavolo tavolo) {
		this.tavolo = tavolo;
	}

	@Override
	public int compareTo(Event other) {
		return this.time.compareTo(other.getTime());
	}

}
