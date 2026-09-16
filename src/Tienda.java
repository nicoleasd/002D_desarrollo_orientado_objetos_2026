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
        }
    }
}