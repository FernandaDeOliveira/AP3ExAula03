import java.util.Scanner;
public class Utils {

Scanner tc = new Scanner(System.in);
	
	int retornaTamanho(String valor){
		return valor.length();
	}

	void mostraTamanho(String valor){
		System.out.println(valor.length());
	}
	
	int retornaConcat(String valor,String valor2){	
	String valor3=valor.concat(valor2);
	System.out.println(valor3);
		return valor3.length();
	}
	
	int soma(int num1,int num2){
		return num1+num2;
	}
	
	int retornaMaior(int num1,int num2){
		if(num1>num2)
			return num1;
		else
			return num2;
	}
	
	void retornaString(String valor,String valor2){
		if(valor.length()==valor2.length())
			System.out.println("Igual");
		else
			if(valor.length()<valor2.length())
				System.out.println(valor);
			else 
				System.out.println(valor2);
	}
	
	void ordemAlfabetica(String valor,String valor2){
		int comp = valor.compareTo(valor2); 				  
			if(comp < 0) {  
			  System.out.println(valor);  
				} else if(comp > 0) {  
				  System.out.println(valor2);  
				} else {  
				  System.out.println("Iguais");  
				}  
	}
	
	int retornaVogais(String valor){
		int qtd=0;
		 for (int i = 0; i < valor.length(); i++){  
		        char c = valor.charAt(i);  
		        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')  
		            qtd++;  
		    }  
		
		return qtd;
	}
	
	int retornaConso(String valor){
		int qtd=0,qtdC=0;
		 for (int i = 0; i < valor.length(); i++){  
		        char c = valor.charAt(i);  
		        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')  
		            qtd++;  
		    } 
		 int qtdP=valor.length();
		 qtdC=qtdP-qtd;
		
		return qtdC;
	}
	
	int retornaEspec(String valor){
		int qtd=0;
		 for (int i = 0; i < valor.length(); i++){  
		        char c = valor.charAt(i);  
		        if (c == '!' || c == '?' || c == 'ç' )  
		            qtd++;  
		    }  
		
		return qtd;
	}
}
