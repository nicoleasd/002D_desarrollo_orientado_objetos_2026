import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showMenu();
    }


    static void showMenu(){
        
        Scanner scanner = new Scanner(System.in);

        Character player_character = new Character();

        boolean flag_menu = true;

        System.out.println("*****Welcome to the seven kingdoms*****");

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
            
            System.out.println("Enter a nickname: ");    
            player_character.name = scanner.nextLine();

            System.out.println("Add Hp: ");
            player_character.asignarVida(Integer.parseInt(scanner.nextLine()));

            System.out.println("Add Magic Points to ur character: ");
            player_character.magic_points = Integer.parseInt(scanner.nextLine());
        
            System.out.println("Enter an age: ");
            player_character.validarEdad(Integer.parseInt(scanner.nextLine()));
                break;


            case "2":
                System.out.println("ver persnaje");

                System.out.println("NAME: " + player_character.name);
                System.out.println("HP: " + player_character.mostrarVida());
                System.out.println("MP: " + player_character.magic_points);
                System.out.println("AGE: " + player_character.mostrarEdad());

                break;
        
            case "3":
                System.out.println("gracias, chao");
                flag_menu = false;
                break;

            default:
                System.out.println("Invalid Option");
                break;
        }


        } 


    }

}
