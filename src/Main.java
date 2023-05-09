public class Main {
    public static void main(String[] args) {

        Person persona1 = new Person();
        Person persona2 = (Person) persona1.clonar();

        System.out.println("PERSONA 1");
        System.out.println(persona1.getName());
        System.out.println(persona1.getAge());

        System.out.println("PERSONA 2");
        System.out.println(persona2.getName());
        System.out.println(persona2.getAge());

    }
}