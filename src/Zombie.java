public class Zombie extends Character{
    boolean CanInffectVillager = true;

    @Override
    public void atacar() {
        // TODO Auto-generated method stub
        super.atacar();
        System.out.println("te persigue y te pega con la pala");
    }

public void infectarAldeano(){
    System.out.println("te mato y te transformo");
}



}
