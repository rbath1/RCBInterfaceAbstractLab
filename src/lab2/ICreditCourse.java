/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Robert Bath
 */
public interface ICreditCourse {
    public abstract void setCourseName(String courseName);
    
    public abstract void setCourseNumber(String courseNumber);
    
    public abstract void setCredits(double credits);
    
    public abstract String getCourseName();
    
    public abstract String getCourseNumber();
    
    public abstract double getCredits();
}
