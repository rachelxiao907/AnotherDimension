import java.io.*;
import java.util.*;

public class Tester {
  public static void main(String[] args) {
    // Expected outputs are commented out
    // Part 4
    int[][]  A = { {  1,  0, 12, -1 }, {  7, -2,  2,  1 }, { -5, -2,  2, -9 } };
    int[]  B  = {  1, 3, 5 };
    System.out.println(ArrayOps.sum(B));  // 9
    System.out.println(ArrayOps.largest(B));  // 5
    System.out.println(Arrays.toString(ArrayOps.sumRows(A)));  // [12, 8, -14]
    System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));  // [12, 7, 2]
    System.out.println( ArrayOps.sum(A));  // 6

    // Part 5
    System.out.println(Arrays.toString(ArrayOps.sumCols(A)));  // [3, -4, 16, -9]
    int[][] C = { {  1,  2, 3, 4 }, {  2, 3,  4,  1 }, { 3, 4,  1, 2 } };
    int[][] D = { {  1,  1, 1 }, {  2, 2, 2 }, { 3,  3, 3 } };
    int[][] E = { {  2,  2, 2 }, {  2, 2, 2 } };
    System.out.println(ArrayOps.isRowMagic(C));  // true
    System.out.println(ArrayOps.isRowMagic(D));  // false
    System.out.println(ArrayOps.isRowMagic(E));  // true
    System.out.println(ArrayOps.isColMagic(C));  // false
    System.out.println(ArrayOps.isColMagic(D));  // true
    System.out.println(ArrayOps.isColMagic(E));  // true

    int[][] F = { {  2,  4, 2 }, {  2, 2, 2 } };
    System.out.println(ArrayOps.isLocationMagic(F, 0, 1));  // false 2 + 4 + 2  !=  4 + 2
    System.out.println(ArrayOps.isLocationMagic(F, 1, 1));  // true 2 + 2 + 2 == 4 + 2
  }
}
