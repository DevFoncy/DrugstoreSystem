
package Clases;

public class Articulo implements java.io.Serializable {
    protected String codigo;
    protected int stock;
    protected String producto;
    protected double precio;
    
    
    public Articulo(){
        
    }
    
    public Articulo (String _cod , int _stock, String _producto, double _precio){
        this.codigo=_cod;
        this.stock=_stock;
        this.producto=_producto;
        this.precio=_precio;       
       
    }

    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public int getStock() {
        return stock;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public String getProducto() {
        return producto;
    }
    
    public void setProducto(String producto) {
        this.producto = producto;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }  
       
    
}
