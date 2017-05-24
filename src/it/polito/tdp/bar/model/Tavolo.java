package it.polito.tdp.bar.model;

public class Tavolo {

	private Gruppo gruppo;
	private String nomeTavolo;
	private int numeroPosti;
	private boolean occupato;
	
	
	public Tavolo(String nome, int numeroPosti) {
		this.nomeTavolo = nome;
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


	public Gruppo getGruppo() {
		return gruppo;
	}


	public void setGruppo(Gruppo gruppo) {
		this.gruppo = gruppo;
	}


	public String getNomeTavolo() {
		return nomeTavolo;
	}


	public void setNomeTavolo(String nomeTavolo) {
		this.nomeTavolo = nomeTavolo;
	}
	
	
	
}
