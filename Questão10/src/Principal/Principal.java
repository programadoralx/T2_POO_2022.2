package Principal; //Quest�o 10

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        System.out.println("Descubra a tabuada");

    	int entrada;
        
    	Scanner mult = new Scanner(System.in);
        System.out.print("Digite um n�mero: ");
        entrada = mult.nextInt();
       
        int i = 0;
        System.out.println("A tabuada do " + entrada + " �:");
        for (i=1; i<=10; i++) {
            int resultado = entrada * i;
            System.out.println(entrada + " x " + i + " = " + resultado);
            
        }
    }

}
