public class hollowsquare {

  public static void main(String a[]){
   int n=3;
   int m=4;
   for(int i=0;i<=n;i++){
    for(int j=0;j<=m;j++){
      if(i==0||i==n||j==0||j==m){
        System.out.print("*"+" ");
      }
      else{
        System.out.print(" "+" ");
      }
    }
    System.out.println();
   }
  }
}
