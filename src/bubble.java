import java.util.Scanner;

public class bubble {
    public static void main(String[] args) {
        shor();
    }
    static void shor(){

        System.out.println("enter your number n how many you want");
        Scanner SC=new Scanner(System.in);
        int n=SC.nextInt();


        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i]=SC.nextInt();
        }
        System.out.println("after sorting");
        for (int i =0;i<n;i++){
            System.out.println(a[i]);
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                if (a[j]>a[j+1]){
                    int tmp=0;
                    tmp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=tmp;

                }

            }
        }
        System.out.println("sorting element");
        for (int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
   // public static void sort(){
  //      for(int i=0;i<a.l;)

  //  }//
}
