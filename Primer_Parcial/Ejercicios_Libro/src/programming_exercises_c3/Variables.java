package programming_exercises_c3;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v = 4;
		int w = 6;
		double x = 2.2;
		calculate(v, w);
		calculate(v, x);
		//calculate(x, y);
		calculate(18, x);
		//calculate(1.1,2.2);
		calculate(5,7);
		/*Por lo tanto en en la linea 12 y 14 son ilegales
		 y las demas son legales 
		 */
		System.out.println("Por lo tanto en en la linea 12 y 14 son ilegales\n" + 
				"		 y las demas son legales ");
	}
	
	public static void calculate(int x, double y) {
		System.out.println(x+" "+y);
	}

}
