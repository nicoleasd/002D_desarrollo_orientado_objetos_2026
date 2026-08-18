import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showMenu();
    }


    static void showMenu(){
        
        Scanner scanner = new Scanner(System.in);

        Character player_character = new Character();

        boolean flag_menu = true;

        System.out.println("*****Bienvenido a los 7 reinos*****");

        while (flag_menu) {
        System.out.println("1. Create Character");
        System.out.println("2. Inspect Character");
        System.out.println("3. Visualize Character");
        System.out.println("3. Exit");

        System.out.println("choose an option");

        String user_option = scanner.nextLine();

        switch (user_option) {
            case "1": 
            System.out.println("Creating Character");
            

            System.out.println("Ingrese un nombre: ");    
            player_character.name = scanner.nextLine();

            System.out.println("INgrese puntos de vida: ");
            //player_character.hit_points = Integer.parseInt(scanner.nextLine());


            
            
            System.out.println("INgrese maná");
            player_character.magic_points = Integer.parseInt(scanner.nextLine());

                break;

            case "2":
                System.out.println("ver persnaje");

                System.out.println("NOMBRE: " + player_character.name);
                System.out.println("HP " + player_character.hit_points);
                System.out.println("MANÁ " + player_character.magic_points);

            


                break;
        
            case "3":
                System.out.println("gracias, chao");
                flag_menu = false;
                break;

            default:
                System.out.println("opcion invalida");
                break;
        }


        } 


    }

}
