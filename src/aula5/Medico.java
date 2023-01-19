package aula5;

public class Medico implements Pessoa{

    @Override
    public void andar() {
        System.out.println("O doutor está andando");
    }

    @Override
    public void comer() {
        System.out.println("O doutor está comendo");
    }

    @Override
    public void dormir() {
        System.out.println("O doutor está dormindo");
    }
}
