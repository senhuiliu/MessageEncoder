/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
public class ShuffleCipher implements MessageEncoder{
   
   
    private int n;
   
  
    public ShuffleCipher (int n){
        this.n = n;
    }
   
    // shuffle and returns the given text for a single time
    private String shuffle(String text){
       
        int mid;
        if (text.length() % 2 == 0)
            mid = text.length()/2;
        else
            mid = (text.length()+1)/2;
        // first half of given string
        String first = text.substring(0, mid);
        //second half
        String second = text.substring(mid);
       
        String shuffled = "";
        // shuffling
        for(int i=0, j=0 ;i < first.length(); i++, j++)
        {
            shuffled += first.charAt(i);
            if(j < second.length())
                shuffled += second.charAt(i);           
        }
       
        return shuffled;
    }
   
   
   
    // encodes and returns the given plain text
    public String encode(String plainText){
        String encodedMsg = plainText;
        for(int i=0;i<n;i++)
            encodedMsg = shuffle(encodedMsg);
        return encodedMsg;
    }
}
