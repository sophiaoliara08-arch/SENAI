package Atividadesengenharia;

import java.util.Scanner;

public class Atividade5 {
public static void main(String[] args) {
	//ENTRADA
	double massa, velocidade, energia;
	Scanner ler = new Scanner(System.in);
	System.out.println("informe o valor da massa: ");
	massa = ler.nextDouble();
	System.out.println("informe o valor da velocidade: ");
	velocidade = ler.nextDouble();
	
	//PROCESSAMENTO
	energia = (massa*(velocidade*velocidade)/2);
	
	//SAIDA
	System.out.println("a energia produzida equivale a: " + energia);
	}
}
