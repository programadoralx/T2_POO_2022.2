package q1T2;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num, parOuImpar;
Scanner in = new Scanner(System.in);
System.out.print("Digite um numero: ");
num = in.nextInt();
parOuImpar = (num%2);
if (parOuImpar==0) {
	System.out.println("O numero " +num+" é par");
}else {
	System.out.println("O numero " +num+" é impar");
}
	}

}
