package demo;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary;
		salary = 5000;
		String name = "Hello";
		StringBuilder newName = new StringBuilder(name);
        for(int i=0;i<32;i++) {
        	System.out.println("Iteration: " + i + salary + newName);
        }
	}

}
