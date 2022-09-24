public class Main {
    public static void main(String[] args) {
        System.out.println("Precio total es: " + addIva(400, 16));
    }

    /*addIva función en la cual se añade el precio y el porcentaje del iva*/
    static Double addIva(double precio, double porceIva) {
        double result = precio * (porceIva / 100);
        return precio + result;
    }
}
