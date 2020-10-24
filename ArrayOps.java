public class ArrayOps{

  public static String arrToString(int[] arr){
    String a = "{";
    for (int i = 0; i<arr.length;i++){
      if (i<arr.length-1){
        a+=arr[i]+", ";
      }
      else{
        a+=arr[i];
      }
    }
    a+="}, ";
    return a;
  }

  public static String arrayDeepToString(int[][] arr){
    String a = "";
    for (int i = 0; i<arr.length; i++){
      a+=arrToString(arr[i]);
    }
    return a;
  }

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

  public static int[] sumRows(int[][] matrix){
    int[] a = new int[matrix.length];
    for (int i = 0; i< a.length; i++){
      a[i] = sum(matrix[i]);
    }
    return a;
  }

}
