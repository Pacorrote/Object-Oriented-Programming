package programming_exercises_c4.test;

public class MathTest {

	public MathTest() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		System.out.println("El cuadrado de 37 es: "+Math.sqrt(37));
		System.out.println("El seno y coseno de 300 es: "+Math.sin(Math.toRadians(300))+" y "+Math.cos(Math.toRadians(300)));
		System.out.println("El valor del piso, techo y ronda de 22.8 es:  "+Math.floor(22.8)+" "+Math.ceil(22.8)+" "+Math.round(22.8));
		System.out.println("El más grande y el más pequeño del carácter \"D\" y el entero 71 es:  "+Math.max('D', 71)+" "+Math.min('D', 71));
		System.out.println("Un numero aleatorio entre 0 y 20: "+Math.random()*20);
	}
}
