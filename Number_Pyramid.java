public class numberpyramid {
  public static void main(String a[]){int n=5;
    for(int i=0;i<n;i++){
      for(int j=0;j<(n-1-i);j++){
        System.out.print(" ");
      }
      for(int j=0;j<=i;j++){
        System.out.print((i+1)+" ");
      }
      System.out.println();
    }
  }
}
