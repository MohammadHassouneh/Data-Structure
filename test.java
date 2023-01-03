
package amassignment;


public class test {

    
    public static void main(String[] args) {
        
        linkedList s = new linkedList(); 
         
        student a1 = new student(20210021,"Artificial Intelligence", "Amr", 91.5); 
        student a2 = new student(20210600,"Cyber Security", "Areej", 97 ); 
        student a3 = new student(20205100, "Computer Science", "Bahaa", 98); 
        student a4 = new student(20190741, "Software Engineering", "Ameer", 86.6); 
        student a5 = new student(2022030, "Artificial Intelligence", "Dania", 97); 
        student a6 = new student(20200660, "Cyber Security", "Omar", 70); 
        student a7 = new student(20186782, "Cyber Security", "Mohammad", 77.5); 
        student a8 = new student(20192225, "Computer Science", "Karam", 89.3); 
        student a9 = new student(20221123, "Software Engineering", "Faras", 79); 
        student a10 = new student(20200901, "Computer Science", "Abd", 54.6); 
       
        s.addStudent(a1);
        s.addStudent(a2);
        s.addStudent(a3);
        s.addStudent(a4);
        s.addStudent(a5);
        s.addStudent(a6);
        s.addStudent(a7);
        s.addStudent(a8);
        s.addStudent(a9);
        s.addStudent(a10);
        
        
        s.FindTopOne();
        System.out.println(s.getStudents("Computer Science")); 
        s.FindStudent("Amr"); 
        s.FindStudent(20200660); 
        s.print(022030);
        s.removeStudent(20210600);
        
        System.out.println(s.getStudents("Artificial Intelligence")); 
    }
    
}
