public abstract class Producto {
    private String nombre;
    private int precioBase; //Privados para que nadie los modifique directo desde afuera (encapsulamiento).
    private int stock;      //El acceso será solo a través de getters/setters.

    public Producto(String nombre, int precioBase, int  stock){
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.stock = stock;
    }

    public String getNombre(){
        return this.nombre ;
    }

    public int getPrecioBase(){
        return this.precioBase;
    }

    public int getStock(){
        return this.stock;
    }

    public void setStock(int stock){ //recibe el nuevo valor comom parametro
        this.stock = stock; //el parametro recibido se guarda en el atributo
    }

    public abstract int calcularPrecioFinal();

    public String mostrarInfo(){
        return "Producto: " + this.nombre +
                "Precio Base: " + this.precioBase +
                "Precio Final: " + calcularPrecioFinal() +
                "Stock: " + this.stock;

    }




}

