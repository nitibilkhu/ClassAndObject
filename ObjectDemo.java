package ObjectPrograms;

public class ObjectDemo {
   int age;
   String name;

   void eat() {
       System.out.println("i am eating");
   }
   void run() {
       System.out.println("i am running");
   }
   public static void main(String[] args) {
        ObjectDemo od = new ObjectDemo();
        od.age = 19;
        od.name = "Dhavneet Kaur";
        System.out.println("Age is " + od.age);
        System.out.println("Name is " + od.name);
        od.eat();
        od.run();

       System.out.println("-------------------------------");

        ObjectDemo od1 = new ObjectDemo();
        od1.age = 8;
        od1.name = "Kashish";
        System.out.println("Age is " + od1.age);
        System.out.println("Name ia " + od1.name);
        od1.eat();
        od1.run();
    }
}
