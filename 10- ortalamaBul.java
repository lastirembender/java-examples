import java.util.Scanner;

public class ortalamaBul {
	public static void main(String[] args) {
		System.out.println("1. sinavi giriniz: ");
		Scanner input = new Scanner(System.in);
		int sinav1 = input.nextInt();
		System.out.println("2. sinavi giriniz");
		Scanner input2 = new Scanner(System.in);
		int sinav2 = input2.nextInt();
		System.out.println("3. sinavi giriniz");
		Scanner input3 = new Scanner(System.in);
		int sinav3 = input3.nextInt();

		double ort = (sinav1+sinav2+sinav3)/3;
		System.out.println("Ortalama: "+ort);
	  }
}
