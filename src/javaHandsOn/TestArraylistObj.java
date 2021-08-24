package javaHandsOn;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Course{
    String title;
    int fee;

    public Course(String title, int fee) {
        this.title = title;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", fee=" + fee +
                '}';
    }
}

public class TestArraylistObj {
    public static void main(String[] args) {
        List<Course> list = new ArrayList();
        list.add( new Course("Rest With Spring",99));
        list.add( new Course("Spring security",110));
        list.add( new Course("A DZone Project",0));
        list.add( new Course("Umbrella Academy Project",35));
        list.add( new Course("High level design",78));

        //Print sort by title
        Comparator<Course> titleComparator = (a,b)->a.title.compareTo(b.title);
        list.sort(titleComparator);
        System.out.println(list);
        Comparator<Course> feeComparator = (a,b)->a.fee - b.fee;
        list.sort(feeComparator);
        System.out.println(list);
        list.sort(titleComparator.reversed());
        System.out.println(list);
        list.sort(feeComparator.reversed());
        System.out.println(list);
        list.sort(feeComparator);
        Serializable
    }
}
