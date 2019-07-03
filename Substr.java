import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	String a=sc.next();
		int max=0;
        char ta[] = a.toCharArray(); 
          
        Arrays.sort(ta); 
	    for(int i=0;i<ta.length-1;i++)
	    {
	        if(ta[i]!=ta[i+1])
	        max++;
	    }
		System.out.print(max+1);
		}
}
