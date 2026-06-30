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

// COunt the no of vowels in the all sub strings...?

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        int total=0;
        int subs=0;
        int index=-1;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                subs+=(i+1)*(n-i);
            }
        }
        System.out.print(subs);
    }
}

COunt the max no of vowels in the all sub strings of length k...

    // Input:
// s = "abciiidef"
// k = 3

// Output:
// 3

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        int k=3;
        int count=0;
        int maxCount=0;
        for(int i=0;i<=n-k;i++){
            for(int j=i;j<i+k;j++){
                char ch=s.charAt(j);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    count++;
                }
                }
                maxCount=Math.max(count,maxCount);
                count=0;
            }
        System.out.print(maxCount);
    }
}
// Check if the first two characters of the string is uppercasse and the next 4 char is numbers and the next 2 is upper case....

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n=s.length();
        int x=2;
        int y=6;
        int z=n;
        boolean isvalid=true;
        if(n!=8){
            System.out.print("invalid");
            return;
        }
        for(int i=0;i<x;i++){
            char ch=s.charAt(i);
            if(!(ch>='A' && ch<='Z')){
                isvalid=false;
                break;
            }
        }
        for(int i=x;i<y;i++){
            char ch=s.charAt(i);
            if(!(ch>='0' && ch<='9')){
                isvalid=false;
                break;
            }
        }
        for(int i=y;i<n;i++){
            char ch=s.charAt(i);
            if(!(ch>='A' && ch<='Z')){
                isvalid=false;
                break;
            }
        }
        System.out.print(isvalid);
    }
}

// check if there is atleast 1 , upper,lower,number,symbol..

// Welcome@123

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        int upper=0;
        int lower=0;
        int number=0;
        int symbol=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
                number++;
            }
            else if(ch>='A' && ch<='Z'){
                upper++;
            }
            else if(ch>='a' && ch<='z'){
                lower++;
            }
            else{
                symbol++;
            }
        }
        if(upper>=1 && lower>=1 && number>=1 && symbol>=1){
            System.out.print("Strong");
            return;
        }
        System.out.print("Weak");
    }
}

// write the two names into an emain::

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        String x=a.toLowerCase();
        String y=b.toLowerCase();
        System.out.print(x+"."+y+"@company.com");
    }
}

// print the letter with the freq in order

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            else{
            map.put(ch,1);
            }
        }
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(!set.contains(ch)){
            System.out.println(ch+" "+map.get(ch));
            }
            set.add(ch);
        }
    }
}

// Input
// aaabbcccc
// Output
// a3b2c4

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        int n=a.length();
        int count=1;
        StringBuilder ans = new StringBuilder();
        for(int i=1;i<n;i++){
            char ch=a.charAt(i);
            if(a.charAt(i)==a.charAt(i-1)){
                count++;
            }
            else{
                ans.append(a.charAt(i-1));
                ans.append(count);
                count=1;
            }
        }
        ans.append(a.charAt(n-1));
        ans.append(count);
        System.out.print(ans);
    }
}

// Find the first non repeating character::
    
import java.util.*;
class Main {
    public static void main(String[] args) {
        // swiss
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(map.get(ch)==1){
                System.out.print(ch);
                return;
            }
        }
        System.out.print("-1");
    }
}

// check if a string consists of another string::

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ABCD
        // ACBD
        String s=sc.nextLine();
        String t=sc.nextLine();
        int n=s.length();
        String k=s+s;
        if(k.contains(t)){
            System.out.print("yes");
        }
        else{
            System.out.print("No");
        }
    }
}

// check if two strings are isomorphic::
    
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        int n=s.length();
        int m=t.length();
        // egg
        // add
        if(n!=m){
            System.out.print("No");
        }
        HashMap<Character,Character> map=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            char ch2=t.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch)!=ch2){
                    System.out.print("No");
                    return;
                }
            }
            else{
                map.put(ch,ch2);
            }
            if(map2.containsKey(ch2)){
                if(map2.get(ch2)!=ch){
                    System.out.print("No");
                    return;
                }
            }
            else{
                map2.put(ch2,ch);
            }
        }
        System.out.print("yes");
    }
}

// No of swaps required to transform the array to array2...

import java.util.*;
// 5
// 20 40 29 10 98
// 10 98 40 20 29
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        int[] arr2=new int[m];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        if(n!=m){
            System.out.print("-1");
        }
        int[] x=Arrays.copyOf(arr,n);
        int[] y=Arrays.copyOf(arr2,m);
        Arrays.sort(x);
        Arrays.sort(y);
        if(!Arrays.equals(x,y)){
            System.out.print("-1");
        }
        int swaps=0;
        for(int i=0;i<n;i++){
            if(arr[i]==arr2[i]){
                continue;
            }
            int j=i+1;
            while(j<n && arr[j]!=arr2[i]){
                j++;
            }
            while(j>i){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                swaps++;
                j--;
            }
        }
        System.out.print(swaps);
    }
}

// MaxProduct SUbarray::

// -2  3  -4
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxProduct=arr[0];
        int minProduct=arr[0];
        int answer=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<0){
                int temp=maxProduct;
                maxProduct=minProduct;
                minProduct=temp;
            }
            maxProduct=Math.max(arr[i],arr[i]*maxProduct);
            minProduct=Math.min(arr[i],arr[i]*minProduct);
        }
        System.out.print(maxProduct);
    }
}

highest freq of the word...//

    import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        // Count frequency
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        // Find maximum frequency
        int max = 0;
        for (String key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
            }
        }

        // Print all words with maximum frequency
        for (String key : map.keySet()) {
            if (map.get(key) == max) {
                System.out.print(key + " " + map.get(key) + " ");
            }
        }
    }
}
// prefix Sum 1::

class NumArray {
    int[] pre;
    public NumArray(int[] nums) {
        pre=new int[nums.length+1];
        for(int i=1;i<=nums.length;i++){
            pre[i]=pre[i-1]+nums[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        return pre[right+1]-pre[left];
    }
}















