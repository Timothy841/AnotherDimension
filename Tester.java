public class Tester{

  public static void main(String[] args){
    int[] a = {2,4,6};
    int[] b = {3,7,5};
    int[] c = {8,20,4};
    int[] d = {14,3,9};
    int[][] e = {a,b,c,d};
    int[][] f = {
      {  1,  2, 3, 4 },
      {  2, 3,  4,  1 },
      { 3, 4,  1, 2 } };
    int[][] g = {
      {  1,  1, 1 },
      {  2, 2, 2 },
      { 3,  3, 3 } };
    int[][] h = {
      {  2,  2, 2 },
      {  2, 2, 2 } };
    System.out.println(ArrayOps.sum(a));
    System.out.println(ArrayOps.largest(a));
    System.out.println(ArrayOps.arrToString(ArrayOps.sumRows(e)));
    System.out.println(ArrayOps.arrToString(ArrayOps.largestInRows(e)));
    System.out.println(ArrayOps.sum(e));
    System.out.println(ArrayOps.arrToString(ArrayOps.sumCols(e)));
    System.out.println(ArrayOps.isRowMagic(e));
    System.out.println(ArrayOps.isRowMagic(f));
    System.out.println(ArrayOps.isRowMagic(g));
    System.out.println(ArrayOps.isRowMagic(h));
    System.out.println(ArrayOps.isColMagic(e));
    System.out.println(ArrayOps.isColMagic(f));
    System.out.println(ArrayOps.isColMagic(g));
    System.out.println(ArrayOps.isColMagic(h));
  }
}
