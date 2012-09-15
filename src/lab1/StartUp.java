/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Bob
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
