package aula4;

public abstract class Pessoa {

    private Integer id;
    private String nome;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void chamado(){
        System.out.println("Quem está aqui é: " + this.getNome());
    }

    public void sair(){
        System.out.println("Quem saiu foi: " + this.getNome());
    }
}
