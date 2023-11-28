package br.com.vainaweb.backendt1.exercicio1;

public class Empregados {
	String nome;
	String cpf;
	double salario;
	
	public Empregados() {
		
	}
	
	public Empregados(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public double salarioAnual(double salario) {
		return salario * 12;
	}
	
	public double aumento(double salario) {
		return salario = (salario + (salario * 0.1)) * 12;
	}
}
