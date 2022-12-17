import java.util.Scanner;

public class conditionloops {
    public static void main(String[] args) {
        // Q1 print numbers from 1 to 5
//        for (int num=1; num<=5;num++)
//            System.out.println(num);
        //print numbers from 1 to n
//        Scanner in= new Scanner(System.in);
//        int n = in.nextInt();
//        for (int num = 7; num <=n ; num++) {
//            System.out.println(num);
//        }
//       char letter = 'x';
//               while(letter!='x')
//               {
//                   System.out.println(letter);
//                   letter+=1;
//               }

        // Do while loop
//        int num =1;
//        do {
//            System.out.println("hello");
//        }
//        while (num!=1);
//         // find the largest of th 3 numbers
//       Scanner in = new Scanner(System.in);
//       int a = in.nextInt() ;
//        int b = in.nextInt();
//        int c = in.nextInt();
    //    int max = a;
//        if (b>max)
//        {
//            max = b;
//        }
//        if (c>max){
//            max = c;
//        }
//        System.out.println(max);

//        int max = 0;
//        if (a>b)
//        {
//            max=a;
//        }
//        else {
//            max=b;
//        }
//        if (c>max)
//        {
//            max=c;
//        }
//        System.out.println(max);

//        int max = Math.max(c, Math.max(a,b));
//        System.out.println(max);
//        System.out.println(Math.max(8,9));




        //type check
//        Scanner in = new Scanner(System.in);
//        char ch = in.next().trim().charAt(0);
//        if (ch>='a' && ch<='z')
//        {
//            System.out.println("lowercase");
//        }
//        else {
//            System.out.println("Uppercase");
//        }


        // find the nth fibonacci
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int a = 0;
//        int b = 1;
//        int count = 2;
//        while (count<=n){
//            int temp = b;
//            b = b+a;
//            a = temp;
//            count++;
//        }
//        System.out.println(b);

       // counting occurrences
//        int n = 137687;
//        int ln= n%10;
//        System.out.println(ln);

      //  count the numbers of 3
//        int n = 45535;
//
//        int count = 0;
//        while (n > 0) {
//            int rem = n % 10;
//            if (rem == 5) {
//                count++;
//            }
//            n = n / 10; // n /= 10
//        }
//
//        System.out.println(count);


        // reverse

//        int num = 123456789;
//
//        int ans = 0;
//
//        while (num > 0) {
//            int rem = num % 10;
//            num /= 10;
//
//            ans = ans * 10 + rem;
//        }
//
//        System.out.println(ans);


        // calculator

//        Scanner in = new Scanner(System.in);
//        int ans = 0;
//        while (true) {
//            System.out.print("Enter the operator: ");
//            char op = in.next().trim().charAt(0);
//
//            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
//                System.out.print("Enter two numbers: ");
//                int num1 = in.nextInt();
//                int num2 = in.nextInt();
//
//                if (op == '+') {
//                    ans = num1 + num2;
//                }
//                if (op == '-') {
//                    ans = num1 - num2;
//                }
//                if (op == '*') {
//                    ans = num1 * num2;
//                }
//                if (op == '/') {
//                    if (num2 != 0) {
//                        ans = num1 / num2;
//                    }
//                }
//                if (op == '%') {
//                    ans = num1 % num2;
//                }
//            } else if (op == 'x' || op == 'X') {
//                break;
//            } else {
//                System.out.println("Invalid operation!!");
//            }
//            System.out.println(ans);
//        }
//






    }
}
