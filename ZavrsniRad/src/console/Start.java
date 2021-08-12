package console;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Start {
	
	private List<Korisnik> korisnici;
	
	public Start() {
		korisnici = new ArrayList<Korisnik>();
		
		Ulaz.scanner = new Scanner(System.in);
		glavniIzbornik();
	}
	
	private void glavniIzbornik() {
		System.out.println("**** PC SHOP ****");
		System.out.println(" IZBORNIK ");
		System.out.println(" 1. Korisnici");
		System.out.println(" 2. Djelatnici");
		System.out.println(" 3. Racuni");
		System.out.println(" 4. Proizvodi");
		System.out.println(" 5. Izlaz iz programa");
		
		ucitajGlavnuAkciju();
	}

	private void ucitajGlavnuAkciju() {
		switch (Ulaz.ucitajInt("Odaberite stavku: ", "Niste unijeli cijeli broj", 1, 5)) {
		case 1:
			korisnikIzbornik();
			break;
		case 5:
			System.out.println("Program je zavrsio, dovidenja!");
			return;
		}
	}
	
	
	
    ///////////
    //// POCETAK KORISNIK
    ///////////

	private void korisnikIzbornik() {
		System.out.println("--------------------");	
		System.out.println("Podizbornik 1. Korisnici");		
		System.out.println("Odaberite akciju");
		System.out.println(" 1. Pregled unesenih korisnika");
		System.out.println(" 2. Unos novog korisnika");
		System.out.println(" 3. Promjena postojeceg korisnika");
		System.out.println(" 4. Brisanje korisnika");
		System.out.println(" 5. Povratak u prethodni izbornik");
		
		ucitajIzbornikAkciju();
	}

	private void ucitajIzbornikAkciju() {
		switch(Ulaz.ucitajInt("Odaberite akciju: ",
				"Niste unijeli cijeli broj", 1, 5)) {
		case 1 -> korinsikPregled();
		case 2 -> korisnikUnosNovog();
		case 3 -> korisnikPromjena();
		case 4 -> korisnikBrisanje();
		case 5 -> glavniIzbornik();
		}
	}

	private void korisnikBrisanje() {
		korisnikStravke("Trenutno dostupno u aplikaciji");
		int redniBroj  = Ulaz.ucitajInt("Odaberite redni broj za brisanje: ", 
				"Niste unijeli cijeli broj", 1, korisnici.size());
		korisnici.remove(redniBroj-1);
		korisnikIzbornik();
	}

	private void korisnikPromjena() {
		korisnikStravke("Trenutno dostupno u aplikaciji");
		int redniBroj = Ulaz.ucitajInt("Odaberite redni broj za promjenu: ",
				"Niste unijeli cijeli broj", 1, korisnici.size());
		Korisnik korisnikZaPromjenu = korisnici.get(redniBroj-1);
		korisnikZaPromjenu = korisnikPostaviVrijednosti(korisnikZaPromjenu);
		korisnici.set(redniBroj-1, korisnikZaPromjenu);
		korisnikIzbornik();
	}

	private void korisnikUnosNovog() {
		Korisnik k = new Korisnik();
		k = korisnikPostaviVrijednosti(k);
		korisnici.add(k);
		korisnikIzbornik();
	}

	private Korisnik korisnikPostaviVrijednosti(Korisnik k) {
		k.setSifra(Ulaz.ucitajInt("Unesite sifru: ",
				"sifra mora biti cijeli broj",
				1, Integer.MAX_VALUE));
		k.setIme(Ulaz.ucitajString("Unesite ime korisnika; ",
				"Ime obavezno"));
		k.setPrezime(Ulaz.ucitajString("Unesi prezime korisnika: ",
				"Prezime obavezno"));
		k.setEmail(Ulaz.ucitajString("Unesi email korisnika: ",
				"Email obavezan"));
		k.setBrojClanskeKartice(Ulaz.ucitajInt("Unesi broj clanske kartice korisnika: ",
				"Broj kartice obavezan", 1, 9999));
		return k;
	}

	private void korinsikPregled() {
		korisnikStravke("Pregled unesenih smjerova");
		korisnikIzbornik();
	}

	private void korisnikStravke(String naslov) {
		System.out.println(naslov);
		System.out.println("--------------------");
		if(korisnici.size()==0) {
			System.out.println("Nema unesenih korisnika");
		}else {
			Korisnik k;
			for(int i=0;i<korisnici.size();i++) {
				k = korisnici.get(i);
				System.out.println((i + 1) + ". " + k.getIme() +
						" " + k.getPrezime() +
						" " + k.getEmail() + 
						" " + k.getBrojClanskeKartice());
			}
		}
		
	}
	
    ///////////
    //// KRAJ DJELATNIK
    ///////////

	public static void main(String[] args) {
		new Start();
	}

}
