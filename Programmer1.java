import java.util.Scanner; 
 class Palindrome{
    
    int CheckPalindrome(int n)
    {
        int t,r=0;
         t=n;
  while(t!=0)
  {
    r=r*10;
    r=r+(t%10);
    t=t/10;
  }
  if(r==n)
    return 1;
  else
    return 0;
    }}
        class Check extends Palindrome{
            
           
            void CheckP(int k){
                 int d=0,i;
                 
                i = k + 1;
                while(true)
            {
                d=CheckPalindrome(i);
    
                if(d==1)
                {
                System.out.print(" "+i);    
                break;
                }
                i++;
            }
            
        }}
        

class Programmer1{  
 public static void main(String args[]){  
   Scanner sc=new Scanner(System.in);  
   int ab=sc.nextInt(); 
for(int j=1;j<=ab;j++)
{
     int bc=sc.nextInt();
 Check a=new Check();
 
   
     a.CheckP(bc);
}     
     
 sc.close();
 }    
 }