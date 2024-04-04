
package com.mycompany.ejerciciojava011;

public class SuperHeroe {
    private String nombre;
    private String descripcion;
    private boolean capa;

    public SuperHeroe(String nombre) {
        this.nombre = nombre;
        this.descripcion="";
        this.capa=false;
        
    }

    public SuperHeroe(String nombre, String descripcion, boolean capa) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.capa = capa;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCapa() {
        return capa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }
    
   @Override 
   public String toString(){
    return  "SuperHeroe{"+"nombre="+nombre+",descripcion="+descripcion+",capa="+capa+'}';  
      
   }
   
    
}
