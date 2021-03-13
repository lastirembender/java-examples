import java.util.Scanner;

public class SilindirAlanHacim {
	public static void main(String[] args) {
		System.out.println("Enter the radius and length of a cylinder: ");
		Scanner klavye = new Scanner(System.in);
		double radius = klavye.nextDouble();
		double length = klavye.nextDouble();
		
		double area = Math.PI * radius * radius;
		double volume = area * length;
		
		System.out.println("The area is "+area+"\n"+"The volume is: "+volume);
	}

}
