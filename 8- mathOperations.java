public class mathOperations {
	
	public static void main(String[] args) {
		int num = 25;
		int num1 = 16;
		
		System.out.println(Math.sqrt(num));
		System.out.println(Math.max(num, num1));
		System.out.println(Math.min(num, num1));
		
		int num2 = -5;
		System.out.println(Math.abs(num2));
		
		double mynum = Math.random();
		System.out.println(mynum);
		
		int randomNum = (int)(Math.random() * 101);  // 0 to 100
		System.out.println(randomNum);
	  }

}
