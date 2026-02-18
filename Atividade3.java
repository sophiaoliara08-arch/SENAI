package Atividadesengenharia;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		//ENTRADA
		double estrutura, combustivel, carga;
		Scanner ler = new Scanner(System.in);
		System.out.println("informe o peso da estrutura: ");
		estrutura = ler.nextDouble();
		System.out.println("informe o peso do combustivel: ");
		combustivel = ler.nextDouble();
		System.out.println("informe o peso da carga: ");
		carga = ler.nextDouble();
		
		//PROCESSAMENTO
		double peso = (estrutura+combustivel+carga);
		
		//SAIDA
		System.out.println("Sua massa total é: " + peso);
		
	}

}
