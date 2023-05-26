package aula03;

import java.util.Scanner;

/*
 * Responsáveis:
	Renan Correa Mendes de Oliveira - 2302150
	Rodrigo Vicente Bento da Silva - 2302235
	Rafael Onassis Nicolau - 2300321
	*/

public class App {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);  

		// vamos solicitar o peso e a altura da pessoa
		System.out.print("Informe seu peso: ");
		double peso = Double.parseDouble(entrada.nextLine());
		System.out.print("Informe sua altura: ");
		double altura = Double.parseDouble(entrada.nextLine());
		
		
        double imc = peso / (altura * altura);
        System.out.printf("%.2f %n", imc);

        if (imc < 18.5) {
            System.out.println("Magreza");
        } else if (imc >= 18.6 && imc < 24.9) {
            System.out.println("Normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else {
        	System.out.println("Obesidade");
        }
	}

}

