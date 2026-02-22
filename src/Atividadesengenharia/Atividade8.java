package Atividadesengenharia;

import java.util.Scanner;

public class Atividade8 {
	public static void main(String[] args) {
		//ENTRADA
		double material,
		dinheiro,
		testes, 
		membros, 
		porcentagem,
		soma,
		fim;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe a quantidade de dinheiro: ");
		dinheiro = ler.nextDouble();
		System.out.println("Informe a porcentage do material: ");
		material = ler.nextDouble();
		System.out.println("Informe a porcentagem dos testes: ");
		testes = ler.nextDouble();
		System.out.println("Informe a quantidade de membros: ");
		membros=  ler.nextDouble();
		//PROCESSAMENTO
		soma = ((material+testes)/100)*dinheiro;
		porcentagem = (dinheiro-soma);
		fim = (porcentagem/membros);
		//SAIDA
		System.out.println("Cada membro ficará com: " + fim);
		
		
		
		
		
		
	}

}
