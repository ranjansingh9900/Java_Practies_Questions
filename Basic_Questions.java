// 1 .  Write a Java program to print the result of the following operations.
// Test Data:
// a. -5 + 8 * 6
// b. (55+9) % 9
// c. 20 + -3*5 / 8
// d. 5 + 15 / 3 * 2 - 8 % 3


// sol::


class Main{
    public static void main(String [] args){
        System.out.println(-5+8*6);
        System.out.println((55+9)%9);
        System.out.println(20+(-3*5)/8);
        System.out.println(5+15/3*2-8%3);

    } 
}



//2.. Write a Java program that takes two numbers as input and display the product of two numbers.

// Test Data:
// Input first number: 25
// Input second number: 5

// sol::

import java.util.Scanner;

class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number X: ");
        int x=sc.nextInt();
        
        System.out.println("Enter the Number Y: ");
        int y=sc.nextInt();
        System.out.println("X * Y = "+x*y);


    }
}




// 3. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

// Test Data:
// Input first number: 125
// Input second number: 24
// Expected Output :
// 125 + 24 = 149
// 125 - 24 = 101
// 125 x 24 = 3000
// 125 / 24 = 5
// 125 mod 24 = 5

import java.util.Scanner;
class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number: ");
        int x=sc.nextInt();
        System.out.println("enter second number: ");
        int y=sc.nextInt();
        System.out.println(x+" + "+y+" = "+(x+y));
        System.out.println(x+" - "+y+" = "+(x-y));
        System.out.println(x+" * "+y+" = "+(x*y));
        System.out.println(x+" % "+y+" = "+(x%y));
        System.out.println(x+" / "+y+" = "+(x/y));


    }
}





// 4. Write a Java program that takes a number as input and prints its multiplication table upto 10.
// Test Data:
// Input a number: 8
// Expected Output :
// 8 x 1 = 8
// 8 x 2 = 16
// 8 x 3 = 24
// ...
// 8 x 10 = 80


import java.util.Scanner;

class Main{

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Number: ");
        int x=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(x+" * "+i+" = "+(x*i));
        }
    }
}



// 5. Write a Java program to display the following pattern.
// Sample Pattern :

//    J    a   v     v  a                                                  
//    J   a a   v   v  a a                                                 
// J  J  aaaaa   V V  aaaaa                                                
//  JJ  a     a   V  a     a


// sol::

import java.util.Scanner;
class Main{

    public static void main(String []agrs){
        Scanner sc =new Scanner(System.in);
        System.out.println("   j    a    v     v    a");
        System.out.println("   j   a a    v   v    a a");
        System.out.println("j  j  aaaaa    v v    aaaaa");
        System.out.println(" jj  a     a    v    a     a");

    }
}





