package br.com.vainaweb.backendt1.exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fatura faturaItem = new Fatura();
		List<Fatura> itensFatura = new ArrayList<Fatura>();
		double somaTotal = 0;
		
		for(int i = 0; i < 2; i++) {
			System.out.println("-------------------------");
			System.out.println("Digite o número referente ao produto:");
			faturaItem.numeroProduto = sc.nextLine();
			System.out.println("Inclua a descrição do produto:");
			faturaItem.descricao = sc.nextLine();
			System.out.println("Digite a quantidade de itens:");
			faturaItem.quantidadeComprada = sc.nextInt();
			sc.nextLine();
			System.out.println("Digite o preço unitário do produto:");
			faturaItem.precoProduto = sc.nextDouble();
			sc.nextLine();
			
			
			itensFatura.add(new Fatura(faturaItem.numeroProduto, faturaItem.descricao, faturaItem.quantidadeComprada, faturaItem.precoProduto));
		}
		
		for(Fatura f : itensFatura) {
			System.out.println("Produto "+ f.numeroProduto + ": R$" + f.faturaTotal(f.quantidadeComprada, f.precoProduto));
			somaTotal += f.faturaTotal(f.quantidadeComprada, f.precoProduto);
		}
		
		System.out.printf("O valor da fatura é de R$ %.2f", somaTotal);
		
		sc.close();
	}

}
