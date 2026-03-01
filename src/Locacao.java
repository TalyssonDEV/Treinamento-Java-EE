public class Locacao extends Dvd{
     private int cpfCliente;

     public int getCpfCliente() {
          return cpfCliente;
     }

     public void setCpfCliente(int cpfCliente) {
          this.cpfCliente = cpfCliente;
     }

     public Locacao(int codigoDvd, String nomeDvd, String generoDvd, String descricaoDvd, int cpfCliente) {
          super(codigoDvd, nomeDvd, generoDvd, descricaoDvd);
          this.cpfCliente = cpfCliente;
     }   
}
