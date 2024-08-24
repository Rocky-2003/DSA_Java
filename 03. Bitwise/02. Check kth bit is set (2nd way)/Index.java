public class Index {
  public static void check(int n, int k){
    if(((n>>(k-1))&1) ==1){
      System.out.println("Yssss");
    } else{
      System.out.println("Noooo");
    }
  }

  public static void main(String[] arg) {
    check(5, 3);
   }
}