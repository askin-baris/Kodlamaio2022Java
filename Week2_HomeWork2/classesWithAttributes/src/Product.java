public class Product {

    // attribute yada field deniyor
    private int _id;
    String name;
    String description;
    double price;
    int stockAmount;
    String renk;

    private String kod;

    //getter
    public int getId() {
        // getter ile değişkenin değerini değiştirebiliriz yada veri tabınından veriyi okuyabiliriz
        return _id;
    }

    //setter
    public void setId(int id) {
        id = id;

    }

    public String get_name() {
        return name;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public String get_description() {
        return description;
    }

    public void set_description(String description) {
        this.description = description;
    }

    public double get_price() {
        return price;
    }

    public void set_price(double price) {
        this.price = price;
    }

    public int get_stockAmount() {
        return stockAmount;
    }

    public void set_stockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String get_renk() {
        return renk;
    }

    public void set_renk(String renk) {
        this.renk = renk;
    }

    public String get_kod() {
        return kod;
    }

    public void set_kod(String kod) {
        this.kod = kod;
    }
    // bu şekilde tanımladığımızda public olarak tanımlanıyor. C# default private tanımlı.
    // private sadece tanımlandığı blokta geçerlidir.
    // encapsulationda getter ve setter kullanıyoruz.
    //"this.id" bu class demek,
}
