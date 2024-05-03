
/* Utilizza un array privato per memorizzare oggetti Studente.  Implementa un costruttore senza parametri per
inizializzare il registro vuoto e un metodo pubblico per aggiungere studenti al registro.
Aggiungi un metodo che stampi la lista degli studenti. */

package org.lessons.java.snacks;

// array privato
public class RegistroStudenti {
	private Studente[] listaStudenti= {};
	private int numStudenti;


	// costruttore senza parametri per inizializzare il registro vuoto:
	public RegistroStudenti() {
		listaStudenti = new Studente[30]; // dimensione iniziale di 10
		numStudenti = 0; // inizializzo
	}
	
	// metodo pubblico per aggiungere studenti al registro
	public void aggiungiStudente(String nome, String cognome) {
		
		Studente nuovoStudente = new Studente(nome, cognome);
		listaStudenti[numStudenti] = nuovoStudente; // per aggiungere lo studente all'array
		numStudenti++; // incrementa il n° di studenti nel registro
	}
	
	// metodo per stampare la lista degli studenti
	
	public void stampaLista() {
		System.out.println("La lista degli studenti è composta da:" + "\n");
		// ciclo l'array
		for (int i = 0; i < numStudenti; i++) {
			System.out.print("- " + listaStudenti[i].getNome() + " " + listaStudenti[i].getCognome());
			if(i < numStudenti -1) {
				System.out.print("," + "\n"); // se lo studente non è l'ultimo della lista, dopo il cognome ci sarà la ,
			} else {
				System.out.print("."); // quando arriviamo all'ultimo studente chiudiamo col .
			}
			
		}
	}
}