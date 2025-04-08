public class SubconjuntoConRestricciones {

    public static boolean esPotenciaDe2(int num) {
        return num > 0 && (num & (num - 1)) == 0;
    }
}
