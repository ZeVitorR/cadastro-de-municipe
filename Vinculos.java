public class Vinculos implements Imprime {
    private String associacao[]=new String[100];
    private String sindicato[]=new String[100];
    private String clube[]=new String[100];
    private String religiao[]=new String[100];
    public String getAssociacao(int n) {
        return associacao[n];
    }
    public void setAssociacao(String associacao,int n) {
        this.associacao[n] = associacao;
    }
    public String getSindicato(int n) {
        return sindicato[n];
    }
    public void setSindicato(String sindicato,int n) {
        this.sindicato[n] = sindicato;
    }
    public String getClube(int n) {
        return clube[n];
    }
    public void setClube(String clube,int n) {
        this.clube[n] = clube;
    }
    public String getReligiao(int n) {
        return religiao[n];
    }
    public void setReligiao(String religiao,int n) {
        this.religiao[n] = religiao;
    }
    
    public void imprimeDado(int n) {
        System.out.println( "associacao=" + associacao[n] + ", clube=" + clube[n] + ", religiao=" + religiao[n] + ", sindicato="
                + sindicato[n]);
    }
    
}
