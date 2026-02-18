package Atividadesengenharia;

import java.util.Scanner;

public class Atividade1 {public static void main(String[] args) {
	//ENTRADA
	int velocidade = 0;
	int tempo = 0;
	Scanner ler = new Scanner(System.in);

			System.out.println("informe a velocidade: ");
			velocidade = ler.nextInt();
			System.out.println("informe a tempo: ");
			tempo = ler.nextInt();
			
	//PROCESSAMENTO
	
			int altura = velocidade*tempo;
			
	//SAÍDA
	
	System.out.println("a altura percorida pelo foguete foi: " + altura +  " metros" );

}
}
