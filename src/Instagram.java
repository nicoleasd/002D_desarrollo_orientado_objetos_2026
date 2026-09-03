public class Instagram {     public static void main(String[] args) {
        System.out.println("hola ");


        crearPublicacion();
    }


    static void crearPublicacion(){
        Publicacion publicacion_sebita = new Publicacion("1" , "@sebita123");
        publicacion_sebita.validarAutor("sebita1234");

       Publicacion publicacion_barbara = new Publicacion("2", "@barbarita123");

       Publicacion publicacion_alexander = new Publicacion("3", "@alexander123");

        System.out.println("Los autores son: ");
        System.out.println(publicacion_sebita.getAutor());


        publicacion_sebita.darLikes(); //son funciones que lit hacen lo q tienen programado, por eso aumenta los likes y queda guardado
        publicacion_barbara.darLikes();
        publicacion_alexander.darLikes();
        publicacion_alexander.darLikes();

        System.out.println("Los likes de " + publicacion_sebita.getAutor() + " son: " + publicacion_sebita.verLikes());
        System.out.println("Los likes de " + publicacion_barbara.getAutor() + " son: " + publicacion_barbara.verLikes());
        System.out.println("Los likes de " + publicacion_alexander.getAutor() + " son: " + publicacion_alexander.verLikes());
    }

}






//instacia= copia de una clase
