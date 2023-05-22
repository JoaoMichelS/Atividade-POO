import java.util.*;

public class App {

    public static void main(String[] args)  {

       int menuEscolha;

       String nome;

       String salario;

       Scanner entrada = new Scanner(System.in);

       Empregado c;

       Cadastro a = new Cadastro();

       

       do {

       menuEscolha = escolhaMenu();

       switch(menuEscolha) {

            case 1: System.out.println("-- Cadastro Empregrado --");

                    System.out.println("Digite o nome:");

                    nome = entrada.nextLine();

                    System.out.println("Digite o salario:");

                    salario = entrada.nextLine();

                    c = new Empregado(nome,salario);

                    a.inserir(c);

                    break;

            case 2: System.out.println("Acrescimo de salário manual");

                    System.out.println("Digite nome do Empregado a ter seu salario aumentado");

                    nome = entrada.nextLine();

                    a.modificar(nome);

                    break;

                    // aqui abaixo você consegue verificar os Empregados, assim vendo qual tem maior salarios e afins.

            case 3: System.out.println("Verificar Empregados e seus salários");

                    a.listaEmpregados();

                    break;

            case 4: System.out.println("Encerrando a Aplicação");

        }

    } while(menuEscolha != 4);



    }



    public static  int escolhaMenu() {

        Scanner entrada = new Scanner(System.in);

        int op;

        System.out.println("---- Menu Geral ----");

        System.out.println("1) Cadastrar o Empregado");

        System.out.println("<2> Buscar Empregado");

        System.out.println("<3> Modificar Empregado");

        System.out.println("<4> Sair");

        System.out.println("**");

     

        do {

            System.out.println("Escolha uma opção");

            op = entrada.nextInt();

        } while (op < 1 || op > 4);



        return op;




    }
    

}