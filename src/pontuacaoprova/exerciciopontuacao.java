package pontuacaoprova;

import java.util.Locale;
import java.util.Scanner;

public class exerciciopontuacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		double ticketmedio;
		int atrasopagamento,volumedecompras,compras,pontosin,pontospag=0,scoretotal;
		char dcb;
		
		//cabeçalho
		
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");
		System.out.println("");
		
		//leitura de volume
		
		System.out.print("Quantas compras o cliente fez no último ano? ");
		volumedecompras=sc.nextInt();
		System.out.print("Qual o ticket médio? ");
		ticketmedio=sc.nextDouble();
		
		//leitura dos outros dados
		
		System.out.println("");
		System.out.print("Quantas vezes o cliente atrasou o pagamento? ");
		atrasopagamento=sc.nextInt();
		System.out.print("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B)? ");
		dcb=sc.next().charAt(0);
		System.out.println("");
		
		//score de volume de compras
		
		if (ticketmedio == 0 ) {
			
			compras=0;
		}
		else if (ticketmedio <=3000.00 && volumedecompras <=2) {
			
			compras=20;
		}
		else if (ticketmedio <=3000.00 && volumedecompras > 2) {
			compras=40;
			
		}
		else {
			compras=60;
		}
		System.out.println("Score de volume de compras = "+ compras + " pontos" );
		System.out.println("");
		
		//scores de inadimplencia e pagamento
		
		if (volumedecompras ==0  || atrasopagamento > 1 ) {
			
			pontosin=0;
		}
		
		else if (volumedecompras > 0  && atrasopagamento >=1) {
			pontosin=15;
			
		}
		else {
			pontosin=30;
		}
		System.out.println("Score de inadimplência = "+pontosin + " pontos");
		
		//forma de pagamento
		if (dcb == 'd' || dcb == 'D') {
			
			pontospag=5;
			
		}
		else if (dcb == 'c' || dcb== 'b' || dcb=='C'|| dcb=='B' ) {
			pontospag=10;
			
		}
		
		System.out.println("Score de forma de pagamento = " +pontospag);
		System.out.println("");
		
		scoretotal=compras+pontosin+pontospag;
		if (scoretotal > 0 && scoretotal <= 25) {
			
			System.out.println("Classificação final = CLIENTE BRONZE");
			
		}
		else if (scoretotal > 25&& scoretotal< 75) {
			System.out.println("Classificação final = CLIENTE PRATA");
		}
		
		else {
			System.out.println("Classificação final = CLIENTE OURO");
		}
			
	}

}
