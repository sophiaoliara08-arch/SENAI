package Atividadesengenharia;

import java.util.Scanner;

public class Atividade7 {
	public static void main(String[] args) {
		//ENTRADA
		int tempo, altura, velocidade;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o tempo: ");
		tempo = ler.nextInt();
		System.out.println("Informe a velocidade: ");
		velocidade = ler.nextInt();
		
		//PROCESSAMENTO
		altura = ((velocidade*tempo)-(5*(tempo*tempo)));
				
				//SAIDAS
				System.out.println("A altura é: " + altura);
	}

}
