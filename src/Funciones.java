import java.util.Scanner;

public class Funciones {
    void punto1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer texto: ");
        String texto1 = sc.nextLine();

        System.out.print("Ingrese el segundo texto: ");
        String texto2 = sc.nextLine();

        String resultado = texto1 + " " + texto2;
        System.out.println(resultado);

        sc.close();
    }

    void punto2() {
        String nombre = "adrian";
        System.out.println("Hola " + nombre);
    }

    void punto3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double numero = sc.nextDouble();

        double cuadrado = numero * numero;
        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);

        sc.close();
    }

    void punto4() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = sc.nextDouble();

        double suma = numero1 + numero2;
        System.out.println("La suma es: " + suma);

        sc.close();
    }

    void punto5() {
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

    void punto6() {
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

    void punto7() {
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

    void punto8() {
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

    void punto9() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;

        System.out.println("El área del círculo es: " + area);
        System.out.println("El perímetro del círculo es: " + perimetro);

        sc.close();
    }

    void punto10() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la longitud del lado del hexágono: ");
        double lado = sc.nextDouble();

        double area = (3 * Math.sqrt(3) / 2) * Math.pow(lado, 2);

        System.out.println("El área del hexágono es: " + area);

        sc.close();
    }

    void punto11() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros: ");
        int n = sc.nextInt();

        double suma = 0;
        for (int i = 0; i <= n; i++) {
            System.out.println("Ingrese el numero " + i + ": ");
            double numero = sc.nextDouble();
            suma += numero;
        }

        double promedio = suma / n;
        System.out.println("El promedio es: " + promedio);

        sc.close();
    }

    void punto12() {
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

    void punto13() {
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

    void punto14() {
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

    double parOImpar(double numero) {
        if (numero % 2 == 0) {
            System.out.println(numero + " Es Par.");
        } else {
            System.out.println(numero + " Es Impar.");
        }
        return numero;
    }

    void punto15() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        double punto15 = sc.nextDouble();
        parOImpar(punto15);
    }

    double positivoONegativo(double numero) {
        if (numero > 0) {
            System.out.println(numero + " es Positivo.");
        } else if (numero < 0) {
            System.out.println(numero + " es Negativo.");
        } else {
            System.out.println(numero + " es Cero.");
        }
        return numero;
    }

    void punto16() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        double punto16 = sc.nextDouble();
        positivoONegativo(punto16);
    }

    double calcularVentaConIVA(double venta) {
        double descuento = 0;

        if (venta > 150000) {
            descuento = venta * 0.05;
        }
        double ventaConDescuento = venta - descuento;
        double totalConIVA = calcularIVA(ventaConDescuento);
        double IVA = totalConIVA - ventaConDescuento;

        System.out.println("Venta original: $" + venta);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Venta con descuento:$" + ventaConDescuento);
        System.out.println("IVA: $" + IVA);
        System.out.println("Total a pagar: $" + totalConIVA);

        return descuento;
    }

    void punto17() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de la venta: ");
        double punto17 = sc.nextDouble();
        calcularVentaConIVA(punto17);
    }

    double evaluarEstudiante(double n1, double n2, double n3, double n4, double n5) {
        double notaFinal = calcularPromedio(n1, n2, n3, n4, n5);

        System.out.println("NOta final: " + notaFinal);

        if (notaFinal < 2.0) {
            System.out.println("El estudiante NO PUEDE HABILITAR.");
        } else if (notaFinal < 3.0) {
            System.out.println("El estudiante REPROBÓ.");
        } else {
            System.out.println("El estudiante APROBÓ.");
            if (notaFinal > 4.5) {
                System.out.println("¡Felicitaciones,eres un crack!");
            }
        }
        return notaFinal;
    }

    void punto18() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nota 1 (15%): ");
        double n1 = sc.nextDouble();
        System.out.print("Ingrese nota 2 (20%): ");
        double n2 = sc.nextDouble();
        System.out.print("Ingrese nota 3 (15%): ");
        double n3 = sc.nextDouble();
        System.out.print("Ingrese nota 4 (30%): ");
        double n4 = sc.nextDouble();
        System.out.print("Ingrese nota 5 (20%): ");
        double n5 = sc.nextDouble();
        evaluarEstudiante(n1, n2, n3, n4, n5);
    }

    void resolverEcuacionCuadratica(double a, double b, double c) {
        if (a == 0) {
            System.out.println("No es una ecuación cuadratica");
            return;
        }
        double discriminante = (b * b) - (4 * a * c);

        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Dos soluciones reales: ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("Una unica solucion real");
            System.out.println("x = " + x);
        } else {
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
            System.out.println("Dos soluciones complejas: ");
            System.out.println("x1 = " + parteReal + " + " + parteImaginaria + "i");
            System.out.println("x2 = " + parteReal + " - " + parteImaginaria + "i");
        }
    }

    void punto19() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        double b = sc.nextDouble();
        System.out.print("Ingrese el valor de c: ");
        double c = sc.nextDouble();
        resolverEcuacionCuadratica(a, b, c);
    }

    void validarUsuario(String usuarioIngresado, String contrasenaIngresada) {
        final String UsuarioPredefinido = "adrian";
        final String contrasenaPredefinida = "1124";

        if (usuarioIngresado.equals(UsuarioPredefinido) && contrasenaIngresada.equals(contrasenaPredefinida)) {
            System.out.println("Acceso concedido. Bienvenido, " + usuarioIngresado);
        } else {
            System.out.println("Acceso denegado. Usuario o contraseña incorrectos");
        }
    }

    void punto20() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Ingrese contraseña: ");
        String contrasena = sc.nextLine();
        validarUsuario(usuario, contrasena);
    }

    void punto21() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 0 y 10: ");
        int numero = sc.nextInt();

        String[] nombres = {"Cero", "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez"};

        if (numero >= 0 && numero <= 10) {
            System.out.printf(nombres[numero]);
        } else {
            System.out.println("Numero fuera de rango (0-10)");
        }
        sc.close();
    }

    void punto22() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero menor a 100.000: ");
        int numero = sc.nextInt();

        int n = Math.abs(numero);
        int contador = 0;

        if (n == 0) {
            contador = 1;
        } else {
            while (n > 0) {
                n = n / 10;
                contador++;
            }
        }
        System.out.println("El numero " + numero + " tiene " + contador + " digitos.");

        sc.close();
    }

    void punto23() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int b = sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int c = sc.nextInt();

        if (a < b && b < c) {
            System.out.println("Esta aumentando");
        } else if (a > b && b > c) {
            System.out.println("Esta disminuyendo");
        } else {
            System.out.println("Ni aumenta, ni disminuye");
        }
        sc.close();
    }

    void punto24() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 7: ");
        int dia = sc.nextInt();

        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        if (dia >= 1 && dia <= 7){
            System.out.println(dias[dia-1]);
        }else{
            System.out.println("Numero fuera de rango (1-7)");
        }
        sc.close();
    }
}
