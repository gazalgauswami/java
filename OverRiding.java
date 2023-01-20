// method overriding in java

class Bank{
    int getRate(){return 0;}
}
class SBI extends Bank{
    int getRate(){return 8;}
}
class ICICI extends Bank{
    int getRate(){return 6;}
}
class AXIS extends Bank{
    int getRate(){return 7;}
}

class OverRiding{
    public static void main(String[] args){
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();

        System.out.println("SBI Rate of interest: "+s.getRate());
        System.out.println("ICICI Rate of interest: "+i.getRate());
        System.out.println("AXIS Rate of interest: "+a.getRate());
    }
}