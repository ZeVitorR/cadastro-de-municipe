public class Pessoas implements Imprime{
    private String nome[]=new String[100];
    private String sexo[]=new String[100];
    private String naturalidade[]=new String[100];
    private String cor[]=new String[100];
    private String mae[]=new String[100];
    private String pai[]=new String[100];
    private String nescessidade[]=new String[100];
    private String estadoCivil[]=new String[100];
    private String nascimento[]=new String[100];
    private String dataChegada[]=new String[100];
    private String ocupacao[]=new String[100];
    private String nacionalidade[]=new String[100];

    public String getNome(int n) {
        return nome[n];
    }
    
    public String getNacionalidade(int n) {
        return nacionalidade[n];
    }
    public void setNacionalidade(String nacionalidade,int n) {
        this.nacionalidade[n] = nacionalidade;
    }
    public void setNome(String nome,int n) {
        this.nome[n] = nome;
    }
    public String getSexo(int n) {
        return sexo[n];
    }
    public void setSexo(String sexo,int n) {
        this.sexo[n] = sexo;
    }
    public String getNaturalidade(int n) {
        return naturalidade[n];
    }
    public void setNaturalidade(String naturalidade,int n) {
        this.naturalidade[n] = naturalidade;
    }
    public String getCor(int n) {
        return cor[n];
    }
    public void setCor(String cor,int n) {
        this.cor[n] = cor;
    }
    public String getMae(int n) {
        return mae[n];
    }
    public void setMae(String mae,int n) {
        this.mae[n] = mae;
    }
    public String getPai(int n) {
        return pai[n];
    }
    public void setPai(String pai,int n) {
        this.pai[n] = pai;
    }
    public String getNescessidade(int n) {
        return nescessidade[n];
    }
    public void setNescessidade(String nescessidade,int n) {
        this.nescessidade[n] = nescessidade;
    }
    public String getEstadoCivil(int n) {
        return estadoCivil[n];
    }
    public void setEstadoCivil(String estadoCivil,int n) {
        this.estadoCivil[n] = estadoCivil;
    }
    public String getNascimento(int n) {
        return nascimento[n];
    }
    public void setNascimento(String nascimento,int n) {
        this.nascimento[n] = nascimento;
    }
    public String getDataChegada(int n) {
        return dataChegada[n];
    }
    public void setDataChegada(String dataChegada,int n) {
        this.dataChegada[n] = dataChegada;
    }
    public String getOcupacao(int n) {
        return ocupacao[n];
    }
    public void setOcupacao(String ocupacao,int n) {
        this.ocupacao[n] = ocupacao;
    }
    

    public void imprimeDado(int n){
        System.out.println("nome"+getNome(n)+"\ncor"+getCor(n)+ "\nsexo:"+getSexo(n)+
         "\nnascimento:"+getNascimento(n)+"\nnaturalidade:"+getNaturalidade(n)+"\nnacionalidade:"+getNacionalidade(n)+
         "\nestado civil"+getEstadoCivil(n)+"\tOcupacao:"+getOcupacao(n)+"\nnescessidades:"+getNescessidade(n)+
         "\nnome do pai:"+getPai(n)+"\nnome da mae:"+getMae(n)+
         "\ndata de chegada"+getDataChegada(n));
    }
}