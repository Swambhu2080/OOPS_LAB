import java.io.*;

public class MyFileManager {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("number.txt");
            BufferedReader br = new BufferedReader(fr);
            String str = br.readLine();
            while (str != null) {
                double a = Double.parseDouble(str);
                try{
                    if(a < 0){
                        throw new NegativeNumberException(a);
                    }else{
                        System.out.println(a);
                    }
                }catch (NegativeNumberException e) {
                    System.err.println(e);
                }
                str = br.readLine();
            }
        }catch (FileNotFoundException e) {
            System.err.println("Unable to find requested file.");
        }catch (IOException e){
            System.err.println("Unable to perform IO operations.");
        }
        System.out.println("--- File End ---");
    }
}