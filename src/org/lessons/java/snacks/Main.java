package org.lessons.java.snacks;

public class Main {

	public static void main(String[] args) {
		RegistroStudenti registro = new RegistroStudenti();
		
		// aggiungo gli studenti
		registro.aggiungiStudente("Giulia" , "Giuliani");
		registro.aggiungiStudente("Mario" , "Bianchi");
		registro.aggiungiStudente("Anna" , "Rossi");
		registro.aggiungiStudente("Francesco" , "Franceschini");
		registro.aggiungiStudente("Enrico" , "Verdi");
		registro.aggiungiStudente("Lorenzo" , "Lorenzini");
		
		// stampo
		registro.stampaLista();
	}

}
