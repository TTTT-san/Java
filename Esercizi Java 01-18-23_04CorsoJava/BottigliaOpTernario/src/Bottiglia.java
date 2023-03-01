public class Bottiglia {
    private int quantita;
    private String tipo;

    private static final int maxquantita = 100;

    public Bottiglia(){
        quantita = 0;
        tipo = null;

    }
    public Bottiglia(String tipo){
        this.tipo = tipo;
    }
    public Bottiglia(String tipo, int quantita){
        this.tipo = tipo;
        this.quantita = quantita > 0 ? quantita : 0;  //operazione ternaria

    }

    public String stato(){
        return "Tipo: "+this.tipo + "| Quantità: "+quantita + " | Max litri: "+maxquantita;
    }

    public void bevi(int quantita){

        if (quantita < this.quantita )
            this.quantita = quantita > 0 ? this.quantita-quantita : this.quantita;
        else
            this.quantita = 0;
    }

    public void riempi(int quantita){
        if(this.quantita + quantita < maxquantita)
                this.quantita = quantita > 0 ? this.quantita+quantita : this.quantita;
        else
            this.quantita = maxquantita;

    }

}
