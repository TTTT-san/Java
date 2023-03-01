public class Bottiglia {
    private int quantita;
    private  String tipo;

    public Bottiglia(int quantita, String tipo){
        this.quantita = quantita;
        this.tipo = tipo;
    }

    public int getQuantita(){
      return quantita;
    }

    public String getTipo() {
        return tipo;
    }

    public void bevi(int quantita){
        if(this.quantita>quantita)
            this.quantita-=quantita;
    }

    public void riempi(int quantita){
        if(quantita>0)
            this.quantita+=quantita;
    }



}
