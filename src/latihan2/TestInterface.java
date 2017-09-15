package latihan2;
public class TestInterface {
    public static void main(String []args){
        //membuat 2 objek
        Line line = new Line (12,36,27,3);
        Line line2 = new Line (33,22,15,8);
        //length objek 1 dan 2
        System.out.println("Panjang Angka Objek 1 = "+line.getLength());
        System.out.println("Panjang Angka Objek 2 = "+line2.getLength());
        System.out.println("");
        //perbandingan
        System.out.println("Perbandingan Objek 1 > Objek 2 = "+line.isGreater(line,line2));
        System.out.println("Perbandingan Objek 1 < Objek 2 = "+line.isLess(line,line2));
        System.out.println("Perbandingan Objek 1 = Objek 2 = "+line.isEqual(line,line2));
        
    }
}
