public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        Human human1 = new Human("Артём");
        Human human2 = new Human("Иван");
        Human human3 = new Human("Дмитрий");

        market.acceptToMarket(human1);
        market.update();
        System.out.println();
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.update();
    }
}
