import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends pessoaFisica {

    
    private ArrayList<Dependentes>dependentes;
    Scanner print = new Scanner(System.in );

   

    public Cliente(String nome, int cpf, String sexo, int dataNascimento, ArrayList<Dependentes> dependentes) {
        super(nome, cpf, sexo, dataNascimento);
        this.dependentes = dependentes;
    }

    public Cliente(String nome, int cpf, String sexo, int dataNascimento) {
        super(nome, cpf, sexo, dataNascimento);
    }

    public ArrayList<Dependentes> getDependentes() {
        return dependentes;
    }

    public void setDependentes(ArrayList<Dependentes> dependentes) {
        this.dependentes = dependentes;
        this.dependentes = new ArrayList<>(0);
    }

    public void cadastrarDependente(int cpf) {

        System.out.println("\n | CLiente Menor de Idade |\n ");
        System.out.println("Insira o nome do Dependente: ");
        String nomeD = print.nextLine();
        System.out.println("Insira o (CPF) do Dependente: ");
        int cpfD = print.nextInt();
        print.nextLine();
        System.out.println("Insira o Sexo do Dependente: ");
        String sexoD = print.nextLine();
        System.out.println("Insira o data de nascimento do Dependente: ");
        int dataNascimentoD = print.nextInt();
        print.nextLine();

        Dependentes novoDependente = new Dependentes(nomeD, cpfD, sexoD, dataNascimentoD, cpf);

        try {
           dependentes.add(novoDependente);
            System.out.println("\nDependente cadastrado!");
            
        } catch (Exception e) {
            System.out.println("\nErro\n");
        }
        
    }

   

    
    
    
   
    
}
