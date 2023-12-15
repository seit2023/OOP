
import java.util.*;
//import java.io.*;
public class GenericDemo{
    static int count = 0; //COUNT VARIABLE
    
    //FUNCTION TO CHECK PALINDROME
    static void check_palindrome(String x){
       
    	String reverse = new StringBuffer(x).reverse().toString();
    	if(x.equals(reverse)){
            System.out.println(x+" is a Palindrome");
            count += 1; //count the number of palindromes
        }
        else{
            System.out.println(x+" is not a Palindrome");
        }
    }
        //FUNCTION TO CHECK EVEN OR ODD
    static void even_odd(int x){
        if(x % 2 == 0){
            System.out.println(x+" IS EVEN");
            count += 1; //count the number of even numbers
        }
        else{
            System.out.println(x+" IS ODD");
        }
    }
  //FUNCION TO CHECK PRIME NUMBER
    static void prime(int x){
        boolean flag = false;
        for(int i = 2; i <= x/2; ++i){
            if(x % i == 0){
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println(x + " is a prime number.");
            count += 1; //count the number of prime numbers
        }
        else{
            System.out.println(x + " is not a prime number.");
        }
    }
  //FUNCTION TO DECIDE WHICH FUNCTION TO CHECK
    static void check(int ch,int x){
        switch(ch){
            case 1:
                even_odd(x); //call even_odd fucntion for number x
                break;
            case 2:
                prime(x); //call prime funtion for number x
                break;
            default:
                System.out.println("ENTER CORRECT OPTION");
        }
    } //FUNCTION FOR INTEGER ARRAY
   // @SuppressWarnings({ "rawtypes", "rawtypes" })
	static void number_op(){
        int element,n,choice;
        
        Scanner sc = new Scanner(System.in);
        
        //ArrayList from Collection Interface
        //Integer type
        ArrayList<Integer> nums = new ArrayList<Integer>(); 
        
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        System.out.println("Enter the elements:");

        for(int i=0;i<n;i++){
            element = sc.nextInt();
            nums.add(element); //Add elements to the ArrayList
        }
        // operations
        System.out.println("Enter the Operation to be performed:");
        System.out.println("1. ODD or EVEN");
        System.out.println("2. PRIME OR NOT");
        choice = sc.nextInt();
        
        
		Iterator itr = nums.iterator(); //Iterator interface
        count = 0;
        while(itr.hasNext()){ //Loop till there are elements in the ArrayList
           check(choice,(Integer) itr.next()); //call the check function for each element
        }
        
        //Give the Count
        if(choice == 1){
            System.out.println("The number of EVEN numbers is: "+ count);
            System.out.println("The number of ODD numbers is: "+ (nums.size()-count));
        }
        else{
            System.out.println("The number of PRIME numbers is: "+ count);
            System.out.println("The number of Non-PRIME numbers is: "+ (nums.size()-count));
        }
    } 
    
  //FUNCTION FOR STRING ARRAY
    static void string_op(){
        int n;
        String word;
        
        //ArrayList from COLLECTION interface
        //String type
        ArrayList<String> words = new ArrayList<String>();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            word = sc.next();
            words.add(word); //Add elements to the ArrayList
        }

        count = 0;
        for(String w:words){ //Loop the ArrayList
            check_palindrome(w);
        }
        
        System.out.println("The number of PALINDROMES is: "+ count);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //Choose the type of List needed
        System.out.println("Choose Type:");
        System.out.println("1. String");
        System.out.println("2. Integer");
        int ch = sc.nextInt();
        
        if(ch == 2)
            number_op(); //Calls Interger arraylist
        else
            string_op(); //Calls String arraylist
    }
    
}



