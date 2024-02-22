package co.vinni.soapproyectobase.utilidades;

import java.util.Scanner;

/**
 * @Author:  Vinni
 */
public class UtilidadConsola {
    public static String leer(String mensaje){
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        return sc.nextLine();
    }
}
