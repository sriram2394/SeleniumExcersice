package week1.day1.assignment;

public class Fibbinocci {
	public static void main(String[] args) {
		int firstNum = 0;
		int secNum = 1;
		int sum = 0;
		System.out.println(firstNum);
		System.out.println(secNum);
		for(int i = 1 ; i < 10; i++) {
			
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);
		}
	}

}
