package bin.br.com.deciodani.git;
import java.util.Scanner;

public class desafio2_polignos_simples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o Valor das variaveis = ");
	    String N = scan.nextLine();
	    String[] split = N.split(" ");
	//TODO: Complete os espaços em branco com uma possível solução para o desafio
	    int P = Integer.parseInt(split[0]) * Integer.parseInt(split[1 ]);
	    
	    System.out.println(P);
	    scan.close();
	}

}
