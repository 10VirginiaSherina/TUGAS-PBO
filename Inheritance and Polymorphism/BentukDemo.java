public class BentukDemo {
    public static void main(String[] args) {
        Bentuk objekBentuk = new Bentuk("pink");
        BujurSangkar objekBujur = new BujurSangkar(4.0, "hijau");
        Lingkaran objekLingkaran = new Lingkaran(5.0, "coklat");
        Silinder objekSilinder = new Silinder(7.0, 5.0, "hitam");

        objekBentuk.printInfo();
        objekBujur.printInfo();
        objekLingkaran.printInfo();
        objekSilinder.printInfo();
    }
}
