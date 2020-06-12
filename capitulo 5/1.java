import java.io.*;

  public class ClienteDaytime1 {
    public static void main(String[] args) {
      InputStreamReader is = new InputStreamReader(System.in);
     BufferedReader br = new BufferedReader(is);
      try {
        System.out.println("Bienvenido al cliente Daytime.\n" +
         "¿Cuál es el nombre de la máquina servidora?");
       String nombreMaquina = br.readLine( );
       if (nombreMaquina.length() == 0)
         nombreMaquina = "localhost";
       System.out.println("¿Cuál es el nº de puerto de la máquina servidora?");
        String numPuerto = br.readLine();
        if (numPuerto.length () == 0)
         numPuerto = "13";
       System.out.println("Aquí está la marca de tiempo recibida del servidor"
         + ClienteDaytimeAuxiliar1.obtenerMarcatiempo(nombreMaquina, 
              numPuerto));
     }
      catch (Exception ex) {
       ex.printStackTrace( );
      }
   }
 } 