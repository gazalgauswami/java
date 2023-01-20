
interface Bank{
    float rate();
}

class SBI implements Bank{
    public float rate(){return 9.15f;}
}

class PNB implements Bank{
    public float rate(){return 9.7f;}
}

class TestInterface {
    public static void main(String[] args){
        SBI t = new SBI();

        System.out.println("Rate Of Intesat: "+ t.rate());
    }
}