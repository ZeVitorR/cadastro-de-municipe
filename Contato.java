public class Contato implements Imprime{
    private String telefone[]=new String[100];
    private String celular[]=new String[100];
    
    public String getTelefone(int n) {
        return telefone[n];
    }
    public void setTelefone(String telefone,int n) {
        this.telefone[n] = telefone;
    }
    public String getCelular(int n) {
        return celular[n];
    }
    public void setCelular(String celular,int n) {
        this.celular[n] = celular;
    }
    
    public void imprimeDado(int n){
        System.out.println("Telefone"+getTelefone(n)+"\tCelular:"+getCelular(n));
    }
}
