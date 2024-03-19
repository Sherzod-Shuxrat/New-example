public class Car {
    String rang,model,tuzilma;
    int narxi;
    public String rang(String rang){
        this.rang = rang;
        return rang;
    }
    public String setModel(String model){
        this.model = model;
        return model;
    }
    public String setTuzilma(String tuzilma){
        this.tuzilma = tuzilma;
        return tuzilma;
    }
    public int setNarx() {
        if (tuzilma.equalsIgnoreCase("mexanika"))
            narxi = 100;
        else if (tuzilma.equalsIgnoreCase("avtomat"))
            narxi = 120;
        return narxi;
    }
    public int getNarxi(){
        return narxi;
    }

}
