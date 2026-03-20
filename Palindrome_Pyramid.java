public class palindromepyramid {
  public static void main(String a[]){int n=5;
    for(int i=0;i<5;i++){
      for(int j=0;j<n-1-i;j++){
        System.out.print(" ");
      }
      for(int j=i;j>=0;j--){
     int number=j+1;
        System.out.print(number);
      }
      for(int j=1;j<=i;j++){
          int number=j+1;
        System.out.print(number);
      }
      System.out.println();

    }
  }
}//--------------my approach---------------------


// ------------other approach----------------------
// where u can start indexing from one if u consider 
// indexing for row  from one then spacing 
// condition is n-i

//public class palindromepyramid {
//   public static void main(String a[]){int n=5;
//     for(int i=1;i<=5;i++){
//       for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//       }
//       for(int j=i;j>=1;j--){

//         System.out.print(j);
//       }
//       for(int j=2;j<=i;j++){
//         System.out.print(j);
//       }
//       System.out.println();

//     }
//   }
// } 

