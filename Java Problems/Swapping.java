public class swapping {
  public static void main(String args[]){
    int a,b,temp;
    a=10;
    b=20;
    temp=a;
    a=b;
    b=temp;
    System.out.println("a is="+a);
    System.out.println("b is="+b);
    int c=13;
    int d=14;
    c=c+d;
    d=c-d;
    c=c-d;
    System.out.println("after swapping c="+c);
    System.out.println("after swapping d="+d);
  }
}
