package controlStatement;

public class SwapWithout3rd {

	public static void main(String[] args) {
		int a = 3;
        int b = 4;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a=" +a + " b="+b);

	}

}
