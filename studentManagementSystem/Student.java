package studentManagementSystem;

public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void checkAge() throws AgeNotWithinRangeException {
        if(this.age< 15 || this.age>21){
            throw new AgeNotWithinRangeException();
        }else {
            System.out.println("You are eligible for admission");
        }
    }

    public void checkName() throws NameNotValidException{
        if(!this.name.matches("[a-zA-Z]+")){
            throw new NameNotValidException();
        }else{
            System.out.println("Valid name:  "+this.name);
        }
    }
}
