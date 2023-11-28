package br.com.vainaweb.backendt1.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoas pessoa = new Pessoas();
		List<Pessoas> lista = new ArrayList<Pessoas>();

		for(int i = 0; i < 4; i++) {
			System.out.println("-----------------------------");
			System.out.println("Digite o nome: ");
			pessoa.nome = sc.nextLine();
			System.out.println("Digite a idade: ");
			pessoa.idade = sc.nextInt();
			sc.nextLine();
			System.out.println("Digite o cargo: ");
			pessoa.cargo = sc.nextLine();
			lista.add(new Pessoas(pessoa.nome, pessoa.idade, pessoa.cargo));
			
		}
		
		for (Pessoas l : lista) { 
			System.out.println("| Nome: " + l.nome + ", Idade: " + l.idade + ", Cargo: " + l.cargo + " |");
		}
		
		sc.close();
	}

}
