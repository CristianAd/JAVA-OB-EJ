public class EstructurasDeControl {

    public static void main(String[] args) {
        // Usando if
        int numeroIf = 0;
        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

        // Usando while
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("El número es: " + numeroWhile);
        }

        // Usando do while
        int numeroDoWhile = 0;
        do {
            numeroDoWhile++;
            System.out.println("El número es: " + numeroDoWhile);
        } while (numeroDoWhile < 3);

        // Usando for
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El número es: " + numeroFor);
        }

        // Usando switch
        String estacion = "verano";
        switch (estacion) {
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            default:
                System.out.println("No se reconoce la estación");
                break;
        }
    }

}
