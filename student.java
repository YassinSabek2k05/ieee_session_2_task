/* implement a student class here 
it should have the following properties:
- name 
- age
- grade
- studentID
- major
- gpa
it should also have the following methods:
- a constructor to initialize all properties
- a method to display student information
- a getter and setter for each property
- main method to create a student object (with your information) and display its information
*/ 

public class student{
    String name;
    int age;
    int grade;
    int studentID;
    String major;
    double gpa;
    public student(String name, int age, int grade, int studentID, String major, double gpa){
        this.name= name;
        this.age=age;
        this.grade=grade;
        this.studentID=studentID;
        this.major= major;
        this.gpa=gpa;
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
    
    public int getGrade() {
        return grade;
    }
    
    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    public int getStudentID() {
        return studentID;
    }
    
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    
    public String getMajor() {
        return major;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void display(){
        System.out.println(this.name+", Age:"+this.age+", Grade:"+this.grade+", Student ID:"+this.studentID+", Major:"+this.major);
    }
    public static void main(String[] args) {
        student s = new student("Yassin", 20, 1, 1553, "MET", 1.4);
        s.display();
    }
}