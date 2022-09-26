public class Main {

    public static void main(String[] args) {
// Java iş yapan herşey Class'tır.
//    Classlarla operasyonları, methodları grupluyoruz.
        // Classlar reference type
        // bellekte yer tutulması stack ve heap. Stack sol tarafta tutulan kısım. Heap nesneden örnek oluşan kısım.
        // Garbage Collector heapte tutulan yeri silebilir.
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();


        //value
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);


        //diziler referans tiptir
        int [] sayilar1 = new int [] {1,2,3};
        int [] sayilar2 = new int [] {4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);
}
}

