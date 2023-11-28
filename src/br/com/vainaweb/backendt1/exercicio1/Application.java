package br.com.vainaweb.backendt1.exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Empregados empregado = new Empregados();
		List<Empregados> listagem = new ArrayList<Empregados>();

		for(int i = 0; i < 2; i++) {
			System.out.println("----------------------------");
			System.out.println("Nome do Empregado: ");
			empregado.nome = sc.nextLine();
			System.out.println("Digite o CPF do Empregado: ");
			empregado.cpf = sc.nextLine();
			System.out.println("Digite o Salário do Empregado: ");
			empregado.salario = sc.nextDouble();
			sc.nextLine();
			
			listagem.add(new Empregados(empregado.nome, empregado.cpf, empregado.salario));
		}
		
		for(Empregados l : listagem) {
			System.out.println("| Nome: " + l.nome + " CPF: " + l.cpf + " Salário: " + l.salarioAnual(l.salario));
		}
		
		
		
		for(Empregados l : listagem) {
			System.out.println("| Nome: " + l.nome + " CPF: " + l.cpf + " Salário: " + l.aumento(l.salario));
		}
		
		
		sc.close();
	}

}
