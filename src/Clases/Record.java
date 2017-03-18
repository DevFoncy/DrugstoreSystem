
package Clases;

public class Record {
    private String name;
    private String last_name;
    private int cant_vendida;
    private double ingresos;
    private String fecha_venta;
    private String code;
    
    public Record(String n, String a, int c, double i,String fv,String co){
        this.name=n;
        this.last_name=a;
        this.cant_vendida=c;
        this.ingresos=i;
        this.fecha_venta=fv;
        this.code = co;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public int getCant_vendida() {
        return cant_vendida;
    }
    public void setCant_vendida(int cant_vendida) {
        this.cant_vendida = cant_vendida;
    }
    public double getIngresos() {
        return ingresos;
    }
    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }
    public String getFecha_venta() {
        return fecha_venta;
    }
    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    
    @Override
    public String toString(){
        return  this.code+","+this.name + "," + this.last_name + "," + this.cant_vendida + "," + this.ingresos + "," + this.fecha_venta;                
    }
}
