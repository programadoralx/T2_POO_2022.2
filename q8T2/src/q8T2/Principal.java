package q8T2;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		double op, sal, imp = 0, aum = 0, novoSal = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("menu de op��es");
		System.out.println("[1] imposto");
		System.out.println("[2] novo salario");
		System.out.println("[3] classifica��o");
		System.out.println("[4] finalizar o programa");
		System.out.println("Informe sua op��o: ");
		op = sc.nextInt();
		if(op > 4 || op < 1) {
			System.out.println("op��o invalida!");
		}
			if(op == 1) {
				System.out.println("informe seu salario: ");
				sal = sc.nextDouble();
				if(sal < 500) {
					imp = sal * 5/100;
				}
					if(sal>= 500 & sal <= 950) {
						imp = sal *10/100;
					}
						if(sal > 950) {
							imp = sal * 15/100;
						}
						System.out.println("o imposto � " + imp);
					}
		if(op == 2) {
			System.out.println("Informe o seu salario: ");
			sal = sc.nextDouble();
			if(sal > 1500) {
				aum = 25;
			}
				if(sal >= 750 & sal <= 1500) {
					aum = 50;
				}
					if(sal >= 450 & sal < 750) {
						aum = 75;
					}
						if(sal < 450) {
							aum = 100;
						}
						novoSal = sal + aum;
						System.out.println(" o novo salario � " + novoSal);
		}
		if(op == 3) {
			System.out.println("Informe o seu salario: ");
			sal = sc.nextDouble();
			if(sal <= 700){
				System.out.println("mal remunerado");
			}
		   
			else {
				System.out.println("bem remunerado");
			}
		}
		if(op == 4) {
			System.out.println("programa finalizado!");
		}
	}

}
