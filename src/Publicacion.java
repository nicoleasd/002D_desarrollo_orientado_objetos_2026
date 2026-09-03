public class Publicacion {
    private String id;
    private String autor;
    private String fechaCreacion;
    private int likes;
    protected boolean estaActiva; //solo los hijos peudes acceder desde afuera (protected)


    Publicacion(String id, String autor){ //contructor= lo que necesita lla mclase para nacer
        this.id = id;
        this.autor = autor;
        this.likes = 0;
    }



    public void validarAutor(String autor){    //set, sin retorno
        if (autor.length() > 20) {
            System.out.println("El nombre del autor es demasiado largo.");
        }else if (autor.isEmpty()) {
            System.out.println("No puede estar vacío.");
        }else{
            this.autor = autor;
        }

    }


   public String getAutor(){
    return this.autor;
}


    public void darLikes(){
        this.likes = this.likes + 1;
    }

    public int verLikes(){
        return this.likes;
    }

   

}
