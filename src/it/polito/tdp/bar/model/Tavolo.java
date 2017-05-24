package it.polito.tdp.bar.model;

public class Tavolo {

	private Gruppo gruppo;
	private int numeroPosti;
	private boolean occupato;
	
	
	public Tavolo(int numeroPosti) {
		this.numeroPosti = numeroPosti;
		this.occupato = false;
	}
	
	
	public int getNumeroPosti() {
		return numeroPosti;
	}
	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}
	public boolean isOccupato() {
		return occupato;
	}
	public void setOccupato(boolean occupato) {
		this.occupato = occupato;
	}
	
	
	
}
