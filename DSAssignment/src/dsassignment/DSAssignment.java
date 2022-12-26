
package dsassignment;

class Student {
private int Number;
private String Name;
private String Major;
private double GPA;

    public Student(int Number, String Name, String Major, double GPA) {
        this.Number = Number;
        this.Name = Name;
        this.Major = Major;
        this.GPA = GPA;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public int getNumber() {
        return Number;
    }

    public String getName() {
        return Name;
    }

    public String getMajor() {
        return Major;
    }

    public double getGPA() {
        return GPA;
    }




}
public class DSAssignment {

    
    public static void main(String[] args) {
        
    }
    
}
