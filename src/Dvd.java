public class Dvd {

     private int codigoDvd;
     private String nomeDvd;
     private String generoDvd;
     private String DescricaoDvd;
     
    public int getCodigoDvd() {
        return codigoDvd;
    }

    public void setCodigoDvd(int codigoDvd) {
        this.codigoDvd = codigoDvd;
    }

    public String getNomeDvd() {
        return nomeDvd;
    }

    public void setNomeDvd(String nomeDvd) {
        this.nomeDvd = nomeDvd;
    }

    public String getGeneroDvd() {
        return generoDvd;
    }

    public void setGeneroDvd(String generoDvd) {
        this.generoDvd = generoDvd;
    }

    public String getDescricaoDvd() {
        return DescricaoDvd;
    }

    public void setDescricaoDvd(String descricaoDvd) {
        DescricaoDvd = descricaoDvd;
    }

    public Dvd(int codigoDvd, String nomeDvd, String generoDvd, String descricaoDvd) {
        this.codigoDvd = codigoDvd;
        this.nomeDvd = nomeDvd;
        this.generoDvd = generoDvd;
        DescricaoDvd = descricaoDvd;
    }
    
}
