package builder;

public class Main {
    public static void main(String[] args) {
        House house1 = new House.Builder().setColor("Red").setRoof("Wooden").build();
        House house2 = new House.Builder().setCost(13).setWindow("Glass").build();
        System.out.println(house1);
        System.out.println(house2);
    }
}
