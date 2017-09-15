package latihan1;
public class AeroPlane extends Vehicle{
    public void walk(){
        System.out.println("Aeroplan is Flying");
    }
    public static void main(String []args){
        AeroPlane garuda = new AeroPlane();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
}
