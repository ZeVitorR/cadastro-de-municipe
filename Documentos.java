public abstract class Documentos{
    private String numero[]=new String[100];

    public void setNumero(String num,int n){
        this.numero[n] = num;
    }
    public String getNumero(int n){
        return numero[n];
    }
    public abstract String imprimeDoc(int n);

}