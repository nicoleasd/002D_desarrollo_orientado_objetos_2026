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
                    buscarProductoPorNombre();
                    break;

                case "4":
                    venderProducto();
                    break;

                case "5":
                    break;

                case "6":
                    mostrar_menu = false;
                    break;

                case "7":
                    agregarDatosDePrueba();
                    break;

                default:
                    System.out.println("opcion invalida");
                    break;
            }

        }
    }

    static void registrarProducto() {

        boolean mostrar_submenu = true;

        while (mostrar_submenu) {

            System.out.println(" --- Tipo de Producto --- ");
            System.out.println("1. Físico");
            System.out.println("2. Digital");
            System.out.println("3. Volver al menú");
            System.out.println("Seleccione una opción:");

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

    static void registrarProductoFisico() {
        System.out.println("Nombre de juego: ");
        String nombre_ingresado = sc.nextLine();

        System.out.println("Precio Base: ");
        int precio_base = Integer.parseInt(sc.nextLine()); // el integer.parseint tranforma el texto a numero
                                                           // falta agregarle manejo de exepciones, por si alguien
                                                           // coloca "abc"
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

    static void registrarProductoDigital() { // misma logica q el productoFisico
        System.out.println("Nombre de juego: ");
        String nombre = sc.nextLine();

        System.out.println("Precio Base: ");
        int precio_base = Integer.parseInt(sc.nextLine());

        System.out.println("Stock: ");
        int stock = Integer.parseInt(sc.nextLine());

        System.out.println("Decuento: ");
        int descuento = Integer.parseInt(sc.nextLine());

        System.out.println("Plataforma: ");
        String plataforma = sc.nextLine();

        ProductoDigital juegoD = new ProductoDigital(nombre, precio_base, stock, descuento, plataforma);

        if (lista_juegos_digitales.add(juegoD)) {
            System.out.println("Producto digital registrado.");

        } else {
            System.out.println("No se registró el producto degital.");
        }

    }

    static void listarInventario() { // El tipo de dato de cada elemento dentro de la lista
        System.out.println("-_-_-_- INVENTARIO DE JUEGOS -_-_-_-"); // El nombre de variable temporal que tú eliges
        for (ProductoFisico juego_fisico : lista_juegos_fisicos) { // La lista completa que vas a recorrer
            System.out.println(juego_fisico.mostrarInfo());

            for (ProductoDigital juego_digital : lista_juegos_digitales) {
                System.out.println(juego_digital.mostrarInfo());
            }
        }
    }

    static void buscarProductoPorNombre() {
        System.out.println("Ingrese nombre del juego: ");
        String nombre_buscado = sc.nextLine();

        for (ProductoFisico juego_fisico : lista_juegos_fisicos) { // Pide el texto a buscar.
            if (juego_fisico.getNombre().contains(nombre_buscado)) { // Recorre todos los productos físicos, y por cada
                                                                     // uno pregunta si su nombre contiene ese texto —
                                                                     // si sí, lo imprime.
                System.out.println(juego_fisico.mostrarInfo()); //
            }
        }

        for (ProductoDigital juego_digital : lista_juegos_digitales) { // Hace lo mismo con todos los productos
                                                                       // digitales.
            if (juego_digital.getNombre().contains(nombre_buscado)) {
                System.out.println(juego_digital.mostrarInfo());
            }
        }

    }

    static void venderProducto() {
        System.out.println(" ***** VENDER PRODUCTO ***** ");
        System.out.println("1. Producto físico");
        System.out.println("2. Producto digital");
        System.out.println("Seleccione una opción: ");

        String opcion_elegida = sc.nextLine();

        if (opcion_elegida.equals("1")) {
            venderProductoFisico();
        } else if (opcion_elegida.equals("2")) {
            venderProductoDigital();
        } else {
            System.out.println("Opción inválida");
        }
    }



    static void venderProductoFisico(){
        if (lista_juegos_fisicos.isEmpty()) {
            System.out.println("No hay productos registrados para vender.");
            return;
        }
        
        for (int i = 0; i < lista_juegos_fisicos.size(); i++){
            ProductoFisico juego = lista_juegos_fisicos.get(i);
            System.out.println((i + 1) + ". " + juego.getNombre() + " | Stock: " + juego.getStock());
            System.out.println("--------------------------------------");
        }

    }

    static void venderProductoDigital(){
        
    }
    




    static void agregarDatosDePrueba() {
        System.out.println("Agregando juegos fisicos");

        lista_juegos_fisicos.add(new ProductoFisico("Pokémon Perla", 27000, 20, 3000));

        lista_juegos_fisicos.add(new ProductoFisico("Pokémon Diamante", 27000, 14, 3000));

        lista_juegos_fisicos.add(new ProductoFisico("GTA V", 32000, 26, 3000));

        lista_juegos_fisicos.add(new ProductoFisico("Majoras Mask", 150000, 2, 3000));

        lista_juegos_fisicos.add(new ProductoFisico("PayDay2", 6000, 6, 3000));

        lista_juegos_digitales.add(new ProductoDigital("Halo", 9000, 20, 45, "PC"));

        lista_juegos_digitales.add(new ProductoDigital("Balatro", 12000, 46, 5, "PC"));

        System.out.println("********DATOS DE PRUEBA CARGADOS******");
    }
}
