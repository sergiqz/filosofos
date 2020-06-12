import java.io.*;
import java.util.Date; // para obtener una marca de tiempo

  public class ServidorDaytime1 {
    public static void main(String[] args) {
      int puertoServidor = 13; // puerto por defecto
      if (args.length == 1 )
        puertoServidor = Integer.parseInt(args[0]);
      try {
        // instancia un socket datagrama para tanto mandar como
        // recibir datos
        MiSocketDatagramaServidor miSocket =
            new MiSocketDatagramaServidor(puertoServidor);
        System.out.println("El servidor Daytime está listo.");
        while (true) { // bucle infinito
          MensajeDatagrama peticion =
              miSocket.recibeMensajeYEmisor();
          System.out.println("Petición recibida");
          // no es importante el mensaje recibido; es la dirección
          // del emisor lo que se necesita para responder..
          // Ahora obtiene una marca de tiempo del sistema.
          Date marcaTiempo = new Date ( );
          System.out.println("marca de tiempo enviada:" +
              marcaTiempo.toString());
          // Ahora manda la respuesta al solicitante.
          miSocket.enviaMensaje(peticion.obtieneDireccion( ),
            peticion.obtienePuerto( ), marcaTiempo.toString( ));
        } // fin de while
      } // fin de try
      catch (Exception ex) {
        ex.printStackTrace( );
      } // fin de catch
    } // fin de main
  } // fin de class