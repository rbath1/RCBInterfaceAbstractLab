package lab1;

/**
 * Inherits CreditCourse and set/get prerequisites method
 *
 * @author      Robert Bath
 * @version     1.1
 */
public class IntroJavaCourse extends CreditCourse {
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber, double credits,
            String prerequisites){
        super(courseName, courseNumber, credits);
        this.setPrerequisites(prerequisites);
    }
    
    
    private void setPrerequisites(String prerequisites){
        if(prerequisites == null || prerequisites.length() == 0) {
            super.ErrorMsg();
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
    
     public String getPrerequisites() {
        return prerequisites;
    }
}
