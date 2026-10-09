public class Silinder extends Lingkaran{
    private double tinggi;

    public Silinder (double tinggi, double radius, String warna){
        super(radius, warna);
        this.tinggi = tinggi;
    }

    public double getTinggi(){
        return this.tinggi;
    }

    public void setTinggi(double t){
        tinggi = t;
    }

    public double hitungVolume(){
        return tinggi * hitungLuas();
    }

    @Override 
    public void printInfo(){
        System.out.println("Silinder berwarna " + warna + ", volume = " + hitungVolume());
    }
}
