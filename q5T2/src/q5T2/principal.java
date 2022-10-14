package q5T2;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner (System.in);
	     int num,n,i,j,fat;
		 System.out.println("Informe a quantidade de numeros que deseja calcular : ");
		 n = sc.nextInt();
					 
		for(i=1;i<=n;i++) {
			System.out.println("Informe um número inteiro, para calcular seu fatorial: ");
			num = sc.nextInt();
			fat=1;
		for(j=1; j<=num; j++) {
			fat = fat * j;
		}
		 System.out.println(fat);
	}

		}
	}
