public class Lampadina {
    private int stato;


    public Lampadina() {
        stato = 0;
    }

    public Lampadina(int stato) {
        this.stato = stato == 1 || stato == 0 ? stato : this.stato;
    }

    public void setStato(int stato) {
        this.stato = stato == 1 || stato == 0 ? stato : this.stato;
    }

    public int getStato() {
        return stato;
    }

    public void accendi(){
        setStato(1);
    }
    public void spegni(){
        setStato(0);
    }

    public String toString(){
        return this.stato == 1 ?"accesa" : "spenta";
    }
}
