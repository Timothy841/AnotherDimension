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

  public static int sum(int[][] arr) {
    int a = 0;
    for (int i = 0; i< arr.length; i++){
      for (int j = 0; j< arr[i].length; j++){
        a+=arr[i][j];
      }
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

  public static  int[] largestInRows(int[][] matrix){
    int[] a = new int[matrix.length];
    for (int i = 0; i< a.length; i++){
      a[i] = largest(matrix[i]);
    }
    return a;
  }

  public static int[] sumCols(int[][] matrix){
    int[] a = new int[matrix[0].length];
    for (int j = 0; j< matrix[0].length; j++){
      for (int i = 0; i< matrix.length; i++){
        a[j] += matrix[i][j];
      }
    }
    return a;
  }

  public static boolean isRowMagic(int[][] matrix){
    boolean a = true;
    int[] b = sumRows(matrix);
    for (int i = 0; i<b.length-1; i++){
      if (b[i] != b[i+1]){
        a = false;
      }
    }
    return a;
  }

  public static boolean isColMagic(int[][] matrix){
    boolean a = true;
    int[] b = sumCols(matrix);
    for (int i = 0; i<b.length-1; i++){
      if (b[i] != b[i+1]){
        a = false;
      }
    }
    return a;
  }

  public static int[] col(int[][] matrix, int col){
    int[] a = new int[matrix.length];
    for (int i = 0; i< matrix.length; i++){
      a[i] += matrix[i][col];
    }
    return a;
  }

  public static boolean isLocationMagic(int[][] matrix, int row, int col){
    return (sum(matrix[row]) == sum(col(matrix,col)));
  }

}
