

/*
 * Implements Reverse Cipher Algorithm
/**
 *
 * @author Lester
 */
public class Reverser extends Transpose {

    public Reverser(String s) {
        // Complete the constructor 
        super(s);
    }

    public String reverseText(String words) {
    // Complete this method so that it reverses the original string
    // After encode has deployed the letters have been reversed in transpose.
    //Words, however are still in their original position
        String reversedLetters = words;
        
        //Split String
        String [] reverseWordPosition = reversedLetters.split (" ");
        String [] tempCopy =  new String [reverseWordPosition.length];
       
        
        //Reverse the order of the words using an array
        for (int i = 0; i <= (((reverseWordPosition.length) - 1) / 2); i++){
           tempCopy [i] = reverseWordPosition [i];
           reverseWordPosition [i] = reverseWordPosition [reverseWordPosition.length - 1 - i];
           reverseWordPosition [reverseWordPosition.length - 1 - i] = tempCopy [i]; 
        }
               
        
        String s = new String();
        //Pass that array into a String
        for (int i = 0; i < reverseWordPosition.length; i++ ){
            s += reverseWordPosition [i] + " ";
        }
        
        return s;
        
        
        
        
        
    }

    public String decode(String words) {
    // Complete this method so that it reverses the reversed string
        
        String reversedLetters = words;
        String [] reverseWordPosition = reversedLetters.split (" ");
        String [] tempCopy =  new String [reverseWordPosition.length];
       
        
        //Reverse the order of the words to position after Transpose has ran.
        for (int i = 0; i <= (((reverseWordPosition.length) - 1 - i) / 2); i++){
           tempCopy [i] = reverseWordPosition [i];
           reverseWordPosition [i] = reverseWordPosition [(reverseWordPosition.length) - 1 - i];
           reverseWordPosition [(reverseWordPosition.length) - 1 - i] = tempCopy [i]; 
        }
               
        
        String s = new String();
        //Pass that array into a String
        for (int i = 0; i < reverseWordPosition.length; i++ ){
            s += reverseWordPosition [i] + " ";
        }
        
        //Words are in original position but letter are still reversed. Decrypt
        //must be implemented after decode.
        
        return s;
      
        
    }

}
