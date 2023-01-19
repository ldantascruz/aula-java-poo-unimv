package aula4;

import java.util.Arrays;

public class TestaPessoa {
    public static void main(String[] args) {

        Paciente p1 = new Paciente();
        p1.setId(1);
        p1.setNome("João");

        Paciente p2 = new Paciente();
        p2.setId(2);
        p2.setNome("José");

        Medico m1 = new Medico();
        m1.setId(1);
        m1.setNome("Doutora Ana");

        Medico m2 = new Medico();
        m2.setId(2);
        m2.setNome("Doutora Maria");


        p1.chamado();
        m1.chamado();

        p2.sair();
        m2.sair();

        System.out.println("Pacientes: " + Arrays.asList(p1.getNome(), p2.getNome()));
        System.out.println("Médicos: " + Arrays.asList(m1.getNome(), m2.getNome()));

    }
}
