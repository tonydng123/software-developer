package java_basics;

public class LearningArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] values = new double[100];
		values[0] = 100;
		values[1] = 35.99;
		values[99] = 9888;
		
		System.out.println(values[0]);
		
		String[] words = new String[3];
		words[0] = "My";
		words[1] = "Name";
		words[2] = "is";
		
		System.out.println(words[0]);
		
		words = new String[10];
		System.out.println(words[2]);
	}

}
