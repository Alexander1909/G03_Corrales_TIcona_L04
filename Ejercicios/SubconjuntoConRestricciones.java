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
        // Regla 2: si es múltiplo de 5 y el siguiente es impar, no se puede incluir
        if (actual % 5 == 0 && index + 1 < arr.length && arr[index + 1] % 2 != 0) {
            return puedeSumar(arr, index + 1, objetivo); // no se incluye
        }

        // Intentar con el número incluido o sin incluirlo
        return puedeSumar(arr, index + 1, objetivo - actual) || puedeSumar(arr, index + 1, objetivo);
    }
    public static boolean verificarSuma(int[] entrada) {
        int n = entrada[0]; // cantidad de números
        int objetivo = entrada[entrada.length - 1];
        int[] numeros = new int[n];
        System.arraycopy(entrada, 1, numeros, 0, n);
        return puedeSumar(numeros, 0, objetivo);
    }

}
