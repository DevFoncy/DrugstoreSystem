
package Clases;

public class Producto extends Articulo {
    private String rubro;
    
    public Producto(String _cod , int _stock, String _producto, double _precio,String _rubro){
        super(_cod , _stock, _producto, _precio);
        this.rubro=_rubro;        
    }
     
    @Override
    
    public String toString(){
        return super.codigo + "," + super.producto + "," + this.getRubro() + "," + super.stock + "," +  
               super.precio;        
    }
    
    public String getRubro() {
        return rubro;
    }
    
    public void setRubro(String rubro) {
        this.rubro = rubro;
    }
}
