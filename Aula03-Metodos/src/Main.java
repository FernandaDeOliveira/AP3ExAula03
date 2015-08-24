import java.util.Scanner;

public class Main {

    public static void main(String[]args) {

    Scanner tc = new Scanner(System.in);
    Utils objeto=new Utils();
    int i=0;
   String valor=null;
    

    	System.out.println(objeto.retornaTamanho("pera"));
    	
    	objeto.mostraTamanho("abacaxi");
    
  
    	System.out.println( objeto.retornaConcat("banana", "maca"));
    	
  
    	System.out.println(objeto.soma(1, 2));
    
    
    	System.out.println(objeto.retornaMaior(1, 2));
    
    
    	objeto.retornaString("pera", "batata");
    	
  
    	objeto.ordemAlfabetica("a", "b");
    
  
    	System.out.println(objeto.retornaVogais("pera"));
    		
  
    	System.out.println(objeto.retornaConso("batata"));
    	

    	System.out.println(objeto.retornaEspec("pera!"));
    }
    
    
    
    
    
    }

