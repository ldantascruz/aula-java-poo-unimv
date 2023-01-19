package aula4;

public class Medico extends Pessoa {

    @Override
    public void sair() {
        System.out.println(this.getNome() + " saiu do plantão.");
    }
}
