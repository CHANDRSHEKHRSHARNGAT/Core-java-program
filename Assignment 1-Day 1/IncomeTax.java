// Write a java program to calculate the income tax for a given salary over command line option and   
//as per the criteria given below.
//             Slab rate              IT rate
//             Up to Rs. 50,000        Nil
//            Up to Rs. 60,000        10% on additional amount
//            Up to Rs. 1,50,000      20% on additional amount
//            Above Rs. 1,50,000     30% on additional amount



public class IncomeTax {
  public static void main(String[] args) {
    if (args.length != 1) {
    //   System.out.println("Please provide the salary to calculate income tax");
    } else {
      int salary = Integer.parseInt(args[0]);
      double incomeTax = 0;
      if (salary > 0 && salary <= 50000) {
        incomeTax = 0;
      } else if (salary > 50000 && salary <= 60000) {
        incomeTax = (salary - 50000) * 0.10;
      } else if (salary > 60000 && salary <= 150000) {
        incomeTax = (salary - 60000) * 0.20;
      } else if (salary > 150000) {
        incomeTax = (salary - 150000) * 0.30;
      }
      System.out.println("Income Tax for salary " + salary + " is " + incomeTax);
    }
  }
}
