package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL implements IConexion{

	@Override
	public Connection conexion() {
		// TODO Auto-generated method stub
		Connection c = null;
		try {
			String url = "jdbc:mysql://localhost:3306/aula_nosa?serverTimezone=UTC";
			String usuario = "root2";
			String pass = "prueba";
			c = DriverManager.getConnection(url,usuario,pass);
			System.out.println(c);
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public void cerrarConexion(Connection c) {
		// TODO Auto-generated method stub
		 try {
		        c.close();
		    } catch (SQLException sqle) {
		        /*JOptionPane.showMessageDialog(null, "Error al cerrar conexion", "Error", JOptionPane.ERROR_MESSAGE);
		        Logger.getLogger(ConexionDAO.class.getName()).log(Level.SEVERE, null, sqle);*/
		    }
	}

	@Override
	public void driver() {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
