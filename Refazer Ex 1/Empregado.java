public class Empregado {
    private String nome;
    private double salario;

    public Empregado(String nome, Double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public Empregado(){
        this.nome="";
        this.salario=0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void mostrar() {
        System.out.println("*****************");
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);

    }
}
