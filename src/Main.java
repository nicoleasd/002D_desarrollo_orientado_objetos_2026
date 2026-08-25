import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showMenu();
    }

    static void showMenu() {

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
                    createCharacter(player_character, scanner);

                    break;

                case "2":
                    verCharacter(player_character);
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

    static void createCharacter(Character player_character, Scanner scanner) {

        Enderman pepe = new Enderman();
        Creeper creeper = new Creeper();
        Zombie zombie = new Zombie();
        Dragon dragon = new Dragon();

        


        System.out.println("Creating Character");

        System.out.println("Enter a nickname: ");
        player_character.validarNombre(scanner.nextLine());

        System.out.println("Add Hp: ");
        player_character.asignarVida(Integer.parseInt(scanner.nextLine()));

        System.out.println("Add Magic Points to ur character: ");
        player_character.magic_points = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter an age: ");
        player_character.validarEdad(Integer.parseInt(scanner.nextLine()));
    }

    static void verCharacter(Character player_character) {
        System.out.println("ver persnaje");

        System.out.println("NAME: " + player_character.mostrarNombre());
        System.out.println("HP: " + player_character.mostrarVida());
        System.out.println("MP: " + player_character.magic_points);
        System.out.println("AGE: " + player_character.mostrarEdad());
    }

}


//implementar un menu en la creacion del personaje que permita elegir el personaje que quiero crear