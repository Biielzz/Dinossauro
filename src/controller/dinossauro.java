package controller;

public class dinossauro {
int energia = 100;
double velocidade = 40;
float temperatura = 40;
String humor;


public void pular() {
	energia -= 20;
	velocidade -= 10;
	humor = "feliz";
	System.out.println("O Skeep est� pulando!");
}

public void correr() {
	energia -= 20;
	velocidade -= 10;
	humor = "feliz";
	System.out.println("O Skeep est� comendo!");
}

public void comer() {
	energia += 20;
	velocidade -=10;
	humor = "feliz";
	System.out.println("O Skeep est� comendo!");
}

public void cantar() {
	energia -= 20;
	humor = "feliz";
	System.out.println("O Skeep est� cantando!");
}

public void tomarSol() {
	velocidade += 20;
	temperatura += 10;
	humor = "feliz";
	System.out.println("O Skeep est� tomando banho de sol!");
}

public void ficarNaSombra() {
	energia += 20;
	humor = "triste";
	temperatura -= 10;
	System.out.println("O Skeep est� descansando na sombra!");
}
}
