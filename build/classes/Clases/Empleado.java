
package Clases;

public class Empleado extends Persona{
    protected double salario;
    protected String usuario;
    protected String clave;
    protected String fecha_contrato; 
    
    public Empleado(String n, String ap,  int d, double s, String u, String x, String fc){
        super(n,ap,d);
        this.salario=s;
        this.usuario=u;
        this.clave=x;
        this.fecha_contrato=fc;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getFecha_contrato() {
        return fecha_contrato;
    }

    public void setFecha_contrato(String fecha_contrato) {
        this.fecha_contrato = fecha_contrato;
        
    }
    public String getUsuario() {
        return usuario;
        
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
        
    }
    
    @Override
    public String toString(){
        return super.nombre + "," + super.apellido + "," + super.dni + "," + this.salario + "," +  
               this.usuario + "," + this.clave + "," + this.fecha_contrato ;        
    }
   
}
