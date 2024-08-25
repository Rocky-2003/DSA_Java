public class Index {
  static int count(int arr[]) {
    int res = 0;
    for (int i = 0; i < arr.length; i++) {
      if ((arr[i] & (arr[i] - 1)) == (arr[i] - 1))
        res++;

    }

    return res;
  }

  public static void main(String[] arg) {
    int arr[] = { 8,7,8,8,7  };
    System.out.println(count(arr));
  }
}