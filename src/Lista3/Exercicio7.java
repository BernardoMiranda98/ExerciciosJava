package Lista3;

public class Exercicio7 {

    public Exercicio7() {
    }

    public int maiorPrimo(int num) {
        boolean flag = true;

        while (flag) {
            if ((num == 2) || (num == 3) || (num == 5) || (num == 7)) {
                return num;

            } else {
                if ((num % 2 == 0) || (num % 3 == 0) || (num % 5 == 0) || (num % 7 == 0)) {
                    num--;
                } else {
                    return num;
                }
            }
        }
        return 2;
    }
}
