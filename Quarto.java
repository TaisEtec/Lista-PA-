package exerc;
import java.util.*;
public class Quarto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a[], maior = 0, menor = 0, i;
		a = new int[10];

		for (i = 0; i < 10; i++) {
			System.out.println("Insira o " + (i + 1) + "� valor");
			a[i] = in.nextInt();

			if (i == 0) {
				maior = a[i];
				menor = a[i];

			}
			if (a[i] > maior) {
				maior = a[i];

			}
			if (a[i] < menor) {
				menor = a[i];
			}

		}
		System.out.println("o maior � " + maior + ", e o menor � " + menor);

	}


	}

