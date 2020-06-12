import java.net.*;
public class ClienteDaytimeAuxiliar1 {

public static String obtenerMarcatiempo(String nombreMaquina,
      String numPuerto) {

     String marcaTiempo = "";
      try {
       InetAddress serverHost = InetAddress.getByName(nombreMaquina);
        int serverPort = Integer.parseInt(numPuerto);
        // instancia un socket datagrama para tanto los datos de
       // emisión como los de recepción
        MiSocketDatagramaCliente miSocket = new MiSocketDatagramaCliente();
        miSocket.enviaMensaje( serverHost, serverPort, "");
        // ahora recibe la marca de tiempo
       marcaTiempo = miSocket.recibeMensaje();
        miSocket.close( );

      } // fin de  try
     catch (Exception ex) {
        ex.printStackTrace( );
      } // fin de catch
     return marcaTiempo;
    } //fin de main
 } // fin de class