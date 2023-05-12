package view;

public class Main {
	public static void main(String[] args) {
		
		int numero = 123123123;
		int num = 3;
		int total = recursivaVezes(numero, num);
		System.out.println(total);
		
	}

	private static int recursivaVezes(int numero, int num) {
		int total = 0;
		if(numero==0) { //condição de parada
			return 0;
		}else {
			if(numero%10==num) {
				numero /= 10;
				total++;
				return total + recursivaVezes(numero, num); // chamada recursiva
			}
			return total +recursivaVezes(numero/10, num); //chamada recursiva
		}
	}

}
