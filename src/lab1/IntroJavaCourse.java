package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      Robert Bath
 * @version     1.00
 */
public class IntroJavaCourse extends Course {
//    String courseName;
//    private String courseNumber;
//    private double credits;
    private String prerequisites;

//    public IntroJavaCourse(String courseName, String courseNumber) {
//        this.courseName = courseName;
//        this.courseNumber = courseNumber;
   // }


    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites){
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
    }
    
}
