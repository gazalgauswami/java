//BufferedReader in java

import java.io.*;

class bufferReader{
    public static void main(String[] args) throws IOException{
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter String: ");
        String str = bfn.readLine();

        System.out.println("Enter Integer: ");
        int it = Integer.parseInt(bfn.readLine());

        System.out.println("String: "+str);
        System.out.println("Integer: "+it);
    }
}