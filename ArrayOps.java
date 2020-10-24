public class ArrayOps{

  public static int sum(int[] arr) {
    int a = 0;
    for (int i = 0; i< arr.length; i++){
      a+=arr[i];
    }
    return a;
  }

  public static int largest(int[] arr){
    int a = 0;
    for (int i = 0; i< arr.length && arr[i]>a; i++){
      a = arr[i];
    }
    return a;
  }

}
