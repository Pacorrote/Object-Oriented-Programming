package programming_exercises_c3.ej3;

import javax.swing.JOptionPane;

public class ArithmeticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1, b=2;
		JOptionPane.showMessageDialog(null, displayNumberPlus10(a)
				+" "+displayNumberPlus10(b)
				+"\n"+displayNumberPlus100(a)
				+" "+displayNumberPlus100(b)
				+"\n"+displayNumberPlus1000(a)
				+" "+displayNumberPlus1000(b));
	}
	public static int displayNumberPlus10(int num) {
		return num+10;
	}
	public static int displayNumberPlus100(int num) {
		return num+100;
	}
	public static int displayNumberPlus1000(int num) {
		return num+1000;
	}
}
