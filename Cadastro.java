public class Cadastro {
    private  Pessoas cidadao;
    private Contato contatoCidadao;
    private CupomFiscal cupomCidadao;
    private Educacao eduCidadao;
    private Residencia residenciaCidadao;
    private Rg rgCidadao;
    private Cpf cpfCidado;
    private Titulo tituloCidadao;
    private Vinculos vinculoCidadao;
    private int dependente[]=new int[100];
    
    public Pessoas getCidadao() {
        return cidadao;
    }
    public void setCidadao(Pessoas cidadao) {
        this.cidadao = cidadao;
    }
    public Contato getContatoCidadao() {
        return contatoCidadao;
    }
    public void setContatoCidadao(Contato contatoCidadao) {
        this.contatoCidadao = contatoCidadao;
    }
    public CupomFiscal getCupomCidadao() {
        return cupomCidadao;
    }
    public void setCupomCidadao(CupomFiscal cupomCidadao) {
        this.cupomCidadao = cupomCidadao;
    }
    public Educacao getEduCidadao() {
        return eduCidadao;
    }
    public void setEduCidadao(Educacao eduCidadao) {
        this.eduCidadao = eduCidadao;
    }
    public Residencia getResidenciaCidadao() {
        return residenciaCidadao;
    }
    public void setResidenciaCidadao(Residencia residenciaCidadao) {
        this.residenciaCidadao = residenciaCidadao;
    }

    public Rg getRgCidadao() {
        return rgCidadao;
    }
    public void setRgCidadao(Rg rgCidadao) {
        this.rgCidadao = rgCidadao;
    }
    public Cpf getCpfCidado() {
        return cpfCidado;
    }
    public void setCpfCidado(Cpf cpfCidado) {
        this.cpfCidado = cpfCidado;
    }
    public Titulo getTituloCidadao() {
        return tituloCidadao;
    }
    public void setTituloCidadao(Titulo tituloCidadao) {
        this.tituloCidadao = tituloCidadao;
    }
   
    
    public Vinculos getVinculoCidadao() {
        return vinculoCidadao;
    }
    public void setVinculoCidadao(Vinculos vinculoCidadao) {
        this.vinculoCidadao = vinculoCidadao;
    }
    public int getDependente(int n) {
        return dependente[n];
    }
    public void setDependente(int dependente,int n) {
        this.dependente[n] = dependente;
    }
    public void imprimeTudo(int n) {
        getCidadao().imprimeDado(n);
        getContatoCidadao().imprimeDado(n);
        System.out.println("Cupom fiscal:"+getCupomCidadao().getRespostaCupom(n));
        System.out.println("os documentos do cidadão é\n"+getRgCidadao().imprimeDoc(n));
        System.out.println(getCpfCidado().imprimeDoc(n));
        System.out.println(getTituloCidadao().imprimeDoc(n));
        getEduCidadao().imprimeDado(n);
        getResidenciaCidadao().imprimeDado(n);
        System.out.println("dependentes:"+dependente[n]);
        getVinculoCidadao().imprimeDado(n);
    }
    
}
