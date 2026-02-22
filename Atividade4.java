package Atividadesengenharia;

import java.util.Scanner;

public class Atividade4 {
public static void main(String[] args) {
	//ENTRADA 
	double forca, impulso, tempo;
	Scanner ler = new Scanner(System.in);
	System.out.println("informe o valor da força: ");
	forca = ler.nextDouble();
	System.out.println("informe o valor do tempo: ");
	tempo = ler.nextDouble();
	 
	//PROCESSAMENTO
	impulso = (forca*tempo);
	
	//SAIDA
	System.out.println("Seu impulso é: " + impulso);
}
}
