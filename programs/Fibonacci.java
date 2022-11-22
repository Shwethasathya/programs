class Fibonacci
{  
public static void main(String args[])  
{    
 int a=5,b=10,c,i,count=15;    
 System.out.print(a+" "+b); 
    
 for(i=1;i<count;++i)   
 {    
  c=a+b;    
  System.out.print(" "+c);    
  a=b;    
  b=c;    
 }    
}
}  

