public class method_overloding {
class adder{
  static int add (int a,int b){return (a+b);}
  static int add(int x,int y,int z){return (x+y+z);}
public static void main (string []args){
  System.out.println(adder.add(11,11));
  System.out.println(adder.add(11,11,11));
}

   
}

}
