package coleccion;
import java.util.ArrayList;
import objects.Vehiculo;
public class MiArrayList extends ArrayList<Vehiculo> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public boolean add(Vehiculo e) {
		// TODO Auto-generated method stub
		if(isRepetido(e)) {
			System.out.println("La placa se repite o el numero de serie se repite");
			return false;
		}
		else {
			return super.add(e);
		}
	}
	
	private boolean isRepetido(Vehiculo e) {
		// TODO Auto-generated method stub
		boolean encontrado=false;
		int contador = 0;
		while(!encontrado && contador<super.size()) {
			encontrado = this.get(contador).equals(e);
			contador++;
		}
		return encontrado;
	}

	

}
