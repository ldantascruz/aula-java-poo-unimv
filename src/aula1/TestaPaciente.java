package aula1;
import java.util.Arrays;

public class TestaPaciente {

    public static void main(String[] args) {

        Paciente p1 = new Paciente();
        p1.setId(1);
        p1.setNome("João Silva");

        Paciente p2 = new Paciente();
        p2.setId(2);
        p2.setNome("José Pereira");

        System.out.println("Pacientes: " + Arrays.asList(p1.getNome(), p2.getNome()));
    }
}
