package ObjectPrograms;

public class ThroughMethod {
   String name;
   int phn_no;
   int math_marks;
   int science_marks;
   int english_marks;

   public void studentRecord(String n, int p, int m, int s, int e) {
       name = n;
       phn_no = p;
       math_marks = m;
       science_marks = s;
       english_marks = e;
   }
   void showResult() {
       System.out.println(name + " got " + math_marks + " in maths, " + science_marks + " in science and " + english_marks + " in English" );
   }
}

class ShowAllStudentData {
    public static void main(String[] args) {
        ThroughMethod tm = new ThroughMethod();
        ThroughMethod tm1 = new ThroughMethod();
        tm.studentRecord("Anu", 0, 89,43,76);
        tm.showResult();
        tm1.studentRecord("Radha",0, 65,43,98);
        tm1.showResult();
    }
}
