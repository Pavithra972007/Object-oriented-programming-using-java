import java.util.Scanner;

interface Calculator
{
    int add(int a, int b);
    int sub(int a, int b);
    int mul(int a, int b);
    int div(int a, int b);
}

class Operations implements Calculator
{
    public int add(int a, int b)
    {
        return a + b;
    }

    public int sub(int a, int b)
    {
        return a - b;
    }

    public int mul(int a, int b)
    {
        return a * b;
    }

    public int div(int a, int b)
    {
        return a / b;
    }
}

class Ex5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Operations o = new Operations();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Mul");
        System.out.println("4. Div");

        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch(ch)
        {
            case 1:
                System.out.println("Addition = " + o.add(a, b));
                break;

            case 2:
                System.out.println("Subtraction = " + o.sub(a, b));
                break;

            case 3:
                System.out.println("Multiplication = " + o.mul(a, b));
                break;

            case 4:
                if(b != 0)
                {
                    System.out.println("Division = " + o.div(a, b));
                }
                else
                {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}