package exercise.exercise_0517.io_0517;

import java.io.*;

public class SerTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person(20,"huanhuan");
        File file = new File("C:\\Users\\lenovo\\Desktop\\"+"TestSer.txt");
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(person);
        objectOutputStream.close();
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
        Object o = inputStream.readObject();
        System.out.println(o);
    }
}

class Person implements Serializable {
    private int age;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}