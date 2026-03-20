public class butterfly {
  public static void main(String a[]){int n=4;
     for(int i=0;i<=3;i++){
      for(int j=0;j<=i;j++){
        System.out.print("*");
      }
      for(int j=0;j<(2*(n-1-i));j++){
        System.out.print(" ");
      }
          for(int j=0;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
     }
          for(int i=3;i>=0;i--){
      for(int j=0;j<=i;j++){
        System.out.print("*");
      }
      for(int j=0;j<(2*(n-1-i));j++){
        System.out.print(" ");
      }
          for(int j=0;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
     }
  
  
  }
}
