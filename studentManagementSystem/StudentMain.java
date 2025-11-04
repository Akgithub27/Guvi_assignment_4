package studentManagementSystem;

public class StudentMain {
    public static void main(String[] args) {
        Student st = new Student(1001,"aakash@",21,"Maths");
        Student stu = new Student(1002,"prem",25,"science");
        try {
            st.checkAge();
            st.checkName();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            stu.checkName();
            stu.checkAge();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
