import java.util.*;
class Studentdetails{
    public static void main(String[] args){
        String name;
        int age;
        String state;
        char gender;
        int height;
        Scanner obj=new Scanner(System.in);
        System.out.println("\n Enter your\n NAME\n AGE\n STATE \n GENDER(m or f)\n HEIGHT");
        name=obj.nextLine();
        age=Integer.parseInt(obj.nextLine());
        state=obj.nextLine();
        gender=obj.nextLine().charAt(0);
        height=Integer.parseInt(obj.nextLine());
        System.out.println("STUDENT DETAILS");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("State : "+state);
        System.out.println("Height : "+height);
        if (gender == 'm'){
            System.out.println("Gender : MALE");
        }else if(gender == 'f'){
            System.out.println("Gender : FEMALE");
        }
        switch(state){
            case "Kerala":
            case "Tamil Nadu":
            case "Karnataka":
            case "Andhra Pradesh":{
                System.out.println("The student is from Southern part of India.");
                break;
            }
            
            case "Jammu Kashmir":
            case "Delhi":{
                System.out.println("The student is from Northern part of India.");
                break;
            }
            
            case "Meghalaya":
            case "Assam":{
                System.out.println("The student is from Eastern part of India.");
                break;
            }
            
            case "Gujarat":
            case "Rajasthan":
            case "Punjab":
            {
                System.out.println("The student is from Western part of India.");
                break;
            }
            
            default:{
                System.out.println("Invalid State.");
                break;
            }
    
        }
        }




    }
