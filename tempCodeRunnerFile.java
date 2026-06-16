Practice Java with Dsa::

CHeck even or odd::

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0){
            System.out.print("even");
        }
        else{
            System.out.print("odd");
        }
    }
}

Prime::

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        for(int i=2;i<a;i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.print("Prime");
        }
        else{
            System.out.print("Not");
        }
    }
}

Factorial and sum::

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int fact=1;
        int sum=0;
        for(int i=1;i<=a;i++){
            fact=fact*i;
            sum=sum+fact;
        }
        System.out.print(fact+" "+sum);
    }
}

Fibonacci series::

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        for(int i=0;i<n;i++){
            System.out.println(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}

reverse a number and palindrome ::

import java.util.*;
class Main {
    public static void main(String[] args) {
        int a=89844;
        int temp=a;
        int news=0;
        while(a>0){
            int num=a%10;
            news=news*10+num;
            a=a/10;
        }
        System.out.println(news);
        if(temp==news){
            System.out.print("Valid");
        }
        else{
            System.out.print("Not valid");
        }
    }
}

Arm Strong::

import java.util.*;
class Main {
    public static void main(String[] args) {
        int a=153;
        int temp=a;
        int num=a;
        
        int count=0;
        while(a!=0){
            count++;
            a=a/10;
        }
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum+=(int) Math.pow(digit,count);
            num=num/10;
        }
        if(sum==temp){
            System.out.print("Arm");
        }
        else{
            System.out.print("Not armstrong");
        }
    }
}

Sum of digits::

import java.util.*;
class Main {
    public static void main(String[] args) {
        int a=8975;
        int temp=a;
        int sum=0;
        while(a>0){
            int num=a%10;
            sum+=num;
            a=a/10;
        }
        System.out.print(sum);
    }
}

Largest and the Second Largest::

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // int[] arr=new int[5];
        int largest=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
        int secondLargest=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest=arr[i];
            }
        }
        System.out.print(secondLargest);
    }
}














