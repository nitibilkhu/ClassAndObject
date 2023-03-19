//package ObjectPrograms;
//
//public class Student_data {
//    String name;
//    int phn_num;
//    int math_marks;
//    int science_marks;
//    int history_marks;
//
//    public int totalMarks() {
//        return this.math_marks + this.science_marks + this.history_marks;
//    }
//
//    public Student_data(String name1, int phn_num1, int math_marks1, int science_marks1, int history_marks1) {
//       this.name = name1;
//       this.phn_num = phn_num1;
//       this.math_marks = math_marks1;
//       this.science_marks = science_marks1;
//       this.history_marks = history_marks1;
//    }
//      class Student_data {
//        int student_id;
//        String student_name;
//        int student_marks;
//
//        void insertData(int i, String n, int m) {
//            student_id = i;
//            student_name = n;
//            student_marks = m;
//        }
//        void displayData() {
//            System.out.println(student_id + " " + student_name + " " + student_marks);
//        }
//
//        public static void main(String[] args) {
//            Student_data sd = new Student_data();
//            sd.insertData(4773, "abc", 76);
//            sd.displayData();
//
//            Student_data sd1 = new Student_data();
//            sd1.insertData(4778, "xyz", 23);
//            sd1.displayData();
//        }
//    }
//}
