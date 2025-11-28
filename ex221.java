import java.util.ArrayList;
import java.util.Scanner;

public class ex221 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int sum=0;
        
        System.out.println("If u want to stop the insertion of element type````` done`````");
        while(true){
            String input = sc.nextLine();
            if(input.equals("done")){
                break;
            }
            try{
                int n = Integer.parseInt(input);
                nums.add(n);



            }catch(NumberFormatException e){
                System.out.println("invalid input");
            }

        }

        for(Integer x: nums){
            sum+=x;
        }

        System.out.println("the sum of elements is arrayList is : "+sum);
        sc.close();
    }
}
