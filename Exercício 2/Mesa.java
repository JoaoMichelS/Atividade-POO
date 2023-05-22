public class Mesa {
        private int QuantPessoas;
        private int MesaNum;
        private double tot;
        public int getQuantPessoas() {
            return QuantPessoas;
        }
        public void setQuantPessoas(int QuantPessoas) {
            this.QuantPessoas = QuantPessoas;
        }
        public void setMesaNum(int n){
            this.MesaNum = n;
        }
        public int getMesaNum(){
            return this.MesaNum;
        }

        public Mesa (int MesaNum, int QuantPessoas) {
            this.tot = 0;
            this.MesaNum = MesaNum;
            this.QuantPessoas = QuantPessoas;
        }
        
        public void fecConta(int tipo) {
            switch (tipo){
                case 1:
                    tot *= 0.9;
                    break;
                case 3:
                    tot *= 0.95;
                    break;
            }
        }
        
        public void getDadosMesa(){
            System.out.println("Número da mesa: " + MesaNum);
            System.out.println("Quantidade de pessoas: " + QuantPessoas);
            System.out.println("Total da conta: " + tot);
        }

        public void pedirProduto (int codigo, int qtde) {

            switch (codigo){
                case 1:
                    tot += qtde * 2;
                    break;
                case 2:
                    tot += qtde * 5;
                    break;
                case 3:
                    tot += qtde * 4;
                    break;
            }
            
        }

        public  double GastPessoa() {
            double GastPessoa = tot / QuantPessoas;
            return GastPessoa;
        }
        
}