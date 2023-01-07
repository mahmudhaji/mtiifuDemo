
class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(100, 20000, "Blue", 22);
        Ford ford1 = new Ford(150, 30000, "Red", 2018, 1000);
        Ford ford2 = new Ford(200, 40000, "Black", 2019, 2000);
        Car car = new Car(250, 50000, "White");

        System.out.println("Sale price of sedan: " + sedan.getSalePrice());
        System.out.println("Sale price of first Ford: " + ford1.getSalePrice());
        System.out.println("Sale price of second Ford: " + ford2.getSalePrice());
        System.out.println("Sale price of car: " + car.getSalePrice());
    }
}
