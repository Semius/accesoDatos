package interfaces;

import java.util.ArrayList;

import datos.AsignaturaDAO;
import datos.CicloDAO;
import datos.ConexionMySQL;
import entidades.Asignatura;
import entidades.Ciclo;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ConexionMySQL conexion = new ConexionMySQL();
		AsignaturaDAO conexionAsignatura = new AsignaturaDAO();
		CicloDAO conexionCiclo = new CicloDAO();
		conexion.conexion();
		conexion.driver();
		
		Ciclo cl = new Ciclo(0, "Ciclo", "grado");
		
		Asignatura as = new Asignatura(1, "Asignatura", 0 , 1);
		Asignatura as2 = new Asignatura(2, "Asignatura", 0, 1);
		
		ArrayList<Asignatura> arrayAsignatura = new ArrayList<Asignatura>();
		
		arrayAsignatura.add(as);
		arrayAsignatura.add(as2);
		
		
		//conexionAsignatura.eliminar(as);
		conexionAsignatura.insertar(as);
		conexionCiclo.insertar(cl);
		
		conexionCiclo.crear(cl, arrayAsignatura);
		conexionCiclo.modificar(cl);
	}

}
