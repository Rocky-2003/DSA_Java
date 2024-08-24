public class Index {


  public static int func(int x) {

    int rev = 0;
    int temp = x;
    while (temp != 0) {
      int val = temp % 10;
      rev = rev * 10 + val;
      temp = temp / 10;

    }

    return rev;
  }
  public static void main(String[] args){

    System.out.println(func(367));


    
  }
}