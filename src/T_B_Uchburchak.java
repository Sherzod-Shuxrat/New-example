public class T_B_Uchburchak {
    int a,b;
    public float gipotenuza(int a,int b){
        float c;
        c = (float) Math.sqrt(a*a+b*b);
        return c;
    }
    public float yuzi(int a,int b){
        float s = (float) (a * b / 2);
        return s;
    }
    public float perimetr(int a,int b){
        float p = a + b + gipotenuza(a,b);
        return p;
    }
    public void turi(int a, int b){
        if (a == b){
            System.out.println("teng yonli");
        }
        else if (Math.sqrt(a*a+b*b) == gipotenuza(a,b)) {
            System.out.println("pifagor uchburchagi");
        }
    }
}
