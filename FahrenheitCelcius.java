import java.util.Scanner;

public class FahrenheitCelcius {
	public static void main(String[] args) {
		System.out.println("Enter a degree in celcius: ");
		Scanner klavye = new Scanner(System.in);
		double santigrat = klavye.nextDouble();
		double fahrenayt = ((9.0/5)*santigrat)+32;
		System.out.println(santigrat+" Celcius is "+fahrenayt+" Fahrenheit");

	}

}
