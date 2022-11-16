 class overloading{

    static int add(int a, int b)
    {
        return a+b;

    }
    static int add(int a, int b, int c){
        return a+b+c;
    }

    class oading1{
    
    public static void main(String[] args) {
    
        System.out.println(overloading.add(11,22));
          System.out.println(overloading.add(31,12,33));

    }

}
}