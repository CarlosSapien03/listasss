import java.util.Scanner;
public class practicaconlistas {
    public static void main(String[] args) {
        archivo lector = new archivo();
        String texto = lector.leerTXT("AQUÍ TIENES QUE PONER LA RUTA DE TU TXT QUE DESCARGASTE C:\\Users\\52662\\Downloads\\divina_comedia.txt");
        String [] lista = texto.split(" ");
        System.out.println("introduzca su palabra");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        int veces = 0;
        for(int i = 0; i < lista.length; i++){
            if(str1.equals(lista[i])){
                veces = veces + 1;
            }
        }
        System.out.println("la palabra que ingresó se repite " + veces + " veces");
    }
}

public class Practicaconlistas {
    public static void main(String[] args) {
        archivo lector = new archivo();
        String texto = lector.leerTXT("AQUÍ TIENES QUE PONER LA RUTA DE TU TXT QUE DESCARGASTE C:\\Users\\52662\\Downloads\\divina_comedia.txt ");
        String [] lista = texto.split(" ");
        System.out.println("introduzca su palabra");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        int veces = 0;
        for(int i = 0; i < lista.length; i++){
            if(str1.equals(lista[i])){
                veces = veces + 1;
            }
        }
        System.out.println("la palabra que ingresó se repite " + veces + " veces");
    }
}
