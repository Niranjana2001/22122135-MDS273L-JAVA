import java.util.*;
class Student{
    String Regno;
    String Name;
    String Email;
    String Phone;
    String Class;
    String Department;
    Student(String regno,String name,String email,String phone,String Class,String department){
        this.Regno=regno;
        this.Name=name;
        this.Email=email;
        this.Phone=phone;
        this.Class=Class;
        this.Department=department;
    }
    void display(){
            System.out.println("---------------------------------");
            System.out.println("register no : "+Regno);
            System.out.println("name : "+Name);
            System.out.println("email : "+Email);
            System.out.println("phone : "+Phone);
            System.out.println("department : "+Class);
            System.out.println("department : "+Department);
            System.out.println("---------------------------------");
    }

    boolean search(String name){
       boolean result =(Name.equalsIgnoreCase(name));
       if(result){
        display();
       }
       return result;

    }

   

}




public class Lab5 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Student[] Stdetails=new Student[100];
        int count=0;
        int choice;
        do{
            System.out.println("Enter 1 to add student");
            System.out.println("Enter 2 search student");
            System.out.println("Enter 3 to display all the student details");
            System.out.println("Enter 4 to exit");
            choice=Integer.parseInt(scan.nextLine());
            switch(choice){
                case 1:
                System.out.print("Enter name of student :");
                String name=scan.nextLine();
                System.out.print("Enter the name reg no :");
                String regno=scan.nextLine();
                System.out.print("Enter the email :");
                String email=scan.nextLine();
                System.out.print("Enter the phone number  :");
                String phone=scan.nextLine();
                System.out.print("Enter the class you enrolled :");
                String clas =scan.nextLine();
                System.out.print("Enter the department :");
                String dept=scan.nextLine();
                Stdetails[count] = new Student(regno,name,email,phone,clas,dept);
                count +=1;
                break;

                case 2:
                System.out.print("Enter the name of student you want to search :");
                String Name=scan.nextLine();
                
                boolean found =false;
                for(int i=0;i<count;i++){
                    if(Stdetails[i].search(Name)){
                        found =true;
                        break;
                    }
                
            }
            if(!found){
                System.out.println("Student not found");
            }
            break;
                

                case 3:
            for(int i=0;i<count;i++){
                Stdetails[i].display();
            
        }
                break;

            case 4:
            System.out.println("Thank you!");
            break;
    }

        }while(choice!=4);




        }

    
}