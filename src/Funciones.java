import java.util.Scanner;

public class Funciones {
    void punto1(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer texto: ");
        String texto1 = sc.nextLine();

        System.out.print("Ingrese el segundo texto: ");
        String texto2 = sc.nextLine();

        String resultado = texto1 + " " + texto2;
        System.out.println(resultado);

        sc.close();
    }

    void punto2(){
        String nombre = "adrian";
        System.out.println("Hola " + nombre);
    }

    void punto3(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double numero = sc.nextDouble();

        double cuadrado = numero * numero;
        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);

        sc.close();
    }

    void punto4(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = sc.nextDouble();

        double suma = numero1 + numero2;
        System.out.println("La suma es: " + suma);

        sc.close();
    }

    void punto5(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = sc.nextDouble();

        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;
        double residuo = numero1 % numero2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Residuo: " + residuo);

        sc.close();
    }

    void punto6(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número decimal: ");
        double numero = sc.nextDouble();

        double parteEntera = (long) numero;
        double parteDecimal = numero - parteEntera;

        System.out.println("Parte entera: " + parteEntera);
        System.out.println("Parte decimal: " + parteDecimal);

        sc.close();
    }
    double calcularPromedio(double n1, double n2, double n3, double n4, double n5) {
        return n1 * 0.15 + n2 * 0.20 + n3 * 0.15 + n4 * 0.30 + n5 * 0.20;
    }
    void punto7(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la nota 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Ingrese la nota 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Ingrese la nota 3: ");
        double n3 = sc.nextDouble();
        System.out.print("Ingrese la nota 4: ");
        double n4 = sc.nextDouble();
        System.out.print("Ingrese la nota 5: ");
        double n5 = sc.nextDouble();

        double notaFinal = calcularPromedio(n1, n2, n3, n4, n5);

        System.out.println("La nota final es: " + notaFinal);

        sc.close();
    }

    double calcularIVA(double precioBruto) {
        double valorIVA = precioBruto * 0.19;
        return precioBruto + valorIVA;
    }
    void punto8(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio bruto (sin IVA): ");
        double precioBruto = sc.nextDouble();

        double valorIVA = precioBruto * 0.19;
        double precioConIVA = calcularIVA(precioBruto);

        System.out.println("Precio bruto: " + precioBruto);
        System.out.println("Valor del IVA (19%): " + valorIVA);
        System.out.println("Precio con IVA incluido: " + precioConIVA);

        sc.close();
    }

    void punto9(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;

        System.out.println("El área del círculo es: " + area);
        System.out.println("El perímetro del círculo es: " + perimetro);

        sc.close();
    }

    void punto10(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la longitud del lado del hexágono: ");
        double lado = sc.nextDouble();

        double area = (3 * Math.sqrt(3) / 2) * Math.pow(lado, 2);

        System.out.println("El área del hexágono es: " + area);

        sc.close();
    }

    void punto11(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros: ");
        int n = sc.nextInt();

        double suma = 0;
        for (int i = 0; i <= n ; i++) {
            System.out.println("Ingrese el numero " + i + ": ");
            double numero = sc.nextDouble();
            suma += numero;
        }

        double promedio = suma / n;
        System.out.println("El promedio es: " + promedio);

        sc.close();
    }

    void punto12(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Ingrese y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Ingrese x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Ingrese y2: ");
        double y2 = sc.nextDouble();

        double dx = x2 - x1;
        double dy = y2 - y1;
        double distancia = Math.sqrt(dx * dx + dy * dy);

        System.out.println("La distancia es: " + distancia);

        sc.close();
    }

    void punto13(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un dígito: ");
        int n = sc.nextInt();

        int numero1 = n;
        int numero2 = (n * 10) + n;
        int numero3 = (n * 100) + (n * 10) + n;

        int suma = numero1 + numero2 + numero3;

        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(numero3);
        System.out.println("La suma es: " + suma);

        sc.close();
    }

    void punto14(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de segundos: ");
        int segundosTotales = sc.nextInt();

        int horas = segundosTotales / 3600;
        int resto = segundosTotales % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);

        sc.close();
    }

    void punto15(){

    }
}
