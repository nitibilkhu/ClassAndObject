package ObjectPrograms;

public class ObjectReferencePrac {
    String teacher_name;
    int teacher_id;
    String teacher_school;
    String teacher_subject;

    void teach() {
        System.out.println("Teacher teaches the student");
    }

    public static void main(String[] args) {
        ObjectReferencePrac orp = new ObjectReferencePrac();
        ObjectReferencePrac orp1 = new ObjectReferencePrac();
        ObjectReferencePrac orp2 = new ObjectReferencePrac();
        orp.teacher_id = 10901;
        orp.teacher_name = "Surjeet Kaur";
        orp.teacher_subject = "English";
        orp.teacher_school = "Govt School";
        System.out.println("Teacher name is " + orp.teacher_name + " and his/her id is " + orp.teacher_id + " and teaches " + orp.teacher_subject);

        orp1.teacher_id = 10902;
        orp1.teacher_name = "Kamla devi";
        orp1.teacher_subject = "Hindi";
        orp1.teacher_school = "Convent School";
        System.out.println("Teacher name is " + orp1.teacher_name + " and his/her id is " + orp1.teacher_id + " and teaches " + orp1.teacher_subject);

        orp2.teacher_id = 10903;
        orp2.teacher_name = "Gagandeep Kaur";
        orp2.teacher_subject = "Computer";
        orp2.teacher_school = "Govt School";
        System.out.println("Teacher name is " + orp2.teacher_name + " and his/her id is " + orp2.teacher_id + " and teaches " + orp2.teacher_subject);
    }
}
