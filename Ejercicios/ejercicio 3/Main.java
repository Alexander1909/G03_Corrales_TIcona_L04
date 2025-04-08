package ejercicio 3;

public class Main {
    public static void main(String[] args) {
        int INF = Integer.MAX_VALUE; // Valor muy grande que representa "no hay conexión"

        // Matriz de tarifas T: los valores solo existen si se puede ir del i al j
        int[][] T = {
            { 0, 3, 1, 6, INF },
            { 0, 0, 1, 2, INF },
            { 0, 0, 0, 1, 4 },
            { 0, 0, 0, 0, 2 },
            { 0, 0, 0, 0, 0 }
        };

        // Calculamos los costos mínimos
        int[][] C = calcularCostosMinimos(T);

        // Mostramos la matriz resultante
        System.out.println("Matriz de Costos Mínimos:");
        mostrarMatriz(C);
    }
}
