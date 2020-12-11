package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import entidades.Asignatura;
import interfaces.IAsignaturaDAO;

public class AsignaturaDAO implements IAsignaturaDAO {
	ConexionMySQL conexion = new ConexionMySQL();
	
	@Override
	public void insertar(Asignatura as) {
		// TODO Auto-generated method stub
		
		conexion.driver();
		Connection c= conexion.conexion();
		
		
		String consulta="INSERT INTO asignatura (nombre, horas, idCiclo) VALUES (?,?,?)";
				//+ "VALUES ("+as.getId()+", '"+as.getNombre()+"', '"+as.getHoras()+"');";
		try {
			PreparedStatement s=c.prepareStatement(consulta);
			s.setString(1, as.getNombre());
			s.setInt(2, as.getHoras());
			s.setInt(3, as.getIdCiclo());
			s.executeUpdate();
			System.out.println("a");
			s.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		/*
		String consulta="CREATE TABLE CLIENTES " + "(DNI CHAR(9) NOT NULL, APELLIDOS VARCHAR(32) NOT NULL, CP CHAR(5), PRIMARY KEY(DNI))";
		try {
			Statement s=c.createStatement();
			s.execute(consulta);
			s.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("fsd");*/
	}

	@Override
	public void eliminar(Asignatura as) {
		// TODO Auto-generated method stub
		
		conexion.driver();
		Connection c= conexion.conexion();
		
		
		String consulta="delete from asignatura where id = "+as.getId();
		//String consulta2="delete from asignatura where nombre = "+as.getNombre();
		//String consulta3="delete from asignatura where horas = "+as.getHoras();
		try {
			Statement s=c.createStatement();
			s.execute(consulta);
			//s.execute(consulta2);
			//s.execute(consulta3);
			System.out.println("b");
			s.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void modificar(Asignatura as) {
		// TODO Auto-generated method stub
		
	}
	
}
