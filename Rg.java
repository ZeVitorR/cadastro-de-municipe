public class Rg extends Documentos{
    private String emissor[]=new String[100];
    private String uf[]=new String[100];
    private String date[]=new String[100];

    
    public String getDate(int n) {
        return date[n];
    }


    public void setDate(String date, int n) {
        this.date[n] = date;
    }


    public String getUf(int n) {
        return uf[n];
    }


    public void setUf(String uf,int n) {
        this.uf[n] = uf;
    }

    public String getEmissor(int n) {
        return emissor[n];
    }

    public void setEmissor(String emissor,int n) {
        this.emissor[n] = emissor;
    }
    
    public String imprimeDoc(int n){
        return "RG:" + getNumero(n) + " Emissor:" + getEmissor(n) + " UF:" + getUf(n) + "\n";
    }
}
