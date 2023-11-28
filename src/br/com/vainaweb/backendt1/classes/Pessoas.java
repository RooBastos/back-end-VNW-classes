package br.com.vainaweb.backendt1.classes;

public class Pessoas {

		String nome;
		int idade;
		String cargo;

		public Pessoas() {
			
		}

		public Pessoas(String nome, int idade, String cargo) {
			this.nome = nome;
			this.idade = idade;
			this.cargo = cargo;
		}

		public void falar(String fala) {
			System.out.println(fala);
		}
}
