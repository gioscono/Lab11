package it.polito.tdp.bar.model;

public class Model {
	
	
	
	public Statistiche riceviStatistiche(){
		
		Simulator sim = new Simulator();
		
		int tyme = 0;
		for(int i = 0; i<2000; i++){
			
			int intervallo = (int) ((Math.random()*10)+1);
			int numeroPersone = (int) ((Math.random()*10)+1);
			double tolleranza = Math.random();
			Gruppo g = new Gruppo("G"+i, numeroPersone, tolleranza);
			if(i!=0)
				tyme +=intervallo;
			sim.addGruppo(g, tyme);
		}
		Statistiche s = sim.run();
		return s;

	}

}


