import java.io.*;
import  java.util.*;
class UserMainCode
{
 public int isPrime(int input1){
  int count=0;
 for(int i=2;i<=Math.sqrt(input1);i++)
{
 if(input1%i==0)
     count++;
}
if(count==0)
 return 2;
 else
return 1;
 }
}
Footer
© 2023 GitHub, Inc.
