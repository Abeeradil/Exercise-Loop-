import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
////        1.Write a program that prints the numbers from 1 to 100 such that:
////        If the number is a multiple of 3, you need to print "Fizz" instead of that
////        number.
//        //بدايه اللوب عشان ينطبع رقم من واحد لميه
//        for (int j = 1; j <= 100; j++) {
//            //نتأكد ان العدد من مضاعفات 3 و ال5
//            if (j % 3 == 0 && j % 5 == 0) {
//                // If it's a multiple of both, print "FizzBuzz"
//                System.out.println("FizzBuzz");
//            }
//            // نتاكد ان العدد من مضاعفات 3 اولا
//            else if (j % 3 == 0) {
//                //نطبع 'fizz'بدال الرقم اللي من مضاعفات 3
//                System.out.println("fizz");
//            }
//            // نتاكد ان العدد من مضاعفات ال5
//            else if (j % 5 == 0) {
//                //اذا تحقق الشرط نطبع 'buzz' بدال الرقم اللي من مضاعفات ال5
//                System.out.println("Buzz");
//            } else {
//                // عدا ذلك نطبع باقي الارقام زي ما هيا
//                System.out.println(j);
        //}
//}
//        2.Write a Java program to reverse a string.

        //ناخذ اي كلمه من المستخدم
//        System.out.print("Input a string: ");
//        String st = data.nextLine();
//
//        // نعرف ال "StringBuilder" لان هاذي الداله اللي تعكس
//        StringBuilder reversedStr = new StringBuilder(st);
//
        // عكس الكلمه باستخدام الميثود "reverse()"
//        reversedStr.reverse();
//
        // نطبع الكلمه المعكوسه
//        System.out.println("Reverse string: " + reversedStr);

//        3.Write a program to find the factorial value of any number entered
//        through the keyboard.

       // ناخذ رقم من المستخدم عشان نشوف كم ضريبته
//        System.out.print("Enter a number to find its factorial: ");
//        int number = data.nextInt();
//
        // نخزن الناتج في المتغير
//        long factorial = 1;
//
        // نحسب الضريبه باللوب هذا
//        for (int i = 1; i <= number; i++) {
//            factorial *= i; // نضرب العدد في العامل
//        }
//
//        // نطبع قيه الضريبه
//        System.out.println("Factorial of " + number + " is: " + factorial);

////        4.Two numbers are entered through the keyboard. Write a program to find
////        the value of one number raised to the power of another. (Do not use Java
////        built-in method)
//
       // نطلب من اليوزر يدخل رقم
//        System.out.print("Enter the base number: ");
//        int base = data.nextInt();
//
//        // نطلب من اليوزر يدخل رقم الاس او القوى المرفوعه
//        System.out.print("Enter the exponent: ");
//        int exponent = data.nextInt();
//
       // نخزن الناتج
//        long result = 1;
//
//        // اللوب عشان نشوف كم رقم القوى اللي دخلناه
//        for (int i = 1; i <= exponent; i++) {
//            result *= base; // ونضرب في العدد المخزن
//        }
//
//        // الناتج
//        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

////5.Write a program that reads a set of integers, and then prints the sum of
////the even and odd integers.
//
//        // تعريف المتغيرات الزوجيه و الفرديه
//        int even = 0, odd = 0;
//      //ناخذ من المستخدم رقم غير الصفر
//        System.out.println("Enter any integers number (Except for zero, because zero means stop):");
//
//        while (data.hasNextInt()) {
//            int num = data.nextInt();
//
//        //نشيك اذا المستخدم حط 0 او لا
//        if (num == 0) {
//            break; // اذا حط صفر نوقف البرنامج
//        }
//
//        // نشوف اذا الرقم فردي او زوجي ونضيف في العداد
//        if (num % 2 == 0) {
//            even += num;
//        } else {
//            odd += num;
//        }
//    }
//
//        // نواتج جمع الاعداد المدخله الفرديه والزوجيه
//        System.out.println("Sum of even numbers: " + even);
//        System.out.println("Sum of odd numbers: " + odd);
//
//        6.Write a program that prompts the user to input a positive integer. It
//        should then output a message indicating whether the number is a prime
//        number.
        // ادخال العدد الموجب
//        System.out.print("Enter a positive integer: ");
//        int number = data.nextInt();
//
//        // نشيك اذا العدد موجب او لا اذا اقل من 0 سالب
//        if (number <= 0) {
//            System.out.println("Please enter a positive integer.");
//        } else if (number == 1) {
//            // رقم واحد مو عدد اولي
//            System.out.println("1 is not a prime number.");
//        } else {
//            // نتوقع يكون العدد اولي عشان كذا البوليان ترو
//            boolean isPrime = true;
//
//            // نشيك اذا الارقام اللي فوق اثنين هي اوليه او لا ليش اثنثن لان اقل من صفر سالب وصفروواحد غير اوليين
//            for (int i = 2; i * i <= number; i++) {
//                if (number % i == 0) {
//                    isPrime = false; // Number is divisible by i, so it's not prime
//                    break;
//                }
//            }
//
//            // نطبع الناتج اذا اولي او لا
//            if (isPrime) {
//                System.out.println(number + " is a prime number.");
//            } else {
//                System.out.println(number + " is not a prime number.");
//            }
//        }
//  7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
//  another for loop to print the days (Days 1 -7) for each week.

        // نخزن الاسابيع الاربعه اللي نباها من 1-4
//        for (int week = 1; week <= 4; week++) {
//            System.out.println("\n"+"Week " + week );
//
//            // وهاذي اللوب عشان نسوي ايام الاسبوع من 1-7
//            for (int day = 1; day <= 7; day++) {
//                System.out.println("Day" + day);
//            }
//        }
////        8.Write a program thats check if the word is a palindrome or not. hint: A
////        string is said to be a palindrome if it is the same if we start reading it from
////        left to right or right to left

        // ناخذ من المستخدم اي كلمه
//        System.out.print("Enter any word: ");
//        String word = data.nextLine();
//
//        // نعكس الكلمه
//        String reversed = "";
//        for (int i = word.length() - 1; i >= 0; i--) {// عشان نعكس الحروف حرف حرف من اليسار الى اليمين
//            reversed += word.charAt(i);
//        }
//
//        // نشيك اذا الحروف نفس بعض لمن عكسناها واخذنا الحروف
//        if (word.equalsIgnoreCase(reversed)) {// palindrome اذا ايوا نطبع
//            System.out.println(word + " is a palindrome.");
//        } else {// is not a palindrome اذا لا نطبع
//            System.out.println(word + " is not a palindrome.");
//        }

     data.close();
    }
}
