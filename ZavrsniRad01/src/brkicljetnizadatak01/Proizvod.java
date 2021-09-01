package brkicljetnizadatak01;

import java.util.Date;

public class Proizvod {

	private int sifra;
	private double cijena;
	private Date garancija;
	private String naziv;
	private String opisProizvoda;
	private String kodArtikla;
	private boolean certifikat;
	private boolean dostupnostZaKupnju;

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

	public Date getGarancija() {
		return garancija;
	}

	public void setGarancija(Date garancija) {
		this.garancija = garancija;
	}

	public boolean isCertifikat() {
		return certifikat;
	}

	public void setCertifikat(boolean certifikat) {
		this.certifikat = certifikat;
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