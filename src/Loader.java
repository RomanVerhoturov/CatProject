
public class Loader {
    public static void main(String[] args) {
        Cat cat = new Cat(2500.0);
        Cat cat2 = new Cat(1020.0);


        cat.meow();
        cat.feed(10000.0);
        cat.feed(10000.0);
        cat.feed(10000.0);

        cat.goTual();
        while (cat2.getStatus() != "Dead") {
            cat2.meow();
            System.out.println(cat2.getStatus());
        }


        System.out.println(cat.getWeight());
        System.out.println(cat2.getWeight());
        System.out.println(cat.getStatus());
        System.out.println(cat.getCount());

        int a = 10;
        System.out.println(a);
        System.out.println(cat);

    /*    do {
            cat.feed(5.0);
        }while (cat.getStatus() != "Exploded");

        System.out.println(cat.getStatus());
        System.out.println(cat.getEat());
    } */
    }
}