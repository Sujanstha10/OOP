interface Polygon {
    public void gotArea(int length, int breadth);

}

class Rect implements Polygon {
    public void gotArea(int length, int breadth) {
        System.out.print("Area is" + length * breadth);

    }
}

public class interfaceclass {
    public static void main(String[] args) {
        Rect R = new Rect();
        R.gotArea(2, 1);

    }
}