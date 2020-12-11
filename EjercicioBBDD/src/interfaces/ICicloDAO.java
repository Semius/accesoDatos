package interfaces;
import java.util.ArrayList;

import entidades.Asignatura;
import entidades.Ciclo;


public interface ICicloDAO {

	public void insertar(Ciclo c);
	
	public void eliminar (Ciclo c);
	
	public void modificar (Ciclo c);
	
	public void crear (Ciclo c, ArrayList<Asignatura> a);
}
