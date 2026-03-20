public class diamond {
  public static void main(String a[]){
    int n=4;
    for(int i=0;i<4;i++){
      for(int j=0;j<n-1-i;j++){
        System.out.print(" ");
      }
      for(int j=0;j<((2*i)+1);j++){
        System.out.print("*");
      }
      System.out.println();
    }
    for(int i=3;i>=0;i--){
      for(int j=0;j<n-1-i;j++){
        System.out.print(" ");
      }
      for(int j=0;j<((2*i)+1);j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
