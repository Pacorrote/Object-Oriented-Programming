package programming_exercises_c3.clases;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clases obA = new Clases();
		//obA.b=12;
		obA.c=5;
		obA.d=23;
		//Clases.b=4;
		//Clases.c=33;
		Clases.d=99;
		/*
		 obA.b es una variable de instancia privada
		 por lo tanto no podemos acceder facilmente 
		 a ella
		 
		 obA.d nos sale una advertencia, pero la mejor
		 manera es con Clases.d
		 
		 Clases.b lo mismo, una variable de instancia 
		 privada
		 
		 Clases.c el error esta que para acceder a la 
		 variable c tiene que ser con el obA.c ya que 
		 no es estático
		 */
		System.out.println("obA.b es una variable de instancia privada\n" + 
				"		 por lo tanto no podemos acceder facilmente \n" + 
				"		 a ella\n" + 
				"		 \n" + 
				"		 obA.d nos sale una advertencia, pero la mejor\n" + 
				"		 manera es con Clases.d\n" + 
				"		 \n" + 
				"		 Clases.b lo mismo, una variable de instancia \n" + 
				"		 privada\n" + 
				"		 \n" + 
				"		 Clases.c el error esta que para acceder a la \n" + 
				"		 variable c tiene que ser con el obA.c ya que \n" + 
				"		 no es estático");
	}

}
