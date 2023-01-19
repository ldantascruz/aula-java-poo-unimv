package aula3;

public class TestaPessoa {
    public static void main(String[] args) {

        Medico m1 = new Medico();
        m1.setId(1);
        m1.setNome("Doutor Alexandre");

        Medico m2 = new Medico();
        m2.setId(2);
        m2.setNome("Doutora Rosalia");

        m1.chamado();

        m2.sair();

    }
}
