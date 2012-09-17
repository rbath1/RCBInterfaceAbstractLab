package lab2;

/**
 * Inherits from CreditCourse and Prerequisites interfaces.
 *
 * @author     Bob
 * @version     1.1
 */
public class IntroJavaCourse implements ICreditCourse, IPrerequisites {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    private static final double MIN_CRED = 0.5;
    private static final double MAX_CRED = 4.0;
    private String ERROR_MSG = "Error: field cannot be null";
 
    public IntroJavaCourse(){
    }
    public IntroJavaCourse(String courseName, String courseNumber, double credits,
            String prerequisites) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.prerequisites = prerequisites;
                
    }
    @Override
    public final void setCourseName(String courseName){
        if(courseName == null || courseName.length() == 0) {
            this.ErrorMsg();
        }
        this.courseName = courseName;
    }
    
    @Override
    public String getCourseName(){
        return courseName;
    }
    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        if(courseName == null || courseName.length() == 0) {
            this.ErrorMsg();
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
        }
        this.credits = credits;
    }

    @Override
    public String getPrerequisites() {
        return prerequisites;
    }

    @Override
    public final void setPrerequisites(String prerequisites) {
        if(courseName == null || courseName.length() == 0) {
            this.ErrorMsg(); 
        }
        this.prerequisites = prerequisites;
    }
     private void ErrorMsg(){
         System.out.println(ERROR_MSG);
    }
    
}
