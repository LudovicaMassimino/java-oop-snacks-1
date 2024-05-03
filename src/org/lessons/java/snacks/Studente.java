package org.lessons.java.snacks;

public class Studente {
	private String nome;
	private String cognome;


// costruttore:
	public Studente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
}