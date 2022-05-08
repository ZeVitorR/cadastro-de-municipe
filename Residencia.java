public class Residencia implements Imprime{
  private int numero[]=new int[100];
  private String bairro[]=new String[100];
  private String endereco[]=new String[100];

public int getNumero(int n) {
    return numero[n];
}
public void setNumero(int numero,int n) {
    this.numero[n] = numero;
}
public String getBairro(int n) {
    return bairro[n];
}
public void setBairro(String bairro, int n) {
    this.bairro[n] = bairro;
}
public String getEndereco(int n) {
    return endereco[n];
}
public void setEndereco(String endereco, int n) {
    this.endereco[n] = endereco;
}

public void imprimeDado(int n) {
    System.out.println( "bairro=" + bairro[n] + ", endereco=" + endereco[n] + ", numero=" + numero[n]);
}




}