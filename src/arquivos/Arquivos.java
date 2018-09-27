package arquivos;

import javax.swing.JOptionPane;

/**
 *
 * @author oracle
 */
public class Arquivos {

    public static void main(String[] args) {
        Metodos met = new Metodos();
//        met.crear();
//        met.crearArquivo();
//        met.comprobar();
//        met.subdir();
//        met.amosar();
//        met.rutaAquivosdir();
//        met.datosArquivo1();
//        met.lecturaNo();
//        met.lecturaSi();
//        met.borrar();
//        met.borrarTodo();
        int numero;
//
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Pulsa 1 para crear la carpeta arquivosdir"
                    + "\nPulsa 2 para crear archivo Products1.txt"
                    + "\nPulsa 3 para comprobar carpeta arquivosdir y Products1.txt"
                    + "\nPulsa 4 para crear la subcarpeta subdir y el archivo Products2.txt"
                    + "\nPulsa 5 para ver que hay en la carpeta arquivosdir"
                    + "\nPulsa 6 para ver la ruta de arquivosdir"
                    + "\nPulsa 7 para ver los datos de Products1.txt"
                    + "\nPulsa 8 para que no se pueda escribir en el archivo Products1.txt"
                    + "\nPulsa 9 para que se pueda escribir en el archivo Products1.txt"
                    + "\nPulsa 10 para borrar Products1.txt"
                    + "\nPulsa 11 para borrar todo"));
            switch (numero) {
                case 1:
                    met.crear();
                    break;
                case 2:
                    met.crearArquivo();
                    break;
                case 3:
                    met.comprobar();
                    break;
                case 4:
                    met.subdir();
                    break;
                case 5:met.amosar();
                    break;
                case 6:met.rutaAquivosdir();
                    break;
                case 7:met.datosArquivo1();
                    break;
                case 8:met.lecturaNo();
                    break;
                case 9:met.lecturaSi();
                    break;
                case 10:met.borrar();
                    break;
                case 11:met.borrarTodo();
                    break;
        
                default:
                    System.out.println("No existe esa opcion");
                    break;
            }
        } while (numero != 0);

    }

}
