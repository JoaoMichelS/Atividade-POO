import java.util.*;

public class Empregado {

    private String nome;

    private String salario;



    public Empregado(String nome, String salario) {

        this.nome = nome;

        this.salario = salario;

    }



    public Empregado () {

        this.nome = "";

        this.salario = "";

    }



    public String getNome() {

        return nome;

    }



    public void setNome(String nome) {

        this.nome = nome;

    }



    public String getSalario() {

        return salario;

    }



    public void setSalario(String salario) {

        this.salario = salario;

    }



    public void imprimir() {

        System.out.println("-------------------");

        System.out.println("Nome: " + nome);

        System.out.println("Salario: " + salario);

    }



   

}