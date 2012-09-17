
package lab1;
/**
 * -I realize this abstract class does not implement any abstract methods, which
 * somewhat defeats the purpose of it. 
 * -Wondering if setting the setPrerequisites method to abstract (in super) would 
 * be smarter than putting it in a sub class (and having all others extend 
 * off that).
 * -I question whether a setCourseName method is even needed, considering the course name 
 * would already be dictated by the class. Or require the name to be set, in case it 
 * changes? But a different/new school class would warrant a new java class?
 * 
 * All input is entered at object construction. This allows super setter methods to be set
 * to private and is only accessed within itself. Update: changed setters to public for 
 * usability.
 * 
 * @author Robert Bath
 * @version 1.1
 */
public class StartUp {
     public static void main(String[] args) {
         CreditCourse ip = new IntroToProgrammingCourse("Intro to Programming","2222",2);
         IntroJavaCourse ij = new IntroJavaCourse("Intro to Java", "3333", 4, "Intro To Programming");
         AdvancedJavaCourse aj= new AdvancedJavaCourse("Advanced Java", "4444", 4, "Intro to Java");
         
         System.out.println(ip.getCourseName() + "\n" + ip.getCourseNumber() +"\n" + 
                 ip.getCredits() + "\n");
         System.out.println(ij.getCourseName() + "\n" + ij.getCourseNumber() + "\n" +
                 ij.getCredits() + "\n" + ij.getPrerequisites() + "\n");
         System.out.println(aj.getCourseName() + "\n" + aj.getCourseNumber() + "\n" + 
                 aj.getCredits() + "\n" + aj.getPrerequisites() + "\n");        
     }
}
