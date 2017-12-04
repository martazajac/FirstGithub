package Paka;


public class Point {
    public float x;
    public float y;

    public float DistancefromOrigin(){
        float odleglosc= (float) Math.sqrt(x*x+y*y);
        System.out.println("odległość to " + odleglosc);
        return odleglosc;
    }

}
