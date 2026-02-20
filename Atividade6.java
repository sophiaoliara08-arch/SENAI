package Atividadesengenharia;

import java.util.Scanner;

public class Atividade6 {
public static void main(String[] args) {
	//ENTRADA
	double raio, area, pi;
	Scanner ler = new Scanner(System.in);
	System.out.println("Informe o raio do objeto: ");
	raio = ler.nextDouble();
	System.out.println("Informe o PI considerado: ");
	pi = ler.nextDouble();
	//PROCESSAMENTO
	area = ((raio*raio)*pi);
	//SAIDA
	System.out.println("o valor da àrea é: " + area);
	
}
}
