package ObjectPrograms;

public class AreaOfRectangle {
    double length;
    double width;

    public void setValues(double l, double w) {
        length = l;
        width = w;
    }
    public void setFormula() {
        System.out.println(length * width);
    }
}

class GetRectangleArea {
    public static void main(String[] args) {
        AreaOfRectangle aor = new AreaOfRectangle();
        aor.setValues(76.4, 43.7);
        aor.setFormula();

        AreaOfRectangle aor1 = new AreaOfRectangle();
        aor1.setValues(89.5,98.4);
        aor1.setFormula();
    }
}
