
public class Exemplo1 {

    public static void main(String[] args) {
        int[] vet = {78, 89, 90, 34, 32, 56};
        int[] dados = verificar(vet); 
    }

    private static int[] verificar(int vet[]) {
        int a, b, x, t, max;
        max = vet.length;
        for (a = 0; a <= max - 1; a++) {
            for (b = 0; b <= max - a; b++) {
                if (b < max - 1) {
                    if (vet[b] > vet[b + 1]) {
                        x = vet[b];
                        vet[b] = vet[b + 1];
                        vet[b + 1] = x;
                    }
                }
            }
        }
        return vet;
    }
}
