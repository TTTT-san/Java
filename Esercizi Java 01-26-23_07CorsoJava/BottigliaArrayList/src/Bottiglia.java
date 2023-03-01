public class Bottiglia {
    private int quantita;
    private int campacita;
    private String contenuto;

    public Bottiglia() {
        quantita = 0;
        campacita = 100;
        contenuto = "vuota";
    }


    public Bottiglia(int quantita, int campacita, String contenuto) {
        this.quantita = quantita > 0 ? quantita : this.quantita;
        this.campacita = campacita > 0 && this.quantita < campacita ? campacita : this.campacita;
        this.contenuto = contenuto;
    }


    public void setQuantita(int quantita) {
        this.quantita = quantita >= 0 ? quantita : this.quantita;
    }

    public void setCampacita(int campacita) {
        this.campacita = campacita > 0 && this.quantita < campacita ? campacita : this.campacita;
    }

    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

    public int getQuantita() {
        return quantita;
    }

    public int getCampacita() {
        return campacita;
    }

    public String getContenuto() {
        return contenuto;
    }

    @Override
    public String toString() {
        return "Capacità: " + campacita + " | Quantità: " + quantita + " | Conteunto: " + contenuto;
    }

    public void bevi(int quantita) {
        if (quantita >= 0) {
            if (quantita < campacita && quantita < this.quantita)                       // 50 -60
                setQuantita(this.quantita - quantita);
            else
                setQuantita(0);

        }
    }

    public void riempi(int quantita) {
        setQuantita(Math.min(quantita + this.quantita, campacita));

    }


}
