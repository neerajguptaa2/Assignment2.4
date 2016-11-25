
public class Assignment_2_4 {

	public static void main(String[] args) {

		// this is first way to o the same
		int a, b, c;
		a = 4;
		b = 5;
		c = 3;

		if (a > b && a > c) {
			System.out.println(a + " is greater");
		} else if (b > a && b > c) {
			System.out.println(b + " is greater");
		} else {
			System.out.println(c + " is greater");
		}

		
		
		
		
		
		// this is second way to do the same
		int a1, b1, c1;
		a1 = 4;
		b1 = 5;
		c1 = 6;

		if (a1 > b1) {
			if (a1 > c1) {
				System.out.println(a1 + " is greater");
			} else {
				System.out.println(c1 + " is greater");
			}
		} else {
			if (b1 > c1) {
				System.out.println(b1 + " is greater");
			} else {
				System.out.println(c1 + " is greater");
			}
		}

	}

}
