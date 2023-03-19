package ObjectPrograms;

public class AreaOfCircle {
    int radius;

    public void setValue(int r) {
       radius = r;
    }

    void setFormula() {
        System.out.println(3.14 * radius * radius);
    }
}

class GetValues {
    public static void main(String[] args) {
        AreaOfCircle aoc = new AreaOfCircle();
        aoc.setValue(40);
        aoc.setFormula();

        AreaOfCircle aoc1 = new AreaOfCircle();
        aoc1.setValue(50);
        aoc1.setFormula();
    }
}
