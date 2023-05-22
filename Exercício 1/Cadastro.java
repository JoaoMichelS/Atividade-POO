import java.util.*;

public class Cadastro {

    ArrayList <Empregado> empregados;

   

    public Cadastro() {

        empregados = new ArrayList<Empregado>();

    }



    public void inserir (Empregado c) {

        empregados.add(c);

    }



    public Empregado buscar(String nome) {
        for(int i = 0; i < empregados.size(); i++) {
            if(empregados.get(i).getNome().equals(nome)) {
                return empregados.get(i);
            }      
        }
        return null;
    }



    public void modificar(String nome) {

        Empregado buscarEmpregado;

        buscarEmpregado = buscar(nome);

        Scanner entrada = new Scanner(System.in);

       

        System.out.println(" Alterando Empregado ");

        if(buscarEmpregado == null) {

            System.out.println(" --- Empregado não encontrado --- ");

        } else {

            System.out.println("Digite novo nome:");

            buscarEmpregado.setNome(entrada.nextLine());

            System.out.println("Digite novo salario: ");

            buscarEmpregado.setSalario(entrada.nextLine());

        }
            entrada.close();
    }



    public void listaEmpregados() {

       

       System.out.println("--- Lista de Empregados ---");

        for(Empregado c : empregados) {

            System.out.println("Nome: " + c.getNome());

            System.out.println("Salario: " + c.getSalario());

        }

    }
}

