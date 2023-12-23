
import java.util.Scanner;

public class Kruznica {

	public static void main(String[] args) {
		
double radius, plostina, perimetar;
double pi = 3.14;
		
		Scanner tastatura = new Scanner(System.in);
		System.out.println("Programata presmetuva povrsina i perimetar na kruznica");
		System.out.println("Vnesete radius na kruznicata: ");
		radius = tastatura.nextDouble();
		plostina = radius * radius * pi;
		perimetar = 2*radius * pi;
		
		System.out.println();
		System.out.println("Perimetarot e: "+ perimetar);
		
		System.out.println("Plostinata e: "+ plostina);
		

	}

}
