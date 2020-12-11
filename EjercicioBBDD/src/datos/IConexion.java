package datos;

import java.sql.Connection;

public interface IConexion {

	public Connection conexion();
	
	public void cerrarConexion(Connection c);
	
	public void driver();
}
