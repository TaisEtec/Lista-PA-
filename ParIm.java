package exerc;
import java.util.*;
public class ParIm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ler = new Scanner (System.in);
		
		int[] a = new int[20];
		int[] b = new int [a.length];
		
		for (int i=0; i<a.length; i++) {
			System.out.print("Digite o "+i+"° numero:");
			a[i] = ler.nextInt();	
		}
		
		int posB = 0;
			
        for (int n = 0; n<a.length; n++) {
            if (a[n] % 2 == 0) {
            	b[posB] = a[n];
            	posB++;
            }
           }
            
            for (int n = 0; n<a.length; n++) {
                if (a[n] % 2 != 0) {
                	b[posB] = a[n];
                	posB++;
                	}
                }
            
            System.out.print("Vetor A =");
            for (int i=0; i<a.length; i++) {
            	System.out.print(a[i]+", ");
            }
            System.out.println();
            
            System.out.print("vetor B =");
            for (int i=0; i<posB; i++) {
            	System.out.print(b[i]+", ");
            }
            }

}
