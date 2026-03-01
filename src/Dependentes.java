
public class Dependentes extends pessoaFisica {


    private int cpfCliente;

    public int getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(int cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public Dependentes(String nome, int cpf, String sexo, int dataNascimento, int cpfCliente) {
        super(nome, cpf, sexo, dataNascimento);
        this.cpfCliente = cpfCliente;
    }
 

}
