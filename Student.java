public class Student {
    public int addition(int a, int b) {
        return a+b;
    }
    public int sub(int a, int b) {
        return a-b;
    }
    public int mul(int a, int b) {
        return a*b;
    }
    public int div(int a, int b) {
        return a/b;
    }
    public void compute(int num) {
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        
        if(num==1) {
            System.out.println("The sum is: " + addition(256,256 ));
        }
        else if(num==2) {
            System.out.println("The difference is: " + sub(256, 256));
        }
        else if(num==3) {
            System.out.println("The product is: " + mul(256, 256));
        }
        else if(num==4) {
            System.out.println("The quotient is: " + div(256, 256));
        }
        else {
            System.out.println("Invalid input");
        }
    }
    public static void main(String[] args) {
        Student adi = new Student();
        adi.compute(3);
    }
}
