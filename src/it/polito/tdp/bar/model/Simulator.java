package it.polito.tdp.bar.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

import it.polito.tdp.bar.model.Event.EventType;

public class Simulator {
	
	private PriorityQueue<Event> queue;
	
	private int numeroTotClienti;
	private int numeroClientiSoddisfatti;
	private int numeroClientiInsoddisfatti;
	
	private List<Tavolo> tavoli;
	
	public Simulator(){
		tavoli = new ArrayList<Tavolo>();
		this.queue = new PriorityQueue<>();
		
		Tavolo t1 = new Tavolo("A1",10);
		tavoli.add(t1);
		Tavolo t2 = new Tavolo("A2", 10);
		tavoli.add(t2);
		Tavolo t3 = new Tavolo("B1",8);
		tavoli.add(t3);
		Tavolo t4 = new Tavolo("B2",8);
		tavoli.add(t4);
		Tavolo t5 = new Tavolo("B3",8);
		tavoli.add(t5);
		Tavolo t6 = new Tavolo("B4",8);
		tavoli.add(t6);
		Tavolo t7 = new Tavolo("C1", 6);
		tavoli.add(t7);
		Tavolo t8 = new Tavolo("C2", 6);
		tavoli.add(t8);
		Tavolo t9 = new Tavolo("C3", 6);
		tavoli.add(t9);
		Tavolo t10 = new Tavolo("C4", 6);
		tavoli.add(t10);
		Tavolo t11 = new Tavolo("D1", 4);
		tavoli.add(t11);
		Tavolo t12 = new Tavolo("D2", 4);
		tavoli.add(t12);
		Tavolo t13 = new Tavolo("D3", 4);
		tavoli.add(t13);
		Tavolo t14 = new Tavolo("D4", 4);
		tavoli.add(t14);
		Tavolo t15 = new Tavolo("D5", 4);
		tavoli.add(t15);
		Collections.reverse(tavoli);
		
		
	}
	public void addGruppo(Gruppo g, int tyme) {
		System.out.println("CREATO GRUPPO: "+g.getNomeGruppo()+" al tempo: "+tyme);
		Event e = new Event(tyme, g, EventType.ARRIVO_CLIENTE);
		queue.add(e);
		
	}
	public Statistiche run() {
		
		while(!queue.isEmpty()){
			
			Event e = queue.poll();
			switch(e.getType()){
			
			case ARRIVO_CLIENTE:
				this.cercaTavolo(e);				
				break;
			
			case LIBERA_TAVOLO:
				this.liberaTavolo(e);
				break;
			
			}
			
		}
		Statistiche s = new Statistiche(numeroTotClienti, numeroClientiSoddisfatti, numeroClientiInsoddisfatti);
		return s;
	}
	private void liberaTavolo(Event e) {
		if(e.getGruppo().getTavolo()!= null)
			e.getTavolo().setOccupato(false);
		
	}
	private void cercaTavolo(Event e) {
		
		Gruppo gruppo = e.getGruppo();
		for(Tavolo t : tavoli){
			if(t.getNumeroPosti()==gruppo.getNumeroPersone() && t.isOccupato()==false){
				System.out.println("Gruppo "+gruppo.getNomeGruppo() +"occupa "+t.getNomeTavolo());
				numeroTotClienti++;
				numeroClientiSoddisfatti++;
				t.setOccupato(true);
				gruppo.setTavolo(t);
				int durata = (int) (60*(1+Math.random()));
				Event ev = new Event(e.getTyme()+durata, gruppo, EventType.LIBERA_TAVOLO);
				queue.add(ev);
				break;
			}
						
			else{ 
				if(t.getNumeroPosti()>gruppo.getNumeroPersone() && t.isOccupato()==false){
					double ris = (double)gruppo.getNumeroPersone()/t.getNumeroPosti();
					if(ris>0.5){
						System.out.println("Gruppo "+gruppo.getNomeGruppo() +"occupa "+t.getNomeTavolo());
						numeroTotClienti++;
						numeroClientiSoddisfatti++;
						t.setOccupato(true);
						gruppo.setTavolo(t);
						int durata = (int) (60*(1+Math.random()));
						Event ev = new Event(e.getTyme()+durata, gruppo, EventType.LIBERA_TAVOLO);
						queue.add(ev);
						break;
					}
					else{
						double random = Math.random();
						if(random<gruppo.getTolleranza()){
							System.out.println("Gruppo "+gruppo.getNomeGruppo()+" al bancone");
							numeroTotClienti++;
							numeroClientiSoddisfatti++;
							break;
						}
						else{
							numeroClientiInsoddisfatti++;
							System.out.println("Gruppo "+gruppo.getNomeGruppo()+" insoddisfatto");
							break;
						}
					}
				}
			}
			
		}
			
		
		
	}
}
