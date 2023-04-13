
package Lista3;


public class Exercicio8 {
    public Exercicio8 (){       
    }
    public boolean vogal (String letra){
    
    String vogais [] = new String [5] ;
            vogais [0] = "a";
            vogais [1] = "e";
            vogais [2] = "i";
            vogais [3] = "o";
            vogais [4] = "u";
            
            for (int i = 0; i<5; i++){
                if (vogais[i].equalsIgnoreCase(letra))
         return true;
        
    }
            return false;
}
}




        