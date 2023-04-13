
package Lista3;


public class Exercicio9 {
    public Exercicio9 (){
        }
        public String divisibilidade (int num){
            if ((num % 3 ==0) && (num % 5 ==0)){
                return "caso 3";
            }
            if ((num % 5 ==0) && (num % 3 != 0)){
                return "caso 2";
            }
            if ((num % 3 == 0) && (num % 5 != 0)){
                return "caso 1";
            }
            return "nenhum";
        }
}
