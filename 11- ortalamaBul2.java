public class ortalamaBul2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("3 sinav notu giriniz ");
		
		int sinav1 = input.nextInt();
		int sinav2 = input.nextInt();
		int sinav3 = input.nextInt();


		double ort = (sinav1+sinav2+sinav3)/3;
		System.out.println("Ortalama: "+ort);
	  }
