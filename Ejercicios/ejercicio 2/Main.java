package ejercicio 2;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista1 = List.of(4, 2, 7, 10, 4, 17);
        System.out.println("Resultado: " + quickSelect(new ArrayList<>(lista1), 3));  // Esperado: 4

        List<Integer> lista2 = List.of(4, 2, 7, 10, 4, 1, 6);
        System.out.println("Resultado: " + quickSelect(new ArrayList<>(lista2), 5));  // Esperado: 6

}
