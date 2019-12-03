package exerc;
import java.util.*;
public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		
		for (int i=0; i<a.length; i++) {
			System.out.print("Digite o "+i+"° numero:");
			a[i] = ler.nextInt();	
		}
		
		for (int i=0; i<a.length; i++) {
			System.out.println("Tabuada de "+a[i]);
			
			for (int j=1; j<11; j++) {
				System.out.println(j+"x"+a[i]+" = "+(a[i]*j));
			}
			System.out.println();
		}

		
	}

}
