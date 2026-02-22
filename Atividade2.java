package Atividadesengenharia;

import java.util.Scanner;

public class Atividade2 {public static void main(String[] args) {
	//ENTRADA
	double combustivel = 0;
	double tempo = 0;
	Scanner ler = new Scanner(System.in);

			System.out.println("informe a quantidade de combustivel consumida por segundo: ");
			combustivel = ler.nextDouble();
			System.out.println("informe a tempo: ");
			tempo = ler.nextDouble();
			
	//PROCESSAMENTO
	
			double consumo = combustivel*tempo;
			
	//SAÍDA
	
	System.out.println("foram conumidos: " + consumo +  " KG" );

}
}
