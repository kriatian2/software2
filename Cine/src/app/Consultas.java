package app;


import java.util.ArrayList;

import javax.swing.JButton;

public class Consultas extends ConexionConOracle {
    public Consultas(){
        
    }
    
    public boolean insertarUsuario(String usuario, String clave, int nivelSeguridad){
        return this.insertar("USUARIOYCLAVE", "USUARIO,CLAVE,NIVELSEGURIDAD","'" + usuario + "','" + clave + "','" + nivelSeguridad +"'");
    }
    
    public String[][] getUsuarios(){
        String[][] usuarios= this.seleccionar("USUARIOYCLAVE", "USUARIO,CLAVE,NIVELSEGURIDAD", null ,null );
        return usuarios;
    }
    
    
    public boolean insertarPelicula(String titulo, String director, String duracion, Object genero, String productora,Object object2){
		return this.insertar("PELICULAS","TITULO,DIRECTOR,DURACION,GENERO,PRODUCTORA,VISUALIZACION","'" + titulo + "','" + director + "','" + duracion + "','" + genero + "','" + productora + "','" + object2 +"'");
    	
    }
    
    public boolean insertarHorario(String comienzoHorario, String finalHorario){
		return this.insertar("HORARIOS","COMIENZOHORARIO,FINALHORARIO","'" + comienzoHorario + "','" + finalHorario  +"'");
    	
    }

    public boolean insertarDescuento(String nombreDescuento, String cantidadDescuento){
		return this.insertar("DESCUENTOS","NOMBREDESCUENTO,CANTIDADDESCUENTO","'" + nombreDescuento + "','" + cantidadDescuento  +"'");
    	
    }

	public boolean insertarSala(String filas, String columnas, String id){
		return this.insertar("SALAS","FILAS,COLUMNAS,ID","'" + filas + "','" + columnas + "','" + id  +"'");

	}

	public boolean eliminarUsuario(Object usuario){
		return this.eliminar("USUARIOYCLAVE", "USUARIO='" + usuario + "'");
    }

	public String[][] getOfertas() {
		 String[][] ofertas= this.seleccionar("DESCUENTOS", "NOMBREDESCUENTO", null ,null );
	        return ofertas;
	}

	public boolean eliminarOferta(Object oferta) {
		return this.eliminar("DESCUENTOS", "NOMBREDESCUENTO='" + oferta + "'");
		
	}

	public String[][] getPeliculas() {
		String[][] peliculas= this.seleccionar("PELICULAS", "TITULO", null ,null );
        return peliculas;
	}

	public String[][] getSalaID() {
		String[][] salaId= this.seleccionar("SALAS", "ID", null ,null );
        return salaId;

	}

	public String[][] getSalaTamaño() {
		String[][] salaTamaño= this.seleccionar("SALAS", "FILAS", "ID" ,null );
        return salaTamaño;

	}
	
   
    
   //************************************************************************** 
  //************************************************************************** 
/*
    public boolean insertarObjeto(String nombre, String daño, String habilidad, String velocidad, String enfriamiento, String vida, String armadura){
        return this.insertar("OBJETOS", "NOMBRE,DAÑO,HABILIDAD,VELOCIDAD,ENFRIAMIENTO,VIDA,ARMADAURA","'" + nombre + "','" + daño + "','" + habilidad + "','" + velocidad +"','"+ enfriamiento +"','"+ vida+"','"+ armadura+"'");
    }
    
    public boolean insertarObjeto2(String nombre, String daño, String habilidad, String velocidad, String enfriamiento,String vida,String armadura){
		return this.insertar("OBJETOS","NOMBRE,DAÑO,HABILIDAD,VELOCIDAD,ENFRIAMIENTO,VIDA,ARMADURA","'" + nombre + "','" + daño + "','" + habilidad + "','" + velocidad + "','" + enfriamiento + "','" + vida + "','" + armadura    +"'");
    	
    }
    
    public boolean registrarPartidaTanque(String nombre, String resultado, String objeto){
    	return this.insertar("PARTIDASTANQUE", "CAMPEON,RESULTADOPARTIDA,OBJETO","'" + nombre + "','"  + resultado + "','"  + objeto + "'");
    }
    
    public boolean registrarPartidaAP(String nombre, String resultado, String objeto){
    	return this.insertar("PARTIDASAPC", "CAMPEON,RESULTADOPARTIDA,OBJETO","'" + nombre + "','"  + resultado + "','"  + objeto + "'");
    }
    
    public boolean registrarPartidaAD(String nombre, String resultado, String objeto){
    	return this.insertar("PARTIDASADC", "CAMPEON,RESULTADOPARTIDA,OBJETO","'" + nombre + "','"  + resultado + "','"  + objeto + "'");
    }
 
  //************************************************************************** 
  //************************************************************************** 
    
    public String[][] getObjeto(){
        String[][] objeto = this.seleccionar("OBJETOS","NOMBRE,DAÑO,HABILIDAD,VELOCIDAD,ENFRIAMIENTO,VIDA,ARMADURA", null, null);
        return objeto;
    }
    
    public String[][] getUsuarios(){
        String[][] usuarios= this.seleccionar("USUARIOYCLAVE", "USUARIO,CLAVE,NIVELSEGURIDAD", null ,null );
        return usuarios;
    }
    
    public String[][] getCampeonTanque(){
    	String[][] campeon = this.seleccionar("PARTIDASTANQUE","CAMPEON,RESULTADOPARTIDA", null, null);
		return campeon;
    	
    }
    
    public String[][] getCampeonAd(){
    	String[][] campeon = this.seleccionar("PARTIDASADC","CAMPEON,RESULTADOPARTIDA", null, null);
		return campeon;
    	
    }
    
    public String[][] getCampeonAp(){
    	String[][] campeon = this.seleccionar("PARTIDASAPC","CAMPEON,RESULTADOPARTIDA", null, null);
		return campeon;
    	
    }
    
    public boolean eliminarFicha(String id){
        return this.eliminar("FICHA", "ID='" + id + "'");
    }
    
    public boolean eliminarUsuario(String usuario){
		return this.eliminar("USUARIOYCLAVE", "USUARIO='" + usuario + "'");
    }
    */
   
    
    
    
    

}