public class Educacao implements Imprime {
    private String estudoPretendido[]=new String[100];
    private String escolariedade[]=new String[100];
    private String voltaEstudo[]=new String[100];
    private String local[]=new String[100];
    private String formacao[]=new String[100];
    public String getEstudoPretendido(int n) {
        return estudoPretendido[n];
    }
    public void setEstudoPretendido(String estudoPretendido,int n) {
        this.estudoPretendido[n] = estudoPretendido;
    }
    public String getEscolariedade(int n) {
        return escolariedade[n];
    }
    public void setEscolariedade(String escolariedade, int n) {
        this.escolariedade[n] = escolariedade;
    }
    
    public String getVoltaEstudo(int n) {
        return voltaEstudo[n];
    }
    public void setVoltaEstudo(String voltaEstudo, int n) {
        this.voltaEstudo[n] = voltaEstudo;
    }
    public String getLocal(int n) {
        return local[n];
    }
    public void setLocal(String local, int n) {
        this.local[n] = local;
    }
    public String getFormacao(int n) {
        return formacao[n];
    }
    public void setFormacao(String formacao, int n) {
        this.formacao[n] = formacao;
    }

    public void imprimeDado(int n) {
        System.out.println( "escolariedade=" + escolariedade[n] + ", estudo pretendido=" + estudoPretendido[n] + ", formacao="
                + formacao[n] + ", onde estuda=" + local[n] + ", voltar estudar=" + voltaEstudo[n]);
    }
    
}
