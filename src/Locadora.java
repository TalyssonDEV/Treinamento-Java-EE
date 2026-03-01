// import java.io.BufferedWriter;
// import java.io.FileWriter;
// import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

// import javax.swing.text.DateFormatter;

public class Locadora {

    private ArrayList<Cliente> clientes;
    private ArrayList<Dvd> dvds;
    private ArrayList<Locacao> locacao;
    

    public ArrayList<Locacao> getLocacao() {
        return locacao;
    }

    public void setLocacao(ArrayList<Locacao> locacao) {
        this.locacao = locacao;
    }

    public Locadora(ArrayList<Locacao> locacao) {
        this.locacao = locacao;
    }

    Scanner print = new Scanner(System.in);

    public ArrayList<Cliente> getCliente() {
        return clientes;
    }

    public void setCliente(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Dvd> getDvds() {
        return dvds;
    }

    public void setDvds(ArrayList<Dvd> dvds) {
        this.dvds = dvds;
    }

    public Locadora() {

        clientes = new ArrayList<>(0);
        dvds = new ArrayList<>(0);
        locacao = new ArrayList<>(0);
        Cliente cliente1 = new Cliente("Jorge", 21, "M", 1900);
        Cliente cliente2 = new Cliente("Maria", 30, "F", 1909);
        clientes.add(cliente1);
        clientes.add(cliente2);
        Dvd dvd1 = new Dvd(666, "Diablo", "Terror", "Terro ao quadrado");
        Dvd dvd2 = new Dvd(777, " O ato da compadecida", "Humor", "Humor Brasileiro");
        dvds.add(dvd1);
        dvds.add(dvd2);
        

    }

    public void cadastrarcliente() {

        System.out.println("Insira o nome do cliente: ");
        String nome = print.nextLine();
        System.out.println("Insira o (CPF) do cliente: ");
        int cpf = print.nextInt();
        print.nextLine();
        System.out.println("Insira o Sexo do cliente: ");
        String sexo = print.nextLine();
        System.out.println("Insira o data de nascimento do cliente: ");
        int dataNascimento = print.nextInt();
        print.nextLine();
        System.out.println("Insira idade atual do cliente: ");
        int idade = print.nextInt();
        // print.nextLine();

        print.nextLine();

        if(idade < 18)
        {
        
            
            Cliente cliente = new Cliente(nome, cpf, sexo, dataNascimento);
            
             cliente.cadastrarDependente(cpf);

        }

        Cliente novocliente = new Cliente(nome, cpf, sexo, dataNascimento);

        try {
            clientes.add(novocliente);
            System.out.println("Cliente cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println("\nErro");
        }

    }

    public Cliente consultaclienteCpf() {

        System.out.println("\nInsira (CPF) do cliente: ");
        int cpfPesquisa = print.nextInt();
        print.nextLine();
        int tamnaho = clientes.size();

        if (tamnaho == 0) {
            System.out.println("\nLista vazia!");
        } else {
            for (Cliente cliente : clientes) {

                if (cliente.getCpf() == cpfPesquisa) {
                    System.out.println("\nNome cliente" + cliente.getNome() + "\n(CPF) cliente: " + cliente.getCpf()
                            + "\nSexo cliente: " + cliente.getSexo() + "\nData de Nascimento cliente: "
                            + cliente.getDataNascimento() + "\n");
                    return cliente;
                }
            }
        }
        return null;
    }

    public void consultaclienteNome() {

        System.out.println("\nInsira (NOME) do cliente: ");
        String nomePesquisa = print.nextLine();
        int tamnaho = clientes.size();

        if (tamnaho == 0) {
            System.out.println("\nLista vazia!");
        } else {
            for (Cliente cliente : clientes) {

                if (cliente.getNome().equalsIgnoreCase(nomePesquisa)) {
                    System.out.println("\nNome cliente: " + cliente.getNome() + "\n(CPF) cliente: " + cliente.getCpf()
                            + "\nSexo cliente: " + cliente.getSexo() + "\nData de Nascimento cliente: "
                            + cliente.getDataNascimento() + "\n");

                }
            }
        }

    }

    public void cadrastrarDvd() {

        System.out.println("\nInsira o (Codigo) do DVD: ");
        int codigo = print.nextInt();
        print.nextLine();
        System.out.println("Insira o (NOME) do DVD: ");
        String nome = print.nextLine();
        System.out.println("Insira o (GENERO) do DVD: ");
        String genero = print.nextLine();
        System.out.println("Insira o (DESCRIÇÃO) do DVD: ");
        String descricao = print.nextLine();

        try {
            Dvd novoDvd = new Dvd(codigo, nome, genero, descricao);
            System.out.println("\nDVD cadastrado com sucesso!\n");
            dvds.add(novoDvd);
        } catch (Exception e) {
            System.out.println("\nErro!\n");
        }

    }

    public void consultarDvdCodigo() {
        System.out.println("\nInsira o (CODIGO) do DVD: ");
        int codigoPesquisa = print.nextInt();
        consultarDvdCodigo(codigoPesquisa);

    }

    public Dvd consultarDvdCodigo(int codigoPesquisa) {

        int tamnaho = dvds.size();

        if (tamnaho == 0) {
            System.out.println("\nLista de DVDS vazia!");
        } else {
            for (Dvd dvdss : dvds) {
                if (dvdss.getCodigoDvd() == codigoPesquisa) {
                    System.out.println("\nCodigo: " + dvdss.getCodigoDvd() + "\nNome: " + dvdss.getNomeDvd() +
                            "\nGenero: " + dvdss.getGeneroDvd() + "\nDescrição: " + dvdss.getDescricaoDvd());
                    return dvdss;
                }

            }
        }
        System.out.println("\nCodigo Invalido!\n");
        return null;
    }

    public void consultarDvdNome() {

        System.out.println("Insira o (NOME) do DVD: ");
        String nomePesquisa = print.nextLine();

        int tamnaho = dvds.size();

        if (tamnaho == 0) {
            System.out.println("Lista Vazia");
        } else {
            for (Dvd dvdss : dvds) {
                if (dvdss.getNomeDvd().equalsIgnoreCase(nomePesquisa)) {
                    System.out.println("\nCodigo: " + dvdss.getCodigoDvd() + "\nNome: " + dvdss.getNomeDvd() +
                            "\nGenero: " + dvdss.getGeneroDvd() + "\nDescrição: " + dvdss.getDescricaoDvd() + "\n");
                    break;
                } else {
                    System.out.println("\nCodigo Invalido!\n");
                }

            }
        }

    }

    public void locarDvd() {

        System.out.println("\nDigite (CODIGO) do Dvd: ");
        int codigoPesquisa = print.nextInt();
        print.nextLine();

        Dvd resultCodigo = consultarDvdCodigo(codigoPesquisa);

        if (resultCodigo != null) {

            System.out.println("\nInsira o (CPF) do cliente: ");
            int cpf = print.nextInt();

            Locacao novaLocacao = new Locacao(codigoPesquisa, resultCodigo.getNomeDvd(), resultCodigo.getGeneroDvd(),
                    resultCodigo.getGeneroDvd(), cpf);

            try {
                locacao.add(novaLocacao);
                System.out.println("\nFilme locado com sucesso!\n");

            } catch (Exception e) {
                System.out.println("\nErro!\n");
            }
        }
    }

    public void devolverDvd() {

        System.out.println("\nDigite (CODIGO) do Dvd: ");
        int codigoPesquisa = print.nextInt();
        print.nextLine();

        Dvd resultCodigo = consultarDvdCodigo(codigoPesquisa);

        if (resultCodigo != null) {

            System.out.println("\nInsira o (CPF) do cliente: ");
            int cpf = print.nextInt();

            Locacao novaLocacao = new Locacao(codigoPesquisa, resultCodigo.getNomeDvd(), resultCodigo.getGeneroDvd(),
                    resultCodigo.getGeneroDvd(), cpf);

            try {
                locacao.remove(novaLocacao);
                System.out.println("\nFilme Devolvido com sucesso!\n");

            } catch (Exception e) {
                System.out.println("\nErro!\n");
            }
        }
    }

    public void consultarDvdLocado() {
        int tamanho = locacao.size();

        if (tamanho == 0) {
            System.out.println("\nLista vazia!\n");
        } else {
            for (Locacao locacao : locacao) {
                System.out.println("\nCodigo: " + locacao.getCodigoDvd() + "\nNome: " + locacao.getNomeDvd() +
                        "\nGenero: " + locacao.getGeneroDvd() + "\nDescrição: " + locacao.getDescricaoDvd() + "\n");

            }
        }
    }

    public void consultarClientesComlocacao() {

        int tamanho = locacao.size();

        if (tamanho == 0) {
            System.out.println("\nLista vazia!\n");
        } else {
            for (Locacao locacao : locacao) {
                System.out.println("(CPF) com locaçao: " + locacao.getCpfCliente());
            }
        }

    }

    public void consultarFilmesPorCliente() {
        System.out.println("\nInsira o (CPF) do Cliente: ");
        int cpfPesquisa = print.nextInt();

        int tamanho = locacao.size();

        if (tamanho == 0) {
            System.out.println("\nLista vazia!\n");
        } else {
            for (Locacao locacao : locacao) {

                if (locacao.getCpfCliente() == cpfPesquisa) {
                    System.out.println("\nCodigo: " + locacao.getCodigoDvd() + "\nNome: " + locacao.getNomeDvd() +
                            "\nGenero: " + locacao.getGeneroDvd() + "\nDescrição: " + locacao.getDescricaoDvd() + "\n");
                }

            }
        }

    }

    // public void salvarArquivo()
    // {
        

    //     try {
    //         BufferedWriter escreve = new BufferedWriter(new FileWriter("Dados.txt"));
    //         LocalDateTime horaAgora =  LocalDateTime.now();

    //         int dado = horaAgora;

    //         escreve.write();
            
    //     } catch (Exception e) {
    //         
    //     }
    // }

}
