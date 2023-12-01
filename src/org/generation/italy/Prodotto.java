package org.generation.italy;

class Prodotto {
	private String codice,descrizione;
	private float prezzo,sconto;
	private int quantitàDisponibile;
	public Prodotto(String codice, String descrizione, float prezzo,int quantitàDisponibile) {
		super();
		this.codice = codice;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.sconto = 0;
		this.quantitàDisponibile = quantitàDisponibile;
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
	public int getQuantitàDisponibile() {
		return quantitàDisponibile;
	}
	public void setQuantitàDisponibile(int unità) {
		if(quantitàDisponibile>0)
		this.quantitàDisponibile -= unità;
	}
	
	
}
