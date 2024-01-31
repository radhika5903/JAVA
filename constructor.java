class Sphere{
    private int radius;

    public Sphere(){
         radius = 3;
    }
    public Sphere(int r){
       radius = r;
    }
    public int getRadius(){
        return radius;
    }
   public double getArea(){
        double a = 4*3.14*radius*radius;
        return a;

    }
    public double getVolume(){
        double  v = 4/3*3.14f*radius*radius*radius;
        return v;
    }

}
public class constructor{
    public static void main(String[]args){
      Sphere sp = new Sphere();
      System.out.println(sp.getRadius());
      System.out.println(sp.getArea());
      System.out.println(sp.getVolume());



    }
}