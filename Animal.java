//single inheritence program

class Animals{
  void eat(){
    System.out.println("eating");
  }
}
class Dog extends Animals{
  void barking(){
    System.out.println("barking");
  }
}
class inherit{
  public static void main(String[] args) {
    Dog d=new Dog();
    d.eat();
    d.barking();
  }
}
