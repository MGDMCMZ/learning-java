package classroom;

public class PlayWithObjects {
    public static void main(String[] args) {

        Animal barsik = new Animal();
        System.out.println(barsik.getName());

        barsik.setName("Barsik!");
        barsik.setAge(1);
        barsik.setColor("grey");
        System.out.println(barsik.getName());

        Animal alisa = new Animal();
        System.out.println(alisa.getName());
        alisa.setName("Alisa!");
        alisa.setAge(9);
        alisa.setColor("black");
        System.out.println(alisa.getName());

        System.out.println(alisa);
        System.out.println(barsik);

        barsik.walk();
        alisa.walk();

        barsik.eat();
        alisa.eat();


        Animal arnold = new Animal();
        System.out.println(arnold.getName());
        arnold.setName("Arnold!");
        arnold.setAge(3);
        arnold.setColor("black");

        arnold.walk();
        arnold.eat();

        Animal boris = new Animal();
        System.out.println(boris.getName());
        boris.setName("Boris!");
        boris.setAge(7);
        boris.setColor("white");

        boris.walk();
        boris.eat();

    }

}
