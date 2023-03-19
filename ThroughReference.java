package ObjectPrograms;

public class ThroughReference {
    int roll_no;
    String first_name;
    String last_name;
    String city;
}

class PrintTheValues {
    public static void main(String[] args) {
        ThroughReference tr = new ThroughReference();
        ThroughReference tr1 = new ThroughReference();
        tr.first_name = "Ruhi";
        tr.last_name = "Sharma";
        tr.roll_no = 1242785;
        tr.city = "Mohali";

        tr1.first_name = "Daman";
        tr1.last_name = "Kaur";
        tr1.roll_no = 767657;
        tr1.city = "Khamano";

        System.out.println("My name is " + tr.first_name + " " + tr.last_name + " , Roll no is " + tr.roll_no + " and city is " + tr.city);
        System.out.println("My name is " + tr1.first_name + " " + tr1.last_name + " , Roll no is " + tr1.roll_no + " and city is " + tr1.city);


    }
}
