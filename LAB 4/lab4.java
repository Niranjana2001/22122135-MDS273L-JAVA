import java.util.*;
class lab4{
    static String acc_no;
    static int balance;
    static String cust_name;
    static Scanner scan=new Scanner(System.in);
    static String[] new_cust(){
        String[] details=new String[3];
        System.out.println("Enter the account holder's name : ");
        details[0]=scan.nextLine();
        System.out.println("Enter the account number : ");
        details[1]=scan.nextLine();
        System.out.println("Enter the amount you want to deposit : ");
        details[2]=scan.nextLine();
        return details; 
    }
    static int cust_deposit(int[] depositarray){
        int d;
        boolean dep;
        System.out.println("Enter the amount you want to deposit : ");
        d=Integer.parseInt(scan.nextLine());
        balance=balance+d;
        System.out.println("The new balance is : "+balance);
        
        dep=true;
        for (int i=0;i<depositarray.length;i++){
            depositarray[i]=d;
        }
        return d;
    }
    static int cust_withdrawal(int [] withdrawalarray){
        int w;
        boolean wd;
        System.out.println("Enter the amount you want to withdraw : ");
        w=Integer.parseInt(scan.nextLine());
        if(w<balance){
            balance=balance-w;
            System.out.println("The new balance is : "+balance);
            
            wd=true;
        }else{
            System.out.println("Insufficient funds");
        }
        return w;
    }
    static String[][] cust_transaction(int d, int w, int k, boolean dep, boolean wd) {
    String[][] transactions = new String[k + 1][4];
    transactions[0][0] = "Type";
    transactions[0][1] = "Amount";
    transactions[0][2] = "Previous Balance";
    transactions[0][3] = "Current Balance";
    int prevBalance = balance;
    for (int i = 1; i <= k; i++) {
        
        if (i == k && dep) {
            transactions[i][0] = "Deposit";
            transactions[i][1] = Integer.toString(d);
        } else if (i == k && wd) {
            transactions[i][0] = "Withdrawal";
            transactions[i][1] = Integer.toString(w);
            prevBalance = balance + w;
        } else {
            transactions[i][0] = "";
            transactions[i][1] = "";
        }
        transactions[i][2] = Integer.toString(prevBalance);
        balance += Integer.parseInt(transactions[i][1]);
        transactions[i][3] = Integer.toString(balance);
        prevBalance = balance;
    }
    for (int i = 0; i < transactions.length; i++) {
        for (int j = 0; j < transactions[i].length; j++) {
            System.out.print(transactions[i][j] + " ");
        }
        System.out.println();
    }
    return transactions;
}

    
    
    static String cust_summary(){
        System.out.println("Account Summary");
        System.out.println("Account Holder's name : "+cust_name);

        System.out.println("Account number : "+acc_no);
        System.out.println("The current balance is : "+balance);
    
return cust_name;
        
    }
    public static void main(String[] args){
        String[] array=new String[3];
        array=new_cust();
        cust_name=array[0];
        acc_no=array[1];
        balance=Integer.parseInt(array[2]);
        int k=0;
        
        int j;
        int d=0;
        int w=0;
        
       boolean dep=false;
       boolean wd=false;
        String n;
        String[][] transactions;
        int e;
        do{
            int[] deposits=new int[k];
        int[] withdrawals=new int[k];
           System.out.println(" 1.Deposit \n 2.Withdrawal \n 3.Transactions \n 4.Summary \n Enter your choice : ");
           e=Integer.parseInt(scan.nextLine());
           switch(e){
            case 1 : 
            d=cust_deposit(deposits);
            dep=true;
            k++;
            break;
            case 2 : 
            w=cust_withdrawal(withdrawals);
            k++;
            wd=true;
            break;
            case 3 :
            transactions=cust_transaction(d,w,k,dep,wd);
            break;

            case 4 :
            n=cust_summary();
            break;
            default:
            System.out.println("Enter a valid choice.");
           }
            System.out.println("Press 0 to continue");
            j=Integer.parseInt(scan.nextLine());
        }while(j==0);
        
        


    }


}