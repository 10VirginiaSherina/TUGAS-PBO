public class Lingkaran extends Bentuk{
    private double radius;
    private static final double PHI = 3.16;

    public Lingkaran(double radius, String warna){
        super(warna);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double r){
        radius = r;
    }

    public double hitungLuas(){
        return PHI * radius * radius;
    }

    @Override 
    public void printInfo(){
        System.out.println("Lingkaran berwarna " + warna + ", luas = " + hitungLuas());
    }
}
