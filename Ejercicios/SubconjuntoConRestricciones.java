public class SubconjuntoConRestricciones {

    public static boolean esPotenciaDe2(int num) {
        return num > 0 && (num & (num - 1)) == 0;
    }
    public static boolean puedeSumar(int[] arr, int index, int objetivo) {
        if (index == arr.length) {
            return objetivo == 0;
        }

        int actual = arr[index];

        // Regla 1: si es potencia de 2, debe incluirse
        if (esPotenciaDe2(actual)) {
            return puedeSumar(arr, index + 1, objetivo - actual);
        }
        
}
