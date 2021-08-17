package console;

import java.util.Date;

public class Proizvod {
	
	private int sifra;
	private String naziv;
	private double cijena;
	private Date garancija;
	private String opisProizvoda;
	private boolean dostupnostZaKupnju;
	private String kodArtikla;
	
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public double getCijena() {
		return cijena;
	}
	public void setCijena(double cijena) {
		this.cijena = cijena;
	}
	public Date getIstekGarancije() {
		return garancija;
	}
	public void setIstekGarancije(Date istekGarancije) {
		this.garancija = istekGarancije;
	}
	public String getOpisProizvoda() {
		return opisProizvoda;
	}
	public void setOpisProizvoda(String opisProizvoda) {
		this.opisProizvoda = opisProizvoda;
	}
	public boolean isDostupnostZaKupnju() {
		return dostupnostZaKupnju;
	}
	public void setDostupnostZaKupnju(boolean dostupnostZaKupnju) {
		this.dostupnostZaKupnju = dostupnostZaKupnju;
	}
	public String getKodArtikla() {
		return kodArtikla;
	}
	public void setKodArtikla(String kodArtikla) {
		this.kodArtikla = kodArtikla;
	}
	
}