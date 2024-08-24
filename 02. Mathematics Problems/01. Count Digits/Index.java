public class Index{
  public int func(int x) {
    int y = 0;
    while (x > 0) {
      x = x / 10;
      y++;

    }
    
    return y;
  }
  public static void main(String[] arg) {
    Index p = new Index();
    System.out.println(p.func(1302));
  }
}