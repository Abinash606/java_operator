public class operator_one{
public static void main(String[] args){

/*        Q1 - Write a program to add 8 to the number x and then divide it by 3. Now, the modulus of the quotient
          is taken with 5 and then multiply the resultant value by 5. Display the final result.

 */
        System.out.println("Enter The X: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int exp = (((((x+8) / 3) % 5)*5));
        System.out.println(exp);
//       Q2 - Swap two numbers without the use of third variable.
        System.out.println("Enter The Number For a : ");
        int a = sc.nextInt();
        System.out.println("Enter The NUmber For b : ");
        int b = sc.nextInt();
        System.out.println("Before Swap The Number a is "+ a);
        System.out.println("Before Swap The NUmber b is "+ b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swap The Number a is "+ a);
        System.out.println("After Swap The Number b is "+ b);
//        Q3 - Write a program to calculate the sum of the digits of a 3-digit number.
        System.out.println("Enter The Three-Digits Number");
        int x = sc.nextInt();
        int sum = 0;
        while (x>0){
            sum += x%10;
           x =  x/10;
        }
        System.out.println(sum);

//        Q4 - Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if:
        int a = 55;
        int b = 70;
        System.out.println(a<b && a<50);
        System.out.println(a<50 || a<b);
//        Q5 - Find the total number of bits needed to be flipped to convert x to y.
        int p = sc.nextInt();
        int o = sc.nextInt();
        int n = p ^ o;
        int count = 0;
        while (n != 0){
            n = n & (n-1);
            count++;
        }
        System.out.println(count);


}
}
