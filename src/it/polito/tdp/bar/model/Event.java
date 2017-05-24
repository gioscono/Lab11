package it.polito.tdp.bar.model;

public class Event implements Comparable<Event> {
	
	public enum EventType{
		ARRIVO_CLIENTE,
		LIBERA_TAVOLO,
	};
	
	private int tyme;
	private Gruppo gruppo;
	private Tavolo tavolo;
	private EventType type;
	
	
	
	public Event(int tyme, Gruppo gruppo, EventType type) {
		super();
		this.tyme = tyme;
		this.gruppo = gruppo;
		this.type = type;
	}

	public int getTyme() {
		return tyme;
	}

	public void setTyme(int tyme) {
		this.tyme = tyme;
	}

	public Gruppo getGruppo() {
		return gruppo;
	}

	public void setGruppo(Gruppo gruppo) {
		this.gruppo = gruppo;
	}

	public Tavolo getTavolo() {
		return tavolo;
	}

	public void setTavolo(Tavolo tavolo) {
		this.tavolo = tavolo;
	}

	public EventType getType() {
		return type;
	}


	public void setType(EventType type) {
		this.type = type;
	}

	@Override
	public int compareTo(Event event) {
		return this.tyme-event.getTyme();
	}

}
