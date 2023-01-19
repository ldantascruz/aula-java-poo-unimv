package aula5;

public class Paciente implements Pessoa{
    @Override
    public void andar() {
        System.out.println("O paciente está andando");
    }

    @Override
    public void comer() {
        System.out.println("O paciente está comendo");
    }

    @Override
    public void dormir() {
        System.out.println("O paciente está dormindo");
    }
}
