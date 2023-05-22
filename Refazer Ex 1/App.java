import java.util.*;

public class App{
    public static void main(String[] args){
        String nome;
        int menu;
        double salario;
        Scanner ent = new Scanner(System.in);
        Scanner ent2 = new Scanner(System.in);
        Empregado empregado;
        Cadastrar c = new Cadastrar();

        do{
            menu = EscolhaMenu();
            switch(menu){
                case 1: System.out.println("*** CADASTRO DE EMPREGADOS ***");
                        System.out.println("Nome:");
                        nome = ent.nextLine();
                        System.out.println("Salário:");
                        salario = ent.nextDouble();
                        if(salario < 0){
                            salario = -1;
                        }
                        empregado = new Empregado(nome,salario);
                        c.adicionar(empregado);
                        break;
                case 2: System.out.println("Nome do empregado:");
                        nome = ent2.nextLine();
                        c.alterar(nome);
                        break;
                case 3: c.mostrarEmp();
                        break;
                case 4: System.out.println("Nome do empregado:");
                        nome = ent2.nextLine();
                        c.Desc(nome);
                        break;
                case 5: System.out.println("Saindo...");
            }
        }while(menu != 5);
    }


    public static int EscolhaMenu(){
        Scanner ent = new Scanner(System.in);
        int operador;
        System.out.println("***** MENU *****");
        System.out.println("1- Cadastro de empregado");
        System.out.println("2- Alterar informações empregado");
        System.out.println("3- Mostrar empregados");
        System.out.println("4- Calcular desconto");
        System.out.println("4- Sair");

        do{
            System.out.println("Qual opção deseja? ");
            operador = ent.nextInt();
        }while(operador < 1 || operador > 5);
        return operador;
    }
}