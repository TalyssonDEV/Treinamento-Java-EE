import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner print = new Scanner(System.in);
        Locadora locadora = new Locadora();
        
        int op = 0;

        do
        {
            imprimirMenu();
            System.out.println("\nInsira a opcao: ");
            op = print.nextInt();
            print.nextLine();
            switch(op)
            {
                case 1:
                 locadora.cadastrarcliente();
                break;
                case 2:
                 locadora.consultaclienteCpf();
                break;
                case 3:
                 locadora.consultaclienteNome();
                break;
                case 4:
                 locadora.cadrastrarDvd();
                break;
                case 5:
                 locadora.consultarDvdCodigo();
                break;
                case 6:
                 locadora.consultarDvdNome();
                break;
                case 7:
                 locadora.locarDvd();
                break;
                case 8:
                 locadora.devolverDvd();
                break;
                case 9:
                 locadora.consultarDvdLocado();
                break;
                case 10:
                 locadora.consultarClientesComlocacao();
                break;
                case 11:
                 locadora.consultarFilmesPorCliente();
                break;
                
            }

        }
        while(op!=12);
         print.close();
    }

    public static void imprimirMenu()
    {
        System.out.println(" 1 - Cadastrar cliente");
        System.out.println(" 2 - Consultar cliente (CPF)");
        System.out.println(" 3 - Consultar cliente (NOME)");
        System.out.println(" 4 - Cadastrar DVD");
        System.out.println(" 5 - Consultar DVD (CODIGO)");
        System.out.println(" 6 - Consultar DVD (NOME)");
        System.out.println(" 7 - Locar um DVD");
        System.out.println(" 8 - Devolver um DVD");
        System.out.println(" 9 - Consultar DVDs (LOCADOS)");
        System.out.println("10 - Consultar clientes com filmes (LOCADOS)");
        System.out.println("11 - Consultar Filmes locado por um cliente (CPF)");


    }
   
    
}
