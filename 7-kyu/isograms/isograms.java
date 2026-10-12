import java.util.HashSet;
​
public class isogram {
    public static boolean isIsogram(String str) {
        if (str == null || str.isEmpty()) {
            return true; 
        }
      
      String upStr = str.toUpperCase();
      
      HashSet<Character> letterSeen = new HashSet<>();
      
      for (int i = 0; i < upStr.length(); i++){
        char letter = upStr.charAt(i);
        
        if (!letterSeen.add(letter)){
          return false;
        }
      }
      return true;
    } 
}