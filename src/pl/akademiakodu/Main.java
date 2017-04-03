package pl.akademiakodu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Oskar", "Polak", 30));
        personList.add(new Person("Nadia", "Ruska", 18));
        personList.add(new Person("Paweł", "Nowak", 45));
        personList.add(new Person("Damian", "Strach", 22));
        personList.add(new Person("Wiktor", "Chwaliński", 12));

//        Collections.sort(personList);
        Collections.sort(personList, new CompareByName());

        for(Person person : personList){
            System.out.println(person.toString());
        }

    }

    private static class CompareByName implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    private static class CompareByLastname implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getLastname().compareTo(o2.getLastname());
        }
    }
}
