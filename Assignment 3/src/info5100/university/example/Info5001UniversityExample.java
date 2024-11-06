/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Degree.Degree;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyAssignment;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Department department = new Department("Information Systems");
        CourseCatalog coursecatalog = department.getCourseCatalog();
        //Creating courses
        Course c1 = coursecatalog.newCourse("Neural Modeling Methods and Tools", "INFO 6106", 4);
        Course c2 = coursecatalog.newCourse("Application Modeling and Design", "INFO 5001", 4);
        Course c3 = coursecatalog.newCourse("Application Engineering and Development", "INFO 5100", 4);
        Course c4 = coursecatalog.newCourse("Business Process Engineering", "INFO 7260", 4);
        Course c5 = coursecatalog.newCourse("Organizational Change and IT", "INFO 7285", 4);
        Course c6 = coursecatalog.newCourse("Digital Product Design and Management", "EMGT 6700", 2);
        Course c7 = coursecatalog.newCourse("Advanced Product Management", "EMGT 6750", 4);
        Course c8 = coursecatalog.newCourse("Economic Decision Making", "EMGT 6225", 3);
        
        Degree d = new Degree("Master in Science");
        d.addCoreCourse(c1);
        d.addCoreCourse(c2);
        d.addCoreCourse(c3);
        d.addElectiveCourse(c4);
        d.addElectiveCourse(c5);
        d.addElectiveCourse(c6);
        d.addElectiveCourse(c7);
        d.addElectiveCourse(c8);
        //Creating course/class schedules
        CourseSchedule courseschedule = department.newCourseSchedule("FALL 2024");

        CourseOffer courseoffer1 = courseschedule.newCourseOffer("INFO 6106");
        if (courseoffer1==null)return;
        courseoffer1.generatSeats(5);
        
        CourseOffer courseoffer2 = courseschedule.newCourseOffer("INFO 5001");
        if (courseoffer2==null)return;
        courseoffer2.generatSeats(5);
        
        CourseOffer courseoffer3 = courseschedule.newCourseOffer("INFO 5100");
        if (courseoffer3==null)return;
        courseoffer3.generatSeats(5);
        
        CourseOffer courseoffer4 = courseschedule.newCourseOffer("INFO 7260");
        if (courseoffer4==null)return;
        courseoffer4.generatSeats(5);
        
        CourseOffer courseoffer5 = courseschedule.newCourseOffer("INFO 7285");
        if (courseoffer5==null)return;
        courseoffer5.generatSeats(5);
        
        CourseOffer courseoffer6 = courseschedule.newCourseOffer("EMGT 6700");
        if (courseoffer6==null)return;
        courseoffer6.generatSeats(5);
        HashMap<CourseOffer,ArrayList<FacultyAssignment>> fac_cou_map = new HashMap<>();
        
        //Assigning professor to courses
        PersonDirectory pd = department.getPersonDirectory();
        Person p1 = pd.newPerson("f1");
        FacultyDirectory fd1 = department.getFacultyDirectory();
        FacultyProfile fp1 = fd1.newFacultyProfile(p1);
        FacultyAssignment ff=fp1.AssignAsTeacher(courseoffer1);
        fac_cou_map.put(courseoffer1,ff.getFacultyProfile().facultyassignments);
        
        Person p2 = pd.newPerson("f2");
        FacultyDirectory fd2 = department.getFacultyDirectory();
        FacultyProfile fp2 = fd2.newFacultyProfile(p2);
        FacultyAssignment ff2=fp2.AssignAsTeacher(courseoffer2);
        fac_cou_map.put(courseoffer2,ff2.getFacultyProfile().facultyassignments);
        
        Person p3 = pd.newPerson("f3");
        FacultyDirectory fd3 = department.getFacultyDirectory();
        FacultyProfile fp3 = fd3.newFacultyProfile(p3);
        FacultyAssignment ff3=fp3.AssignAsTeacher(courseoffer3);
        fac_cou_map.put(courseoffer3,ff3.getFacultyProfile().facultyassignments);
        
        Person p4 = pd.newPerson("f4");
        FacultyDirectory fd4 = department.getFacultyDirectory();
        FacultyProfile fp4 = fd4.newFacultyProfile(p4);
        FacultyAssignment ff4=fp4.AssignAsTeacher(courseoffer4);
        fac_cou_map.put(courseoffer4,ff4.getFacultyProfile().facultyassignments);
        
        Person p5 = pd.newPerson("f5");
        FacultyDirectory fd5 = department.getFacultyDirectory();
        FacultyProfile fp5 = fd5.newFacultyProfile(p5);
        FacultyAssignment ff5=fp5.AssignAsTeacher(courseoffer5);
        fac_cou_map.put(courseoffer5,ff5.getFacultyProfile().facultyassignments);
        
        Person p6 = pd.newPerson("f6");
        FacultyDirectory fd6 = department.getFacultyDirectory();
        FacultyProfile fp6 = fd6.newFacultyProfile(p6);
        FacultyAssignment ff6=fp6.AssignAsTeacher(courseoffer6);
        fac_cou_map.put(courseoffer6,ff6.getFacultyProfile().facultyassignments);

        
        // Create students
        Person s1 = pd.newPerson("s1");
        StudentDirectory sd = department. getStudentDirectory () ;

        StudentProfile sp1 = sd.newStudentProfile (s1) ;
        CourseLoad courseload1 = sp1. newCourseLoad (  "SPRING 2024") ;
        SeatAssignment sa1 = courseload1.newSeatAssignment(courseoffer2); 
        
        Person s2 = pd.newPerson("s2");
        StudentProfile sp2 = sd.newStudentProfile(s2);
        CourseLoad courseload2 = sp2.newCourseLoad("SPRING 2024");
        SeatAssignment sa2 = courseload2.newSeatAssignment(courseoffer3);

        Person s3 = pd.newPerson("s3");
        StudentProfile sp3 = sd.newStudentProfile(s3);
        CourseLoad courseload3 = sp3.newCourseLoad("SPRING 2024");
        SeatAssignment sa3 = courseload3.newSeatAssignment(courseoffer4);

        Person s4 = pd.newPerson("s4");
        StudentProfile sp4 = sd.newStudentProfile(s4);
        CourseLoad courseload4 = sp4.newCourseLoad("SPRING 2024");
        SeatAssignment sa4 = courseload4.newSeatAssignment(courseoffer5);

        Person s5 = pd.newPerson("s5");
        StudentProfile sp5 = sd.newStudentProfile(s5);
        CourseLoad courseload5 = sp5.newCourseLoad("SPRING 2024");
        SeatAssignment sa5 = courseload5.newSeatAssignment(courseoffer3);

        Person s6 = pd.newPerson("s6");
        StudentProfile sp6 = sd.newStudentProfile(s6);
        CourseLoad courseload6 = sp6.newCourseLoad("SPRING 2024");
        SeatAssignment sa6 = courseload6.newSeatAssignment(courseoffer5);

        Person s7 = pd.newPerson("s7");
        StudentProfile sp7 = sd.newStudentProfile(s7);
        CourseLoad courseload7 = sp7.newCourseLoad("SPRING 2024");
        SeatAssignment sa7 = courseload7.newSeatAssignment(courseoffer6);

        Person s8 = pd.newPerson("s8");
        StudentProfile sp8 = sd.newStudentProfile(s8);
        CourseLoad courseload8 = sp8.newCourseLoad("SPRING 2024");
        SeatAssignment sa8 = courseload8.newSeatAssignment(courseoffer6);

        Person s9 = pd.newPerson("s9");
        StudentProfile sp9 = sd.newStudentProfile(s9);
        CourseLoad courseload9 = sp9.newCourseLoad("SPRING 2024");
        SeatAssignment sa9 = courseload9.newSeatAssignment(courseoffer5);

        Person s10 = pd.newPerson("s10");
        StudentProfile sp10 = sd.newStudentProfile(s10);
        CourseLoad courseload10 = sp10.newCourseLoad("SPRING 2024");
        SeatAssignment sa10 = courseload10.newSeatAssignment(courseoffer1);

        SeatAssignment sa11 = courseload1.newSeatAssignment(courseoffer2);

        SeatAssignment sa12 = courseload2.newSeatAssignment(courseoffer3);

        SeatAssignment sa13 = courseload3.newSeatAssignment(courseoffer4);

        SeatAssignment sa14 = courseload4.newSeatAssignment(courseoffer5);

        SeatAssignment sa15 = courseload5.newSeatAssignment(courseoffer6);

        SeatAssignment sa16 = courseload6.newSeatAssignment(courseoffer4);

        SeatAssignment sa17 = courseload7.newSeatAssignment(courseoffer2);

        SeatAssignment sa18 = courseload8.newSeatAssignment(courseoffer1);

        SeatAssignment sa19 = courseload9.newSeatAssignment(courseoffer3);

        SeatAssignment sa20 = courseload10.newSeatAssignment(courseoffer4);
        System.out.println("Courses:");
        for (int i=0;i<coursecatalog.getCourseList().size();i++){
            Course c = coursecatalog.getCourseList().get(i);
            System.out.println(c.getCOurseName()+" ("+c.getCOurseNumber()+"), Credits="+c.getCredits()+", Price/Credit="+c.getCoursePrice());
        }
        System.out.println("\n");
        for (int i=0;i<sd.studentlist.size();i++){
            System.out.println("Student: "+sd.studentlist.get(i).person.getPersonId()+" and his course registration is: ");
            double totalCredits = 0, fees=0, totalcreditPoints=0;
            for (int j=0;j<sd.studentlist.get(i).getCurrentCourseLoad().getSeatAssignments().size();j++){ 
                CourseOffer co = sd.studentlist.get(i).getCurrentCourseLoad().getSeatAssignments().get(j).getCourseOffer();
                System.out.println("Course: "+co.getSubjectCourse().getCOurseName()+" ("+co.getCourseNumber()+")");
                System.out.println("Teacher: "+fac_cou_map.get(co).get(0).getFacultyProfile().person.getPersonId());
                
                double grade = Math.round((3.0 + Math.random()) * 10.0) / 10.0;
                sd.studentlist.get(i).getCurrentCourseLoad().getSeatAssignments().get(j).grade=(float) grade;
                System.out.println("Grade: "+grade);
                System.out.println("Credits: "+sd.studentlist.get(i).getCurrentCourseLoad().getSeatAssignments().get(j).getSeat().getCourseOffer().getCreditHours());
                int credits=sd.studentlist.get(i).getCurrentCourseLoad().getSeatAssignments().get(j).getSeat().getCourseOffer().getCreditHours();;
                int price = sd.studentlist.get(i).getCurrentCourseLoad().getSeatAssignments().get(j).getSeat().getCourseOffer().getSubjectCourse().getCoursePrice();
                fees=fees+credits*price;
                totalCredits =totalCredits+ credits*grade;
                totalcreditPoints = totalcreditPoints+credits;
            }
            System.out.println("GPA: "+Math.round((totalCredits/totalcreditPoints) * 100.0) / 100.0);
            System.out.println("Total Tuition Fees: "+fees);
            System.out.println("\n");
        }

    }

}
