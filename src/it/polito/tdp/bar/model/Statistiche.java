package it.polito.tdp.bar.model;

public class Statistiche {

	private int numeroTotClienti;
	private int numeroClientiSoddisfatti;
	private int numeroClientiInsoddisfatti;
	
	public Statistiche(int numeroTotClienti, int numeroClientiSoddisfatti, int numeroClientiInsoddisfatti) {
		this.numeroTotClienti = numeroTotClienti;
		this.numeroClientiSoddisfatti = numeroClientiSoddisfatti;
		this.numeroClientiInsoddisfatti = numeroClientiInsoddisfatti;
	}

	public int getNumeroTotClienti() {
		return numeroTotClienti;
	}

	public int getNumeroClientiSoddisfatti() {
		return numeroClientiSoddisfatti;
	}

	public int getNumeroClientiInsoddisfatti() {
		return numeroClientiInsoddisfatti;
	}

	
}
