package pontuacaoprova;

import java.util.Locale;
import java.util.Scanner;

public class exerciciopontuacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		double volumedecompras,ticketmedio;
		
		//cabe�alho
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO �LTIMO ANO");
		System.out.println("");
		//leitura de compras
		System.out.print("Quantas compras o cliente fez no �ltimo ano? ");
		volumedecompras=sc.nextDouble();
		System.out.print("Qual o ticket m�dio? ");
		ticketmedio=sc.nextDouble();
		
	}

}
