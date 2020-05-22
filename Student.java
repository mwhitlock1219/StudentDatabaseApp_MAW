import java.util.Scanner;

public class Student {

    private String firstName, lastName, courses = null, studentID;
    private int gradeYear, tuitionBalance = 0;
    private static int id = 1000, costOfCourse = 600;

    // Constructor: prompt user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshman \n2 - Sophmore \n3 - Junior \n4 - Senior \nEnter student class level: ");
        this.gradeYear = in.nextInt();

        setStudentID();

        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

        setStudentID();

    }

    // Generate an ID
    private void setStudentID() {
        // Grade level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll() {
        // Get inside a loop, user hits 0
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                // System.out.println("BREAK!"); to check if it was entering this part of the do
                // while loop
                break;
            }
        } while (1 != 0);

        // debugger (used to check addition/enrollment of courses)
        // System.out.println("ENROLLED IN: " + courses);
        // used as a debugger but now that we know it works we eliminate it
        // System.out.println("TUITION BALANCE: " + tuitionBalance);
    }

    // View balance
    public void viewBalance() {
        System.out.println("Your balance is : $" + tuitionBalance);
    }

    // Pay tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    // Show status
    // public String showInfo() {
    // return "Name: " + firstName + " " + lastName + "\nCourses Enrolled: " +
    // courses + "\nBalance: $"
    // + tuitionBalance;
    // }
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\nGrade Level: " + gradeYear + "\nStudent ID: " + studentID
                + "\nCourses Enrolled: " + courses + "\nBalance: $" + tuitionBalance;

    }
}