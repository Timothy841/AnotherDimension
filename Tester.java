public class Tester{

  public static void main(String[] args){
    int[] a = {2,4,6};
    int[] b = {3,7,5};
    int[] c = {8,20,4};
    int[] d = {14,3,9};
    int[][] e = {a,b,c,d};
    System.out.println(ArrayOps.sum(a));
    System.out.println(ArrayOps.largest(a));
    System.out.println(ArrayOps.arrToString(ArrayOps.sumRows(e)));
    System.out.println(ArrayOps.arrToString(ArrayOps.largestInRows(e)));
  }
}
