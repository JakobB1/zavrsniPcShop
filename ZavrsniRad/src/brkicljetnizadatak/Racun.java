package brkicljetnizadatak;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Racun {
	
	private int sifra;
	private int brojracuna;
	private int kolicina;
	private double cijena;
	private double iznosracuna;
	private Date datumkupnje;
	private String nacinplacanja;
	private String nazivproizvoda;
	
	public double getIznosracuna() {
		return iznosracuna;
	}
	public void setIznosracuna(double iznosracuna) {
		this.iznosracuna = iznosracuna;
	}
	public String getNazivproizvoda() {
		return nazivproizvoda;
	}
	public void setNazivproizvoda(String nazivproizvoda) {
		this.nazivproizvoda = nazivproizvoda;
	}
	public int getBrojracuna() {
		return brojracuna;
	}
	public void setBrojracuna(int brojracuna) {
		this.brojracuna = brojracuna;
	}
	public String getNacinplacanja() {
		return nacinplacanja;
	}
	public void setNacinplacanja(String nacinplacanja) {
		this.nacinplacanja = nacinplacanja;
	}
	public Date getDatumkupnje() {
		return datumkupnje;
	}
	public void setDatumkupnje(Date datumkupnje) {
		this.datumkupnje = datumkupnje;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}
	private List<Korisnik> korisnici = new ArrayList<Korisnik>();
	private List<Djelatnik> djelatnici = new ArrayList<Djelatnik>();
	
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public Date getDatumpocetka() {
		return datumkupnje;
	}
	public void setDatumpocetka(Date datumpocetka) {
		this.datumkupnje = datumpocetka;
	}
	
	public double getCijena() {
		return cijena;
	}
	public void setCijena(double cijena) {
		this.cijena = cijena;
	}
	public List<Korisnik> getKorisnici() {
		return korisnici;
	}
	public void setKorisnici(List<Korisnik> korisnici) {
		this.korisnici = korisnici;
	}
	public List<Djelatnik> getDjelatnici() {
		return djelatnici;
	}
	public void setDjelatnici(List<Djelatnik> djelatnici) {
		this.djelatnici = djelatnici;
	}
	
}
