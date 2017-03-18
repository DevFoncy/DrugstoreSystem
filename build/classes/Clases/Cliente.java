
package Clases;

public class Cliente extends Persona{
    
   private String direccion;
   private String ruc;
   
   public Cliente(String n, String ap, int d,String di,String r){       
       super(n,ap,d);
       this.direccion=di;
       this.ruc=r;
   }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the ruc
     */
    public String getRuc() {
        return ruc;
    }

    /**
     * @param ruc the ruc to set
     */
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
   @Override
    public String toString(){
       return super.nombre + ","+ super.apellido+ ","+this.direccion+","+this.ruc;
   }
}
