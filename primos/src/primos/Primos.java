package primos;

import java.util.Scanner;

public class Primos {
	public static Scanner numero=new Scanner (System.in);
	public static int numeroIntro;
	public static void main(String[] args) {
		
		asaisoñfhaioshfoahisdoñasfd
		System.out.println("Introduce un numero");
		numeroIntro=numero.nextInt();
		for(int f=1;f<numeroIntro;f++){
			boolean primo=true;
			for(int c=2;c<f;c++){
				if(f%c==0){
					primo=false;
				}
			}
			if(primo){
				System.out.println("Primo"+f);
			}
		}
	}

}
