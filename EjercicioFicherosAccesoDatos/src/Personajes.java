
public class Personajes {
	private String nombre;
	private String generoPersonaje;
	private String importancia;
	
	public Personajes (String nombre, String generoPersonaje, String importancia) {
			
			this.nombre = nombre;
			this.generoPersonaje = generoPersonaje;
			this.importancia = importancia;
			
		}
	
	
	//get
		public String getNombre () { 
			return nombre; }
		public String getGeneroPersonaje () { 
			return generoPersonaje; }
		public String getImportancia () { 
			return importancia; }
	
	//set
		public void setNombre(String nombre) {
		    this.nombre = nombre;
		  }
		public void setGeneroPersonaje(String generoPersonaje) {
		    this.generoPersonaje = generoPersonaje;
		  }
		public void setImportancia(String importancia) {
		    this.importancia = importancia;
		  }
		
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			int x=0;
			String a="";
			while (x<1) {
				a=this.generoPersonaje;
				x++;
			}
			return 
				"Nombre:"+this.getNombre() + " Genero:" +this.getGeneroPersonaje() +  " Importancia:"+this.getImportancia() ;
			
		}
}
