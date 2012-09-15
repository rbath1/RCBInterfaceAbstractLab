/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
 
/**
 *
 * @author rbath1
 */
public abstract class CreditCourse {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    private static final double MIN_CRED = 0.5;
    private static final double MAX_CRED = 4.0;
    private String ERROR_MSG = "Error: field cannot be null";
    public CreditCourse(String courseName, String courseNumber, double credits){
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }
    
    //all sub-classes must call method (set to "none" if not required)
//    public abstract void setPrerequisites(String prerequisites);
    
    private void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            this.ErrorMsg();
            System.exit(0);
        }else {
            this.courseName = courseName;
        }
    }
    private void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0){
            this.ErrorMsg();
            System.exit(0);
        }else {
            this.courseNumber = courseNumber;
        }   
    }
    private void setCredits(double credits) {
        if(credits < MIN_CRED || credits > MAX_CRED) {
            this.ErrorMsg();
            System.exit(0);
        } else {
            this.credits = credits;
        }   
    }
     
    public String getCourseName() {
        return courseName;
    }
    public String getCourseNumber() {
        return courseNumber;
    }
    public double getCredits() {
        return credits;
    }
    
    
    //validation message
    public final void ErrorMsg(){
         System.out.println(ERROR_MSG);
    }
    
}
