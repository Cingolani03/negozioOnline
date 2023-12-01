package org.generation.italy;

class Prodotto {
	private String codice,descrizione;
	private float prezzo,sconto,unitàAcquistate;
	private float quantitàDisponibile;
	public Prodotto(String codice, String descrizione,float sconto, float prezzo,int quantitàDisponibile) {
		super();
		this.codice = codice;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.sconto = sconto;
		this.quantitàDisponibile = quantitàDisponibile;
		this.unitàAcquistate=0;
	}
	public float prezzoScontato() {
		return prezzo-(prezzo*(sconto/100));
	}
	
	public float getUnitàAcquistate() {
		return unitàAcquistate;
	}
	public void setUnitàAcquistate(float unità) {
		this.unitàAcquistate = unità;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		if(!codice.isEmpty())
		this.codice = codice;
	}
	public String getDecsizione() {
		return descrizione;
	}
	public void setDecsizione(String decsizione) {
		if(!descrizione.isEmpty())
		this.descrizione = decsizione;
	}
	public float getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(float prezzo) {
		if(prezzo>0)
		this.prezzo = prezzo;
	}
	public float getSconto() {
		return sconto;
	}
	public void setSconto(float sconto) {
		if(sconto>0 && sconto<100)
		this.sconto = sconto;
	}
	public float getQuantitàDisponibile() {
		return quantitàDisponibile;
	}
	public void setQuantitàDisponibile(float unità) {
		if(quantitàDisponibile>0)
		this.quantitàDisponibile -= unità;
	}
	
	
}
