package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import entidades.Asignatura;
import entidades.Ciclo;
import interfaces.ICicloDAO;

public class CicloDAO implements ICicloDAO {
	ConexionMySQL conexion = new ConexionMySQL();
	@Override
	public void insertar(Ciclo ciclo) {
		// TODO Auto-generated method stub
		conexion.driver();
		Connection c= conexion.conexion();
		
		String consulta="INSERT INTO ciclo (nombre, grado) VALUES (?,?)";
		try {
			PreparedStatement s=c.prepareStatement(consulta);
			s.setString(1, ciclo.getNombre());
			s.setString(2, ciclo.getGrado());
			s.executeUpdate();
			System.out.println("a");
			s.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		/*String consulta="INSERT INTO ciclo (id, nombre, grado)"
				+ "VALUES ("+ciclo.getId()+", '"+ciclo.getNombre()+"', '"+ciclo.getGrado()+"');";
		try {
			Statement s=c.createStatement();
			s.execute(consulta);
			System.out.println("c");
			s.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}*/
		
	}

	@Override
	public void eliminar(Ciclo ciclo) {
		// TODO Auto-generated method stub
		conexion.driver();
		Connection c = conexion.conexion();
		
		String consulta = "delete from ciclo where id = "+ciclo.getId();
		
		try {
			Statement s=c.createStatement();
			s.execute(consulta);
			System.out.println("b");
			s.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void modificar(Ciclo ciclo) {
		// TODO Auto-generated method stub
		conexion.driver();
		Connection c= conexion.conexion();
		
		String consulta="UPDATE `members` SET `contact_number` = '0759 253 542' WHERE `membership_number` = 1";
	}

	
	
	
	//CREA UN CICLO Y UN LISTADO DE ASIGNATURAS CON LA ID DEL CICLO
	@Override
	public void crear(Ciclo ciclo, ArrayList<Asignatura> arrayAsignatura) {
		// TODO Auto-generated method stub
		conexion.driver();
		Connection c= conexion.conexion();
		int generatedKey = 0;
		
		//creo el ciclo
		String consulta="INSERT INTO ciclo (nombre, grado) VALUES (?,?)";
		try {
			PreparedStatement s=c.prepareStatement(consulta,Statement.RETURN_GENERATED_KEYS);
			s.setString(1, ciclo.getNombre());
			s.setString(2, ciclo.getGrado());
			s.executeUpdate();
			
			
			
			//coger el valor de la id creada
			ResultSet rs = s.getGeneratedKeys();
			
			if (rs.next()) {
			    generatedKey = rs.getInt(1);
			    System.out.println(generatedKey);
			}
			
			System.out.println("ciclo creado");
			//s.close();
			
			
			
			//meter las asignaturas con la id del ciclo creado

			for(Asignatura asignatura : arrayAsignatura) {
				String consulta2="INSERT INTO asignatura (nombre, horas, idCiclo) VALUES (?,?,?)";
				
				PreparedStatement ps=c.prepareStatement(consulta2);
				ps.setString(1, asignatura.getNombre());
				ps.setInt(2, asignatura.getHoras());
				ps.setInt(3, generatedKey);
				ps.executeUpdate();
				System.out.println("asignatura");
				ps.close();
			
			}//for

			
			
		}//try
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}//crear
	
}
