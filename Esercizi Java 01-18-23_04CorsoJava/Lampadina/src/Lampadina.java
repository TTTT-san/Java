public class Lampadina {

    //data member
    private int stato; // 1 --> accesso 0 --> spento

    public Lampadina(int stato) {
        this.stato = stato;
    }

    public int getStato() {
        return stato;
    }

    public void setStato(int stato) {
        if (stato == 1 | stato == 0)
            this.stato = stato;
        else
            this.stato = 0;
    }

    public String statoLamp() {
        if (stato == 1)
            return "Acccesso";

        return "Spento";
    }
}
