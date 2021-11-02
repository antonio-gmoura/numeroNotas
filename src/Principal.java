import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws Exception {

		System.out.println("Informe o valor do saque:"); 
		Scanner sc = new Scanner(System.in);
		var saque = sc.nextDouble();
		sc.close();
	    System.out.println(saque);
	    
	    if (saque < 5.0) {
	    	throw new Exception ("Saque Mínimo é R$ 5,00!");
	    }
	    
//	    if (saque % 5 > 0) {
//	    	throw new Exception ("Saque deve ser múltiplo de R$ 5,00!");
//	    }

	    Double[] cedulas = {100.0, 50.0, 20.0, 10.0, 5.0};
	    
	    String resposta = "";
	    String respostaCedula = "";
	    
	    int numeroCedulas = 0;

	    for (Double cedula : cedulas) {
	    	  numeroCedulas = (int) (saque / cedula);
	    	  if (numeroCedulas != 0) {
	    		  respostaCedula = "R$ " + cedula + ": " + numeroCedulas;
	    		  resposta = resposta + (resposta == "" ? "" : " | ") + respostaCedula;
		    	  System.out.println(respostaCedula);
	    	  }
	    	  saque %= cedula;
	    	  if (saque == 0.0) {
	    		  break;
	    	  }
	    }
	    if (saque > 0) {
	    	throw new Exception ("Valor do saque inválido. Nâo há cedulas para R$ " + saque + "!");
	    }
	    System.out.println(resposta);
	}

}
