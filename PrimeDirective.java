// Import statement:
import java.util.ArrayList;

class PrimeDirective {
  
  // Add your methods here:

  //"Check-If-Prime-Method"
  public boolean isPrime(int number){
    if(number==2) {
      return true;
      } 
      else if(number < 2){
      return false;
      }

  for(int i=2; i < number; i++){
      if(number%i==0){
      return false;
    }
    

    }
    return true;
  } 
  
//"Only-Primes-Method"
public ArrayList onlyPrimes(int[] numbers){

  ArrayList<Integer> primes = new ArrayList<>();

  for (int number : numbers){
    isPrime(number);
    if ((isPrime(number)==true)){
      primes.add(number);
    }
    }
  return primes;
}

//"Filter-Method"

public ArrayList oddEven(int[] numbers){
  ArrayList<Integer> oddEvenN = new ArrayList<>();

  for (int number : numbers){
    if (number%2==0){
      System.out.println(number + ": This is an even number!");
    }
    else{
      System.out.println(number + ": This is an odd number!");
    }
  }
  return oddEvenN;
}

//"n-Elements-Method"

public ArrayList only3(int[] numbers){
  
  ArrayList<Integer> onlyThree = new ArrayList<>();
  
  for(int number : numbers){
    isPrime(number);
    if((isPrime(number)==true)){
      onlyThree.add(number);
      } else if(onlyThree.size() == 5){
        break;
      }
      
    } 
    return onlyThree;
    }
    


  //Main Method
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {97, 89, 199, 32, 100, 105, 131, 54, 4, 223};
    
    //System.out.println(pd.onlyPrimes(numbers));
    //System.out.println(pd.oddEven(numbers));
    System.out.println(pd.only3(numbers));
 
    }  

}
