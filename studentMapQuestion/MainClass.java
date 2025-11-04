package studentMapQuestion;

import java.util.*;

public class MainClass {
    static Map<String,Integer> map = new HashMap<>();
    public static void main(String[] args) {
        addStudent("Aakash",1);
        addStudent("vijay",3);
        addStudent("prem",4);
        addStudent("Muthu",2);

        displayStudent();

        removeStudent("Aakash");

        displayStudent();

    }

    public static void addStudent(String name,int grade){
        map.put(name,grade);
    }

    public static void removeStudent(String name){
        map.remove(name);
    }

    public static void displayStudent(){
        System.out.println("Set of students and their grades ");
        for(String obj: map.keySet()){
            System.out.println("Name: "+obj+"  Grade: "+map.get(obj));
        }
        System.out.println("==========================================");
    }
}
