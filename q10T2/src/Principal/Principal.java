package Principal; //Questão 10

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        System.out.println("Descubra a tabuada");

    	int entrada;
        
    	Scanner mult = new Scanner(System.in);
        System.out.print("Digite um número: ");
        entrada = mult.nextInt();
       
        int i = 0;
        System.out.println("A tabuada do " + entrada + " é:");
        for (i=1; i<=10; i++) {
            int resultado = entrada * i;
            System.out.println(entrada + " x " + i + " = " + resultado);
            
        }
    }

}
