
package Clases;

public class Vendedor extends Empleado{
    public Vendedor(String _nom, String _ape,  int _dni, double _salario, String _usuario, String _pass, String _fcont){
        super(_nom,_ape,_dni,_salario,_usuario,_pass,_fcont);     
        
    } 
    
    @Override
    public String toString(){
        return super.nombre + "," + super.apellido + "," + super.dni + "," + super.salario + "," +  
               super.usuario + "," + super.clave + "," + super.fecha_contrato ;        
    }
}
