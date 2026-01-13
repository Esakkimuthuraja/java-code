 class Details{ //class name 
     
     public void Name(String nameofstd) //method One
     {
         System.out.println("Name: "+nameofstd);
     }

     public void RollNo(int rollno)  //method Two
     {
         System.out.println("Roll.NO: "+rollno);
     }

     public void Course(String coursename)  //method Three
     {
         System.out.println("Course Name "+coursename);
     }

     public static void main(String[] args)  //main function
     {

         Details info = new Details();  //object
         
         info.Name("EsakkiMuthu Raja");  //calling method one 
         info.RollNo(106);               //calling method two 
         info.Course("B.Sc. Artificial Intelligence and Machine Learning");  //calling method three
     }
 }