package proba;

import java.util.LinkedList;

import biblioteka.Autor;
import biblioteka.Biblioteka;
import biblioteka.Knjiga;

public class Main {
	/*
	 * Napraviti dve knjige, prvu sa dva autora, drugu sa jednim autorom, napuniti
	 * ih proizvoljnim podacima (koristiti parametrizovane konstruktore) i uneti u
	 * biblioteku. Saèuvati sve knjige u fajl “biblioteka.json”. Napraviti nov
	 * objekat klase biblioteka i uèitati sve knjige iz fajla “biblioteka.json”.
	 */
	public static void main(String[] args) {
		
		Autor autor1=new Autor("Pera","Peric");
		Autor autor2=new Autor("Mika", "Mikic");
		
		LinkedList<Autor> autori1=new LinkedList<Autor>();
		autori1.add(autor1);
		autori1.add(autor2);
			
		Knjiga knjiga1= new Knjiga("Knjiga 1", "123", autori1, "Izadavac1", 1);
		
		Autor autor3=new Autor("Iva", "Ivic");
		
		LinkedList<Autor> autori2=new LinkedList<Autor>();
		autori2.add(autor3);
		
		Knjiga knjiga2= new Knjiga("Knjiga 2", "456",autori2,"Izdavac2", 2);
		
		LinkedList<Knjiga> knjige=new LinkedList<Knjiga>();
		knjige.add(knjiga1);
		knjige.add(knjiga2);
		
		Biblioteka biblioteka=new Biblioteka(knjige);
		
		biblioteka.sacuvajSve("biblioteka.json");
		biblioteka.ucitajSveKnjige("biblioteka.json");
		
		for(Knjiga knjiga:biblioteka.vratiSveKnjige()) {
			System.out.println(knjiga);
		}
	}

}
