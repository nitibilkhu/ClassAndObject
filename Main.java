package ObjectPrograms;// THROUGH REFERENCE

class Main {
    int id;
    String name;
    String city;

    public static void main(String[] args) {
     Main s = new Main();
     Main s1 = new Main();
     s.id =101;
     s.name = "Navneet Kaur";
     s.city = "Mohali";
     System.out.println("Student id is "+ s.id + " , name is " + s.name + " and he/she lives in " + s.city + ".");

     s1.id =102;
     s1.name = "Gurpreet Kaur";
     s1.city = "Amritsar";
     System.out.println("Student id is "+ s1.id + " , name is " + s1.name + " and he/she lives in " + s1.city + ".");

    }
}