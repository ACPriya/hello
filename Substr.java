public class Substr
{
	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int n=s.length();
	int a=0;
	String str="";
	int cnt=0;
	for(int i=0;i<n;i++)
	{
	    cnt=1;
	    for(int j=i+1;j<n;j++)
	    {
	       if(i!=j)
	       {
	        for(int k=0;k<str.length();k++)
	        {
	            if(s.charAt(i)==str.charAt(k))
	            {
	                cnt=0;
	                break;
	            }
	        }
	        if(cnt!=0)
	        {
	         if(s.charAt(i)==s.charAt(j))
	        {
	            cnt++;
	            str+=s.charAt(i);
	        }
	        }
	    }
	    }
	   if(cnt!=0)
	   a++;
	}
	System.out.println(a);
	}
}
