package pl.akademiakodu;

/**
 * Created by Lukasz Kolacz on 18.03.2017.
 */
public class Person implements Comparable<Person>{

    private String name;
    private String lastname;
    private int age;

    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;



    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(Person o) {
//        return getLastname().compareTo(o.getLastname());
        if(getAge() > o.getAge()){
            return -1;
        }else if(getAge() == o.getAge()){
            return 0;
        }else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}
