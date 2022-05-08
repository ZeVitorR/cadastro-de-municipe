

public class CupomFiscal implements RespostaCupom{
    private String resposta[]=new String[100];



    public String getResposta(int n) {
        return resposta[n];
    }

    public void setResposta(String resposta, int n) {
        this.resposta[n] = resposta;
        }

	public String getRespostaCupom(int n) {
        return resposta[n];

	}


    


}