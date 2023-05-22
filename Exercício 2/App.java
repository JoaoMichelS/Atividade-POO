public class App {
    public static void main(String[] args){
        Mesa mesa1 = new Mesa(1, 2);
        Mesa mesa2 = new Mesa(2, 4);
        mesa1.pedirProduto(1, 1);  
        mesa1.pedirProduto(2, 2);
        mesa2.pedirProduto(1, 3);   
        mesa2.pedirProduto(2, 2); 
        mesa1.getDadosMesa();
        mesa2.getDadosMesa();
        mesa1.fecConta(3);
        mesa2.fecConta(2);
        mesa1.GastPessoa();
        System.out.println("O valor por pessoa da mesa " + mesa1.getMesaNum() + " foi: " + mesa1.GastPessoa());
        mesa2.GastPessoa();
        System.out.println("O valor por pessoa da mesa " + mesa2.getMesaNum() + " foi: " + mesa2.GastPessoa());
        if(mesa1.GastPessoa() > mesa2.GastPessoa()) {
            System.out.println("O gasto por pessoa foi maior na mesa 1 ");
            
        }else {
            System.out.println("O gasto por pessoa foi maior na mesa 2");
        }
    }    
} 

