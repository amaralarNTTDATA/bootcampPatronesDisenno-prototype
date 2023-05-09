public class Person implements IPerson {

    private String name;
    private int age;

    public Person() {

        this.name = "Juan";
        this.age = 25;

    }

    public String getName() {

        return name;

    }

    public int getAge() {

        return age;

    }

    public void setName(String name) {

        this.name = name;

    }

    public void setAge(int age) {

        this.age = age;

    }

    @Override
    public IPerson clonar() {

        Person persona = null;

        try {

            persona = (Person) clone();

        } catch (CloneNotSupportedException ex) {

            ex.printStackTrace();

        }

        return persona;

    }

}
