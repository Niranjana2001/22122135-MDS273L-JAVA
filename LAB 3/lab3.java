import java.util.*;
class lab3{
    static float mean(int[] array){
        int sum=0;
        float mean;
        for (int i=0;i<array.length;i++){
            sum+=array[i];
        }
        float a=array.length;
        float s=sum;
        mean=s/a;
        return mean;
    }
    static float median(int[] array){
        int x;
        int a;
        float median;
        float y;
        Arrays.sort(array);
        if (array.length%2!=0){
            x=(array.length/2);
            median = array[x];
        }else{
            x=(array.length/2);
            y=(array[x-1]+array[x]);
            median=y/2;
            
        }
        return median;   
    }
    static int mode(int[] array) {
    int mode = 0;
    int max = 0;

    for (int i = 0; i < array.length; i++) {
        int y = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == array[i]) {
                y++;
            }
        }
        if (y > max) {
            max = y;
            mode = array[i];
        }
    }

    return mode;
}
        public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int k;
        
        int f;
        int g;
        
        
        do{
            System.out.println("Enter the number of values you want in the array : ");
        k=Integer.parseInt(scan.nextLine());
        int[] array=new int[k];
        for (int i=0;i<k;i++){
            System.out.println("Enter the value for the index "+i+" element of the array : ");
            array[i]=Integer.parseInt(scan.nextLine());
        }
            System.out.println("Which measure do you want : \n 1. Mean \n 2. Median \n 3. Mode \n 4. Mean,Median,Mode ");
            f=Integer.parseInt(scan.nextLine());
            switch(f){
                case 1 : 
                System.out.println("The mean is : "+mean(array));
                break;
                case 2 : 
                System.out.println("The median is : "+median(array));
                break;
                case 3 :
                System.out.println("The mode is : "+mode(array));
                break;
                case 4 : 
                System.out.println("The mean is : "+mean(array)+"\n The median is : "+median(array)+"\n The mode is : "+mode(array));
                break;
                default:
                System.out.println("Invalid number");
            }
        System.out.println("Press 0 to get another measure");
        g=Integer.parseInt(scan.nextLine());
        }while(g==0);
        
        
        
    }

    
        }
        
    
    

