/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
   public class SubstitutionCipher implements MessageEncoder{
   
    // value to shift the chacacters
    private int shiftBy;   
   
    
    public SubstitutionCipher (int shiftBy){
        this.shiftBy = shiftBy;
    }
   
    
    private char shift(char ch, int shiftValue){
        char shiftedChar = ch;       
        // if the char is in lower case
        if(ch >= 'a' && ch <= 'z')
            shiftedChar = (char) ( 'a' + ( ch - 'a' + shiftValue ) %26 );
        // upper case char
        else if(ch >= 'A' && ch <= 'Z')
            shiftedChar = (char) ( 'A' + ( ch - 'A' + shiftValue ) %26 );
        return shiftedChar;
    }
   
    // encode and returns the given plain text
    public String encode(String plainText){
        String encodedMsg = "";
        for( int i = 0; i < plainText.length(); i++){
            char ch = plainText.charAt(i);
            encodedMsg += shift(ch, shiftBy);
        }
        return encodedMsg;
    }
   }