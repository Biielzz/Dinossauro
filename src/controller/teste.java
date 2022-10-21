package controller;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		dinossauro skeep = new dinossauro();
		String perg ;
		Scanner scan = new Scanner(System.in);
		
		do {
		System.out.println("Digite P para pular. "
				+ "\nDigite C para correr. "
				+ "\nDigite M para comer. "
				+ "\nDigite A para cantar. "
				+ "\nDigite S para tomar Sol. "
				+ "\nDigite O para ficar na Sombra. ");
		
		System.out.println("energia: " + skeep.energia 
				+ " \nvelocidade: " + skeep.velocidade 
				+ " \ntemperatura: " + skeep.temperatura 
				+ " \nhumor: " + skeep.humor);
		String textoMaiusculo = scan.nextLine().toUpperCase();
		char letra = textoMaiusculo.charAt(0);
		
		if (letra == 'P') {
			skeep.pular();
		}
		if (letra == 'C') {
			skeep.correr();
		}
		if (letra == 'M') {
			skeep.comer();
		}
		if (letra == 'A') {
			skeep.cantar();
		}
		if (letra == 'S') {
			skeep.tomarSol();
		}
		if (letra == 'O') {
			skeep.ficarNaSombra();
		}
		System.out.println("Voce deseja sair? "
				+ "/ digite enter continuar "
				+ "/ qualquer outro para sair");
		perg = scan.nextLine();
		
	} while(perg == "");

}
}
