//
import java.util.Scanner;

class SavingAccount{
   void withdrow(int x){
    if(x>20000){
        System.out.println("You Are Not Withdrow more money now You Rich The Limit");
    }
    else{
        System.out.println("You Can Withdrow Money");
    }
   }
   void deposite(int y){
    if(y<5000){
        System.out.println("Please Creadit Mimimum 5000/- Balance");
    }
    else{
        System.out.println("You Have Enough Bank Blance");
    }
   }
}
class CurrantAccount{
    void withdrow(int x){
    if(x>40000){
        System.out.println("You Are Not Withdrow more money now You Rich The Limit");
    }
    else{
        System.out.println("You Can Withdrow Money");
    }
   }
   void deposite(int y){
    if(y<5000){
        System.out.println("You Can Get 5% rate ");
    }
    else{
        System.out.println("You Can Get 15% rate");
    }
   }
}
class BankAccounts{
   public static void main(String[] args){
    int acno,deposite,withdrow;
    String name,branch,type;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Your Account Number Two Last Number: ");
    acno = sc.nextInt();

    System.out.println("Enter Your Deposite Amount: ");
    deposite = sc.nextInt();

    System.out.println("Enter Your Branch Name: ");
    branch = sc.nextLine();

    System.out.println("Enter C for currant account and S for saving account: ");
    type = sc.nextLine();

    System.out.println("Enter Your Withdrow Amount: ");
    withdrow = sc.nextInt();

    SavingAccount s1 = new SavingAccount();
    CurrantAccount c1 = new CurrantAccount();

    System.out.println("Account: "+acno);
    System.out.println("Branch: "+branch);
    System.out.println("Deposite: "+deposite);
    System.out.println("Withdrow: "+withdrow);

    if(type=="C"){
        c1.withdrow(withdrow);
    c1.deposite(deposite); 
    }
    else{
    s1.withdrow(withdrow);
    s1.deposite(deposite);
    }
      
   } 

}