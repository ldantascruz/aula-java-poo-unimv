package aula5;

public class TestaPessoa {
    public static void main(String[] args) {

        // Polimorfismo
        Pessoa m1 = new Medico();
        Pessoa p1 = new Paciente();

        m1.comer();
        p1.comer();

    }
}
