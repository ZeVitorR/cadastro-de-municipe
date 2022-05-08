public class  Titulo extends Documentos{
    private int secao[]=new int[100];
    private int zona[]=new int[100];

    public int getSecao(int n) {
        return secao[n];
    }

    public void setSecao(int secao,int n) {
        this.secao[n] = secao;
    }

    public int getZona(int n) {
        return zona[n];
    }

    public void setZona(int zona,int n) {
        this.zona[n] = zona;
    }

    public String imprimeDoc(int n){
        return "Titulo: "+ getNumero(n) + "secao:"+ getSecao(n) + "zona" + getZona(n);
    }

}