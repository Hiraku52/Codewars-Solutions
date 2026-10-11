import java.lang.StringBuilder;
class Solution{
​
  static String toCamelCase(String s){
    
    String [] palabras = s.split ("[-_]");
    StringBuilder resultado = new StringBuilder();
    
    for (int i = 0; i < palabras.length; i++){
      
      if (i == 0) { 
        resultado.append(palabras[i]);
      }
      
      else {
        resultado.append(palabras[i].substring(0, 1).toUpperCase()).append(palabras[i].substring(1));
      }
    }
    return resultado.toString();
  }
}