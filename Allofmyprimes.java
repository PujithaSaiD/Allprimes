import java.util.*;
public class Allofmyprimes {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l=new ArrayList<Integer>();
        while(n%2==0){
            l.add(2);
            n=(int)n/2;
        }
        for(int i=3;i<=((int)n/2)+3;i+=2){
            while(n%i==0){
                l.add(i);
                n=(int)n/i;
            }
        }
        for(int j=0;j<l.size();j++){
            System.out.print(l.get(j));
            System.out.print(" ");
        }
            
        }
    }