class CollegeIdRunner {
    public static void main(String[] args) {

  CollegeId student1 = new CollegeId();
  student1.studentName = "Bhoomika";
  student1.clgName = "MFGC";
  student1.idNumber = 101;
  student1.isActive = true;

   CollegeId student2 = new CollegeId();
  student2.studentName = "Sowndarya";
   student2.clgName = "MFGC";
   student2.idNumber = 102;
  student2.isActive = true;

     CollegeId student3 = new CollegeId();
    student3.studentName = "Impi";
    student3.clgName = "MFGC";
    student3.idNumber = 103;
    student3.isActive = false;
		
    System.out.println("****** student info **********");
  System.out.println("student1 name: " + student1.studentName);
   System.out.println("college name: " + student1.clgName);
 System.out.println("student1 id: " + student1.idNumber);
  System.out.println("student1 active: " + student1.isActive);

   System.out.println("****** student info **********");
  System.out.println("student2 name: " + student2.studentName);
    System.out.println("college name: " + student2.clgName);
    System.out.println("student2 id: " + student2.idNumber);
    System.out.println("student2 active: " + student2.isActive);

 System.out.println("****** student info **********");
  System.out.println("student3 name: " + student3.studentName);
  System.out.println("college name: " + student3.clgName);
  System.out.println("student3 id: " + student3.idNumber);
   System.out.println("student3 active: " + student3.isActive);

 

  }
   }