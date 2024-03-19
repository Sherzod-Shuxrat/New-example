public class Person {
    String jinsi,millat;
    int yoshi,boyi;
    public int setYoshi(int yosh){
        yoshi = yosh;
        return yosh;
    }
    public String setJinsi(String jins){
        jinsi = jins;
        return jins;
    }
    public void getInfo(){
        String s = "";
        if (yoshi > 0 && yoshi <= 6)
            s = "godak";
        else if (yoshi > 6 &&  yoshi <= 17)
            s = "osmir";
        else if (yoshi >= 18)
            s = "yoshi katta";
        System.out.println(s + " " + jinsi);
    }
}
