import java.io.FileFilter;

public class Index {
  static int table[] = new int[256];

  public static void calcBit() {
    table[0] = 0;
    for (int i = 1; i < 256; i++) {
      table[i] = (i & 1) + table[i / 2];

    }
  }

  public static int getSetBit(int n) {
    int res = 0;
    res = table[n & 0xFF];
    n = n >> 8;
    res = res + table[n & 0xFF];
    n = n >> 8;
    res = res + table[n & 0xFF];
    n = n >> 8;
    res = res + table[n & 0xFF];

    return res;
  }

  public static void main(String[] arg) {
    calcBit();
    System.out.println(getSetBit(5000));
  }
}