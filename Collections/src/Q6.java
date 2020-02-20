import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Write a program to sort the Student objects based on Score ,
// if the score are same then sort on First Name . Class Student{ String Name; Double Score; Double Age
class Student implements Comparable
{
    private static int temp=1;
    private String stdid;
    private String firstname;
    private  String lastname;
    private int score;
    public Student( String firstname, String lastname, int score) {
        this.stdid = String.valueOf(temp++);
        this.firstname = firstname;
        this.lastname = lastname;
        this.score = score;
    }
    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getStdid() {
        return stdid;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdid='" + stdid + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Object o)
    {
       Student stud = (Student) o;
        if(this.score >  stud.score)
                return -1;
        else if(this.score <  stud.score)
                return +1;
        else
        {
            return (this.firstname.compareTo(stud.firstname));
        }
    }
}

public class Q6
{
    public static void main(String[] args)
    {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("Shivam","Agarwal",1000));
        list.add(new Student("Devansh","Agarwal",1020));
        list.add(new Student("Pihu","Agarwal",1020));
        list.add(new Student("Jeff","Bezzos",1000));
        list.add(new Student("Tom","Agarwal",1050));
        System.out.println("Before sorting on score : ");
        for(Student s : list)
            System.out.println(s.toString());
        Collections.sort(list);
        System.out.println("After sorting on score : ");
        for(Student s : list)
            System.out.println(s.toString());

    }

}
