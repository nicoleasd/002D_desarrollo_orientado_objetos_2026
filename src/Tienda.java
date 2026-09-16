import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {

    static ArrayList<ProductoFisico> lista_juegos_fisicos = new ArrayList<>();

    static ArrayList<ProductoDigital> lista_juegos_digitales = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
    }

    static void mostrarMenu() {
        boolean mostrar_menu = true;

        while (mostrar_menu) {
            System.out.println("1. Registrar producto");
            System.out.println("2. Listar inventario");
            System.out.println("3. Buscar producto por nombre");
            System.out.println("4. Vender producto");
            System.out.println("5. Resumen del inventario");
            System.out.println("6. Salir");
            System.out.println("7. Agregar datos de prueba");

            String opcion_menu = sc.nextLine();

            switch (opcion_menu) {
                case "1":
                    registrarProducto();
                    break;

                case "2":
                    listarInventario();
                    break;

                case "3":
                    break;

                case "4":
                    break;

                case "5":
                    break;


                case "6":
                    mostrar_menu = false;
                    break;
                
                    
                case "7":
                    break;

            
                default:
                    System.out.println("opcion invalida");
                    break;
            }



        }
    }


    static void  registrarProducto() {

        boolean mostrar_submenu = true;

        while (mostrar_submenu) {

        System.out.println(" --- Tipo de Producto --- ");
        System.out.println("1. Físico");
        System.out.println("2. Digital");
        System.out.println("3. Volver al menú");
        System.out.println("Selecciones una opción:");

        String opcion_submenu = sc.nextLine();

        switch (opcion_submenu) {
            case "1":
                registrarProductoFisico();
                break;
            
            case "2":
                registrarProductoDigital();
                break;

            case "3":
                mostrar_submenu = false;

                break;


            default:
                System.out.println("Opción inválida.");
                break;
            }
        } 
    }

    static void registrarProductoFisico(){
        System.out.println("Nombre de juego: ");
        String nombre_ingresado = sc.nextLine();

        System.out.println("Precio Base: ");
        int precio_base = Integer.parseInt(sc.nextLine()); //el integer.parseint tranforma el texto a numero
                                                           // falta agregarle manejo de exepciones, por si alguien coloca "abc"
        System.out.println("Stock: ");
        int stock = Integer.parseInt(sc.nextLine());

        System.out.println("Costo de envío: ");
        int costo_envio = Integer.parseInt(sc.nextLine());


        ProductoFisico juego = new ProductoFisico(nombre_ingresado, precio_base, stock, costo_envio);
        
        if (lista_juegos_fisicos.add(juego)) {
            System.out.println("Producto físico registrado.");

        } else {
            System.out.println("No se registró el producto digital.");
        }
    }

    static void registrarProductoDigital(){          //misma logica q el productoFisico
        System.out.println("Nombre de juego: ");
        String nombre = sc.nextLine();

        System.out.println("Precio Base: ");
        int precio_base = Integer.parseInt(sc.nextLine());

        System.out.println("Stock: ");
        int stock = Integer.parseInt(sc.nextLine());

        System.out.println("Decuento: ");
        int descuento = Integer.parseInt(sc.nextLine());

        System.out.println("Plataforma: ");
        String plataforma =  sc.nextLine();

        ProductoDigital juegoD = new ProductoDigital(nombre, precio_base, stock, descuento, plataforma);

        if (lista_juegos_digitales.add(juegoD)) {
            System.out.println("Producto digital registrado.");
            
        } else {
            System.out.println("No se registró el producto degital.");
        }

    }

    static void listarInventario(){
        System.out.println("-_-_-_- INVENTARIO DE JUEGOS -_-_-_-");
        
    }


}