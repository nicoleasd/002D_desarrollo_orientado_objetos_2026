public class ProductoFisico extends Producto {

    private  int costoEnvio;
    

    public ProductoFisico(String nombre, int precioBase, int stock, int costoEnvio){
        super(nombre, precioBase, stock);
        this.costoEnvio = costoEnvio;
    }

    public int getCostoEnvio(){
        return this.costoEnvio;
    }

    @Override
    public int calcularPrecioFinal(){
        return getPrecioBase() + this.costoEnvio;
    }

    @Override
    public String mostrarInfo(){
        return "Producto Físico: " + getNombre() +
                " | Precio Base: " + getPrecioBase() +
                " | Envío: " + this.costoEnvio +
                " | Precio Final:" + calcularPrecioFinal() +
                " | Stock: " + getStock();
    }

}