class Array{
  public static void main(String[] args) {
    int a[]= new int[]{23,443,2,42,22};
    for(int i=0;i<5;i++){
      System.out.print(a[i]+ " ");
    }
    System.out.println();
    for (int j=a.length-1;j>=0;j--) {
      System.out.print(a[j]+ " ");
    }
  }
}