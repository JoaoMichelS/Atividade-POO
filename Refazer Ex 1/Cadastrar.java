import java.util.*;

public class Cadastrar {
    ArrayList <Empregado> empregados;

    public void adicionar(Empregado e){
        empregados.add(e);
    }

    public Empregado pesquisar(String nome){
        for(int i = 0; i < empregados.size(); i++){
            if(empregados.get(i).getNome().equals(nome)){
                return empregados.get(i);
            }
        }
        return null;
    }

    public void alterar(String nome){
        Empregado pesq;
        pesq = pesquisar(nome);
        Scanner ent = new Scanner(System.in);
        if(pesq == null){
            System.out.println("EMPREGADO NÃO ENCONTRADO!");
        }else{
            System.out.println("Novo nome:");
            pesq.setNome(ent.nextLine());
            System.out.println("Novo salario:");
            pesq.setSalario(ent.nextDouble());
        }
    }

    public void mostrarEmp(){
        System.out.println("**** EMPREGADOS ****");
        for(Empregado empregados : empregados){
            System.out.println("Nome: " + empregados.getNome());
            System.out.println("Salario: " + empregados.getSalario());
        }
    }

    public Cadastrar(){
        empregados = new ArrayList<Empregado>();
    }

    public void Desc(String nome){
        Empregado pesq;
        double salario;
        pesq = pesquisar(nome);
        if(pesq.getSalario() > 1000){
            salario = pesq.getSalario() - (pesq.getSalario() * 0.275);
        } else{
            salario = pesq.getSalario() - (pesq.getSalario() * 0.10);
        }
        System.out.println("O salario do empregado com desconto será de " + salario);
    }
}
