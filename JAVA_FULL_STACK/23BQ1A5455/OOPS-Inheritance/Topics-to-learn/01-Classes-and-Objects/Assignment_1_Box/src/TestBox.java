public class TestBox {

    public static void main(String[] args) {

        Box box = new Box(5.5, 4.0, 3.5);

        System.out.println("Width  : 5.5");
        System.out.println("Height : 4.0");
        System.out.println("Depth  : 3.5");
        System.out.println("Volume : " + box.getVolume());

    }

}