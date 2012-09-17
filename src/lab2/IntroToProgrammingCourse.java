package lab2;

import javax.swing.JOptionPane;

/**
 * Inherits from the CreditCourse interface
 *
 * @author      Robert Bath
 * @version     1.1
 */
public class IntroToProgrammingCourse implements ICreditCourse {
    private String courseName;
    private String courseNumber;
    private double credits;
    private static final double MIN_CRED = 0.5;
    private static final double MAX_CRED = 4.0;
    private String ERROR_MSG = "Error: field cannot be null";
    
    public IntroToProgrammingCourse(){
    }
    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            this.ErrorMsg();
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    @Override
    public double getCredits() {
        return credits;
    }

    @Override
    public final void setCredits(double credits) {
        if(credits < MIN_CRED|| credits > MAX_CRED) {
            this.ErrorMsg();
            System.exit(0);
        }
        this.credits = credits;
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            this.ErrorMsg();
            System.exit(0);
        }
        this.courseName = courseName;
    }
 //validation message
    private void ErrorMsg(){
         System.out.println(ERROR_MSG);
    }
    
}
