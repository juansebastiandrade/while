import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroEntrada = 0;
        int resultadoFactorial = 1;
        int opcion;

        do {
            System.out.println("Ingrese la opción que desea: 1. Calcular factorial 2. Determinar si es par o impar 3. Terminar");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un número para calcular el factorial");
                    numeroEntrada = scanner.nextInt();
                    resultadoFactorial = 1; // Reiniciar el valor del factorial para cada nuevo cálculo
                    for (int i = 1; i <= numeroEntrada; i++) {
                        resultadoFactorial *= i;
                    }
                    System.out.println(resultadoFactorial + " es el factorial de " + numeroEntrada);
                    break;

                case 2:
                    System.out.println("Ingrese un número para determinar si es par o impar");
                    numeroEntrada = scanner.nextInt();
                    if (numeroEntrada % 2 == 0) {
                        System.out.println(numeroEntrada + " es par");
                    } else {
                        System.out.println(numeroEntrada + " es impar");
                    }
                    break;
            }
        } while (opcion != 3);

        scanner.close(); 
    }
}