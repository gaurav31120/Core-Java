package Arrays;

class Student
{
    int rollno;
    String name;
    int marks;
}

public class ArrayOfObjects {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollno = 13;
        s1.name = "Gaurav";
        s1.marks = 68;
        
        Student s2 = new Student();
        s2.rollno = 1;
        s2.name = "Naveen";
        s2.marks = 43;

        Student s3 = new Student();
        s3.rollno = 1;
        s3.name = "Kiran";
        s3.marks = 97;


        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name + " : " + students[i].marks + " : " + students[i].rollno);

        }

        // int nums[] = new int[4];
        // nums[0] = 4;
        // nums[1] = 8;
        // nums[2] = 3;
        // nums[3] = 9;

        // for(int i=0;i<nums.length;i++) {    // arrya.length will tell the exact length of array
        //     System.err.println(nums[i]);
        // }

    }
    
}
