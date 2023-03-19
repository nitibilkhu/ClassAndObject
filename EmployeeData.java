package ObjectPrograms;

public class EmployeeData {
    int e_id;
    String e_name;
    String e_dept;
    int salary;

    void insertRecord(int i, String n, String d, int sal) {
        e_id = i;
        e_name = n;
        e_dept = d;
        salary = sal;
    }
    void displayRecord() {
        System.out.println("Employee id is " + e_id + " ,employee name is " + e_name + " ,department is " + e_dept + " and salary is " + salary);
    }

    public static void main(String[] args) {
        EmployeeData ed = new EmployeeData();
        ed.insertRecord(11034, "Guri", "Technician" , 600000);
        ed.displayRecord();

        EmployeeData ed1 = new EmployeeData();
        ed1.insertRecord(11035, "Pari", "Programmer" , 1000000);
        ed1.displayRecord();

        EmployeeData ed2 = new EmployeeData();
        ed2.insertRecord(11037, "Jhalak", "Tester" , 400000);
        ed2.displayRecord();
    }
}