package craps;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class crapss {
	public static void main(String[] args) throws InterruptedException {
		int dado1=0;
		int dado2=0;
		int soma=0;
		boolean verifica = false;
		Scanner sc = new Scanner(System.in);
		Random gerador= new Random();
		System.out.println("--------------------------------Bem vindo ao Craps-------------------------------");
		TimeUnit.SECONDS.sleep(2);

		
		    for(int i=0;verifica!=true;i++) {
				dado1=1+gerador.nextInt(6);
				System.out.println("Jogando primeiro dado");
				TimeUnit.SECONDS.sleep(2);
				System.out.println("O Resultado do primeiro dado foi :"+dado1);
				TimeUnit.SECONDS.sleep(2);

				dado2=1+gerador.nextInt(6);
				System.out.println("Jogando Segundo dado dado");
				TimeUnit.SECONDS.sleep(2);

				System.out.println("O Resultado do segundo dado foi :"+dado2);
				TimeUnit.SECONDS.sleep(2);

				soma=dado1+dado2;
				System.out.println("Calculando a soma...");
				TimeUnit.SECONDS.sleep(2);
				
				if(soma== 7 || soma ==11) {
					System.out.println("Parabens voce venceu a soma dos dados foi igual ah :"+soma);
					TimeUnit.SECONDS.sleep(2);
					verifica=true;
				}
				else if(soma==2|| soma==3 || soma ==12) {
					System.out.println("CRAPS Voce perdeu!!!, a soma foi igual ah :"+soma);
					TimeUnit.SECONDS.sleep(2);
					verifica=true;

				}else if (soma== 4 || soma ==5 || soma ==6 || soma ==8 || soma ==9 || soma==10) {
			
					System.out.println("Voce tirou "+soma+"\nvamos para o segundo estagio do jogo");
					TimeUnit.SECONDS.sleep(2);

		   for(int j=0;verifica!=true;j++) { // 2 Estagio
			   
				   dado1=1+gerador.nextInt(6);
				   System.out.println("O Resultado do primeiro dado foi :"+dado1);
				   TimeUnit.SECONDS.sleep(2);

				   dado2=1+gerador.nextInt(6);
				   System.out.println("O Resultado do segundo dado foi :"+dado2);
				   TimeUnit.SECONDS.sleep(2);
					
				   soma=dado1+dado2;


				   if(soma== 4 || soma ==5 || soma ==6 || soma ==8 || soma ==9 || soma==10) {
					   System.out.println("Parabens voce venceu a soma dos dados foi igual ah : "+soma);
						TimeUnit.SECONDS.sleep(2);
					    verifica=true;
					}else if(soma==7) {
						System.out.println("VOCE PERDEU!!! ");
						TimeUnit.SECONDS.sleep(2);

						verifica=true;
					}
				}
		   }
		
	}
}
}