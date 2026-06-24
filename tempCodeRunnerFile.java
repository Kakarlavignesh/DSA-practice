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

first non repeating character::

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String a=sc.nextLine();
        String lower=a.toLowerCase();
        StringBuilder reuslt=new StringBuilder();
        int[] ans=new int[26];
        for(int i=0;i<lower.length();i++){
            char c=lower.charAt(i);
            if(c>='a' && c<='z'){
                int index=c-'a';
                ans[index]++;
            }
        }
        for(int i=0;i<a.length();i++){
            char ch=lower.charAt(i);
            if(ch>='a' && ch<='z' && ans[ch-'a']==1){
                System.out.print(a.charAt(i));
                return;
            }
        }
    }
}


duplicate and missing number::

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int[] ans=new int[a];
        for(int i=0;i<a;i++){
            ans[i]=sc.nextInt();
        }
        int duplicate=-1;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<a;i++){
            if(set.contains(ans[i])){
                duplicate=ans[i];
            }
            set.add(ans[i]);
        }
        int original=(a*(a+1))/2;
        int sum=0;
        for(int i=0;i<a;i++){
            sum+=ans[i];
        }
        int missing=original-sum+duplicate;
        System.out.print(duplicate+" "+missing);
    }
}


sum of consecutive prime numbers::

import java.util.*;
class Main {
    public static boolean isPrime(int m){
        boolean isPrime=true;
        if(m<=1){
            return false;
        }
        for(int i=2;i<m;i++){
            if(m%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int sum=m+n;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;ans.size()<sum+3;i++){
            if(isPrime(i)){
                ans.add(i);
            }
            else{
                continue;
            }
        }
        int add=0;
        add+=ans.get(m-1)+ans.get(m)+ans.get(m+1);
        System.out.print(add);
    }
}

// find the largest altitude::

class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int max=0;
        int diff=0;
        int first=0;
        for(int i=0;i<n;i++){
            diff=first+gain[i];
            first=diff;
            max=Math.max(diff,max);
        }
        return max;
    }
}


// threeSum...

class Solution{
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=n-1;
            while(left<right){
            int sum=nums[i]+nums[left]+nums[right];
            if(sum==0){
                ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                while(left<right && nums[left]==nums[left+1]){
                    left++;
                }
                while(left<right && nums[right]==nums[right-1]){
                    right--;
                }
                left++;
                right--;
            }
            else if(sum<0){
                left++;
            }
            else{
                right--;
            }
        }
        }
        return ans;
    }
}

// 4 sum::

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<n-2;j++){
                int left=j+1;
                int right=n-1;
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                while(left<right){
                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        while(left<right && nums[left]==nums[left+1]){
                            left++;
                        }
                        while(left<right && nums[right]==nums[right-1]){
                            right--;
                        }
                        left++;
                        right--;
                    }
                    else if(sum<target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        return ans;
    }
}

Max sum in the configuration:

class Solution {
    int maxSum(int[] arr) {
        int n=arr.length;
        int arrSum=0;
        for(int i=0;i<n;i++){
            arrSum+=arr[i];
        }
        int currVal=0;
        for(int i=0;i<n;i++){
            currVal+=arr[i]*i;
        }
        int maxVal=currVal;
        for(int i=1;i<n;i++){
            currVal=currVal+arrSum-n*arr[n-i];
            maxVal=Math.max(currVal,maxVal);
        }
        return maxVal;
    }
}
printing the elements::

    import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

Linear search::

    import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key=102;
        int val=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                val=arr[i];
            }
        }
        System.out.print(val);
    }
}

remove adjacent duplicates::

    import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        Stack <Character> stack=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(!stack.empty() && ch==stack.peek()){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<stack.size();i++){
            ans.append(stack.get(i));
        }
        System.out.print(ans.toString());
    }
}

number where it is higher than the next number::

    import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int index=-1;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                index=i;
                break;
            }
        }
        System.out.print(index);
    }
}

Diagnol sum of matrix:
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
        int m=arr[0].length;
        int psum=0;
        int ssum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j){
                    psum+=arr[i][j];
                }
                if(i+j==2){
                    ssum+=arr[i][j];
                }
            }
        }
        System.out.println(psum);
        System.out.println(psum);
    }
}
Transpose of a matrix:
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6}};
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
 
    }
}
reverse a matrix into 90 degrees:
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
        // int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                temp=arr[i][j];
                arr[i][j]=arr[i][n-1-j];
                arr[i][n-1-j]=temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
 
    }
}

Longest Subarray with Sum K::

class Solution {
    public int longestSubarray(int[] arr, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=arr.length;
        int maxLen=0;
        int sum=0;
        int j=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
 
            if(sum==k){
                maxLen=i+1;
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            if(map.containsKey(sum-k)){
                maxLen=Math.max(maxLen,i-map.get(sum-k));
            }
        }
        return maxLen;
    }
}





