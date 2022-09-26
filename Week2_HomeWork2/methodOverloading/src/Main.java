public class Main {

    public static void main(String[] args) {
	// ortak alanları ve attributeları tutmak için class kullanıyoruz.
        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(2,3));
        dortIslem.topla(4,2,3);
    }
}
