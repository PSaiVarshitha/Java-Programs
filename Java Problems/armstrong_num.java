public class armstrong_num {
  public static void main(String args[]){
    int num=371,originalnumber,remainder,result=0;
    originalnumber=num;
    while(originalnumber!=0)
    {
      remainder=originalnumber%10;
      result+= math.pow(remainder,3);
      originalnumber/=10;
    }
    if(result==num)
    System.out.println(num+"armstrong");
    else
    System.out.println(num+"not armstrong");


  }
  
}
