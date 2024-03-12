public class VowelConsonantCounter {
    public static void main(String[] args) {    
                
        int vowelCount = 0, consonantCount = 0;    
 
        String inputString = "This is a really simple sentence";    
            
        inputString = inputString.toLowerCase();    
            
        for(int i = 0; i < inputString.length(); i++) {    
              
            if(inputString.charAt(i) == 'a' || inputString.charAt(i) == 'e' || inputString.charAt(i) == 'i' || inputString.charAt(i) == 'o' || inputString.charAt(i) == 'u') {    
                    
                vowelCount++;    
            }    
           
            else if(inputString.charAt(i) >= 'a' && inputString.charAt(i) <= 'z') {      
                
                consonantCount++;    
            }    
        }    
        System.out.println("Number of vowels: " + vowelCount);    
        System.out.println("Number of consonants: " + consonantCount);    
    }    
}
