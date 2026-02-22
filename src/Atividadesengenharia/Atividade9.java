package Atividadesengenharia;

import java.util.Scanner;

public class Atividade9 {
	public static void main(String[] args) {
		
		//ENTRADA
	double num1, num2, num3, num4, num5, soma, media, lancamentos;
	Scanner ler = new Scanner(System.in);
	System.out.println("Informe a quantidade de lançamentos: ");
	lancamentos = ler.nextDouble();
	System.out.println("Informe a primeira metragem: ");
	num1 = ler.nextDouble();
	System.out.println("Informe a segunda metragem: ");
	num2 = ler.nextDouble();
	System.out.println("Informe a terceira metragem: ");
	num3 = ler.nextDouble();
	System.out.println("Informe a quarta metragem: ");
	num4 = ler.nextDouble();
	System.out.println("Informe a quinta metragem: ");
	num5 = ler.nextDouble();
	
	//PROCESSAMENTO
	soma = (num1+num2+num3+num4+num5);
	media = (soma/lancamentos);
	
	//SAIDA
	System.out.println("A média equivale a: " + media);
	
	
	}

}
