public class Car {
    private double resa; /* litri/chilometri */
    private double carburante;
    private double serbatoglio;


    public Car() {
        resa =14;// 1 litro di benzina per 14 km --> 1/km
        carburante = 0;
        serbatoglio = 65;
    }

    public double getResa() {
        return resa;
    }

    public double getCarburante() {
        return carburante;
    }

    public double getSerbatoglio() {
        return serbatoglio;
    }

    public void setResa(double resa) {
        this.resa = resa > 0 ? resa : this.resa;
    }

    public void setCarburante(double carburante) {
        if (carburante > 0)
            this.carburante = carburante;
    }

    public void addGas(int carburante) {
        if (carburante > 0)
            if (carburante + this.carburante < serbatoglio)
                setCarburante(this.carburante + carburante);

    }

    public void setSerbatoglio(double serbatoglio) {
        this.serbatoglio = serbatoglio > 0 && carburante < serbatoglio ? serbatoglio : this.serbatoglio;
    }


    public String toString() {
        return "Carburante: " + carburante;
    }


    public void drive(double km) {
        setCarburante(this.carburante - km/resa);
        /* l/km = 14  --> l = 14 / km */
        /*  1/14 = x/ km    (x = (1*km) /14    */
    }


}
