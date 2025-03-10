package LinkedList.Student_Record_Management_SLL;
// Only for making nodes
class Student {
    int rollNumber;
    String studentName;
    int studentAge;
    char studentGrade;
    Student next;

    // Constructor
    public Student(int rollNumber, String studentName, int studentAge,char grade) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.next = null;
        this.studentGrade=grade;
    }

}