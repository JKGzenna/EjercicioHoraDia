package ejerciciohoradia;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author JUAN
 */
public class EjercicioHoraDia {

    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Horas: "); // CUANDO PIDAMOS VALORES AL USUARIO DEBEN IR ACOMPAÑADOS POR UN MENSAJE QUE LES DIGA LO QUE TIENEN QUE ESCRIBIR
        int horas = Integer.parseInt(br.readLine());
        System.out.println("Minutos: "); // CUANDO PIDAMOS VALORES AL USUARIO DEBEN IR ACOMPAÑADOS POR UN MENSAJE QUE LES DIGA LO QUE TIENEN QUE ESCRIBIR
        int minutos = Integer.parseInt(br.readLine());
        
        /*
            -- FRANJAS HORARIAS --
        
            00:00 a 07:00 - Madrugada
            07:00 a 12:00 - Mañana
            12:00 a 21:00 - Tarde
            21:00 a 00:00 - Noche
        
            -- HORAS ESPECIALES --
        
            12:00 - Mediodía
            00:00 - Medianoche
        */
        
        if( horas == 12 && minutos == 0 )
            System.out.println("Mediodía");
        else
            if( horas == 0 && minutos == 0 )
                System.out.println("Medianoche");
            else
                if( horas >= 0 && horas <= 7 ) // PARA EL '0' HACE FALTA PONER MAYOR O IGUAL QUE
                    System.out.println("Madrugada");
                else
                    if( horas > 7 && horas <= 12 )
                        System.out.println("Mañana");
                    else
                        if( horas > 12 && horas <= 21 )
                        System.out.println("Tarde");
                        else
                            if( horas > 21 && horas <= 23 ) // PARA EVITAR EL PROBLEMA DEL '0'
                            System.out.println("Noche");
            
        
    }
    
}
