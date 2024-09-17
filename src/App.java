import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int [] horas = new int[30];
        for(int i = 0; i < horas.length; i++){
            horas[i] = (int) (Math.random()*9); 
        }
        System.out.println("Dia inicial:");
        mostrar(horas);

        System.out.print("Ingresar la cantidad de dias que desea simular: ");
        int nDias = scan.nextInt();

        for(int i = 0; i < nDias; i++){
            desplazarHoras(horas);
            System.out.println("Arreglo despues de "+(i+1)+" dia: ");
            mostrar(horas);
        }
    }

    public static void mostrar(int[] arreglo){
        for(int val:arreglo){
            System.out.print(val+" ");
        }
        System.out.println();
    }

    public static void desplazarHoras(int [] horas){
        for(int i = 0; i < horas.length - 1; i++){
            horas[i] = horas[i+1];
        }
        horas[horas.length-1] = (int) (Math.random()*9);
    }


}
