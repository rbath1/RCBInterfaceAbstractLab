
package lab2;

/**
 *
 * @author Robert Bath
 */
public class Startup {
    public static void main(String[] args){
        IntroToProgrammingCourse itp = new IntroToProgrammingCourse();
        IntroJavaCourse ij = new IntroJavaCourse("Intro to Java", "44444", 4,
                "Intro to Programming");
        AdvancedJavaCourse aj = new AdvancedJavaCourse("Advanced Java", "55555",
                4, "Intro to Java");
        
        //setting from default constructor for S&Gs
        itp.setCourseName("Intro to Programming");
        itp.setCourseNumber("3494938");
        itp.setCredits(2);
        
        System.out.println(itp.getCourseName() + "\n" + itp.getCourseNumber() + "\n" +
                itp.getCredits() + "\n");
        
        System.out.println(ij.getCourseName() + "\n" + ij.getCourseNumber() + "\n" +
                ij.getCredits() + "\n" + ij.getPrerequisites() + "\n");
        
        System.out.println(aj.getCourseName() + "\n" + aj.getCourseNumber() + "\n" +
                aj.getCredits() + "\n" + aj.getPrerequisites());
    }
}
