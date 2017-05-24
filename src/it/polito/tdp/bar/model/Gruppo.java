package it.polito.tdp.bar.model;

public class Gruppo {
	
	private String nomeGruppo;
	private int numeroPersone;
	private Tavolo tavolo;
	private double tolleranza;
	
	public Gruppo(String nome, int numeroPersone, double tolleranza2) {
		super();
		this.nomeGruppo = nome;
		this.numeroPersone = numeroPersone;
		this.tolleranza = tolleranza2;
		this.tavolo = null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeGruppo == null) ? 0 : nomeGruppo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gruppo other = (Gruppo) obj;
		if (nomeGruppo == null) {
			if (other.nomeGruppo != null)
				return false;
		} else if (!nomeGruppo.equals(other.nomeGruppo))
			return false;
		return true;
	}

	public int getNumeroPersone() {
		return numeroPersone;
	}

	public void setNumeroPersone(int numeroPersone) {
		this.numeroPersone = numeroPersone;
	}

	public Tavolo getTavolo() {
		return tavolo;
	}

	public void setTavolo(Tavolo tavolo) {
		this.tavolo = tavolo;
	}

	public double getTolleranza() {
		return tolleranza;
	}

	public void setTolleranza(double tolleranza) {
		this.tolleranza = tolleranza;
	}

	public String getNomeGruppo() {
		return nomeGruppo;
	}

	public void setNomeGruppo(String nomeGruppo) {
		this.nomeGruppo = nomeGruppo;
	}

	
	
	
	

}
