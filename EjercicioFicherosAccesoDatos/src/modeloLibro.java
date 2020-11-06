/**
 * Clase para leer SAX y leer archivo XML
 * @version 1 6/11/2020
 * @author Julián
 */

public enum modeloLibro  {
	TITULO("autor"), EDITORIAL("editorial"), AUTOR("price"), FECHA("description"), GENERO("calories"), LISTAPERSONAJES("") ;
	 
    private String autor;

	public String getAutor() {
		return autor;
	}

	private modeloLibro(String autor) {
		this.autor = autor;
	}
 

}
