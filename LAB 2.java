import java.util.*;
class menudrivenprog{
    public static void main(String[] args){
        String[] names=new String[1024];
        Scanner scan=new Scanner(System.in);
        
        int a;
        int b;
        int c=0;
        String searchname;
        boolean found=false;
        String removename;
        int index=-1;
        do{
            System.out.println("What do you want to do : \n 1. Enter a name \n 2. Search a name \n 3. Remove name \n 4. Show all names ");
        int n=Integer.parseInt(scan.nextLine());
            switch (n){
                case 1:
                System.out.println("Enter the number of names you want to enter : ");
                a=scan.nextInt();
                System.out.println("Enter the name : "); 
                for(int i=0;i<=a;i++){
                names[c] = scan.nextLine();
                c+=1;}
                break;

                case 2:
                System.out.println("Enter the name you want to search : ");
                searchname=scan.nextLine();
                for (int i=0;i<c;i++){
                    if(names[i].equals(searchname)){
                        System.out.println("The name "+searchname+" was found at the index "+i);
                        found=true;
                        break;
                    }
                    }
                    if(!found){
                        System.out.println("The name does not exist.");
                    }
                found=false;
                break;

                case 3:
                System.out.println("Enter the name that has to be removed : ");
                removename=scan.nextLine();
                for (int i = 0;i<c;i++){
                    if (names[i].equals(removename)){
                        index=i;
                        break;
                    }
                    if (index == -1){
                        System.out.println("The name is not there in the array.");
                    }else{
                        for(int j=index;j<c-1;j++){
                            names[j]=names[j+1];
                        }
                        c--;
                        System.out.println("The name "+removename+" has been removed successfully.");
                    }
                    break;
                }


                case 4:
                for (int i=0;i<c;i++){
                    System.out.println(names[i]);
                }
                System.out.println();
                break;
    
            }
        System.out.println("Do you want to perform other operations : \n 1.YES \n 2.NO");
        b=Integer.parseInt(scan.nextLine());
        }while(b==1);
      
    }
}
