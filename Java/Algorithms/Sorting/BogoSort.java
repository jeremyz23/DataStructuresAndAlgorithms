//This Algorithm Use For Sorting Alogrithms 
//Every try it Sorting Random 
//cheack if Random is Sorted done
//else try again Random Sorting
//it tame more and more time
//O(infinty)

package Learn;

import java.util.Random;

public class BogoSort{
 
  private final Random generator = new Random();  
  //This Function Take Array and Try Sorting
  public void BogoSorting(int[] array){     
    //While Array Not Sorting  
    while (!isSorted(array)) {  
      //Generate Random Sorting  
      for (int i = 0; i < array.length; i++){  
        int randomPosition = generator.nextInt(array.length);  
        //Swap
        Swap(array,i,randomPosition); 
      }  
    }  
  }  
 //This Function used for Checking if it Sorted
  private boolean isSorted(int[] array)  {  
    for (int i = 1; i < array.length; i++){
      if (array[i] < array[i - 1]) {
        return false;  
      }
    }
    return true;  
  }  
  //This Normal Function Used For Swap 
  private void Swap(int array[] , int x , int y){
      int temp = array[x];
      array[x] = array[y];
      array[y] = temp;
  }

}
