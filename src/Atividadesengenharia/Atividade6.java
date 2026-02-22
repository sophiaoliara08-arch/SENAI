package Atividadesengenharia;

import java.util.Scanner;

public class Atividade6 {
public static void main(String[] args) {
	//ENTRADA
	double raio, area;
	final double PI = 3.14;
	Scanner ler = new Scanner(System.in);
	System.out.println("Informe o raio do objeto: ");
	raio = ler.nextDouble();
	//PROCESSAMENTO
	area = ((raio*raio)*PI);
	//SAIDA
	System.out.println("o valor da àrea é: " + area);
	
}
}
