public class LampadinaProf {
    int lum;


    public LampadinaProf(){

        lum = 0;
    }

    public  LampadinaProf(int l){
        lum = l;
    }

    public void accendi(int l){
        if(l>=0)
            lum = l;
        else
            System.out.println("ATTENZIONE Op non possibile"); //solo adesso --> poi usermo dell'eccezioni
    }

    public void spegni(){
        lum = 0;
    }

    public String info(){
        String x= "stato: ";
        if(lum>0)
            x+= "Accesa, lumunosità: "+lum;
        else
            x+="Spenta";
     return x;
    }

    public String infoEasy(){
        String x = " Stato: ";
        x+=lum > 0? ("accesa, lum:"+ lum) : "spenta";
        return  x;
    }

    public String infoSuperEasy()
    {
        return lum > 0 ? ("Stato: acceso, lum: "+lum) : "Stato: spenta";
    }
}
