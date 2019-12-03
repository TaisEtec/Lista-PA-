
package exerc;
import java.util.*;
public class Elemento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ler = new Scanner(System.in);
        
        
        int[] vetor = new int[10];
        int num;
        
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um valor para a posição " + i);
            vetor[i] = ler.nextInt();
        }
        
 
        System.out.println("Digite um valor para procurar no vetor");
        num = ler.nextInt();
        
        
        for(int i = 0; i < vetor.length; i++){
            
            if(vetor[i] == num){
                System.out.println("O local do número digitado é " + i);
            
            }
        }
	
	}

}
