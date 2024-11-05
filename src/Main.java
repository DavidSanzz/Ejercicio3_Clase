import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la calculadora de la clase Main");

        menu();

    }

    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        Operations operations = new Operations();

        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        System.out.println("5. Salir");
        System.out.println("Ingresa una opcion: ");

        int opcion = 0;
        try {
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Seleccionó sumar");
                    System.out.println("Ingrese el primer número: ");
                    int a = Integer.parseInt(scanner.nextLine());
                    System.out.println("Ingrese el segundo número: ");
                    int b = Integer.parseInt(scanner.nextLine());

                    System.out.println("El resultado de la suma es: " + operations.suma(a, b));
                    menu();
                    break;

                case 2:
                    System.out.println("Seleccionó restar");
                    System.out.println("Ingrese el primer número: ");
                    a = Integer.parseInt(scanner.nextLine());
                    System.out.println("Ingrese el segundo número: ");
                    b = Integer.parseInt(scanner.nextLine());

                    System.out.println("El resultado de la resta es: " + operations.resta(a, b));
                    menu();
                    break;
                case 3:
                    System.out.println("Seleccionó multiplicar");
                    System.out.println("Ingrese el primer número: ");
                    a = Integer.parseInt(scanner.nextLine());
                    System.out.println("Ingrese el segundo número: ");
                    b = Integer.parseInt(scanner.nextLine());

                    System.out.println("El resultado de la multiplicación es: " + operations.multiplicacion(a, b));
                    menu();
                    break;

                default:
                    System.out.println("Opción no válida");
                    menu();  // Llama nuevamente al menú
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese un número válido");
            menu();  // Llama nuevamente al menú
        }



    }
}