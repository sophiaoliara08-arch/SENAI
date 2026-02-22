package Atividadesengenharia;

import java.util.Scanner;

public class Atividade10 {
	public static void main(String[] args) {
		
		//ENTRADA
		double capacidade, consumo, tempo;
		Scanner ler = new Scanner(System.in);
		System.out.println("Infrome a capacidade do tanque: ");
		capacidade = ler.nextDouble();
		System.out.println("Informe o consumo do foguete: ");
		consumo = ler.nextDouble();
		
		//PROCESSAMENTO
		tempo = (capacidade/consumo);
		
		//SAIDA
		System.out.println("O tanque durará: " + tempo  + " minutos.");
		
	}

}
