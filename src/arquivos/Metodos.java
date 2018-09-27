package arquivos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Metodos {

    File carpeta = new File("/home/oracle/arquivosdir");
    File archivo = new File("/home/oracle/arquivosdir/", "Products1.txt");
    File subcarpeta = new File("/home/oracle/arquivosdir/subdir");
    File archivo2 = new File("/home/oracle/arquivosdir/subdir", "Products2.txt");

    /**
     * Metodo crear Este metodo sirve para crear una carpeta.
     */
    public void crear() {

        if (!carpeta.exists()) {
            System.out.println("Carpeta creado");
            carpeta.mkdir();
        } else {
            System.out.println("Ya existe la carpeta");
        }

    }

    /**
     * Metodo CrearArchivo Metodo para crear un archivo.
     */
    public void crearArquivo() {
        if (carpeta.exists()) {
            try {
                if (!archivo.exists()) {
                    System.out.println("Archivo creado");
                    archivo.createNewFile();
                } else {
                    System.out.println("Ya existe el archivo");
                }

            } catch (IOException ex) {
                Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Carpeta donde crear el archivo no existe");
        }
    }

    /**
     * Metodo Comprobar Este metodo comprueba que tanto la carpeta como el
     * archivo existen.
     */
    public void comprobar() {
        if (carpeta.exists()) {
            System.out.println("La carpeta existe");
            System.out.println("Ruta de la carpeta " + carpeta.getPath());
        } else {
            System.out.println("La carpeta no existe");
        }
        if (archivo.exists()) {
            System.out.println("El archivo existe");
            System.out.println("Ruta del archivo " + archivo.getPath());

        } else {
            System.out.println("El archivo no existe");
        }
    }

    /**
     * Metodo subdir Metodo que crea la carpeta subdir dentro de arquivosdir
     */
    public void subdir() {
        if (carpeta.exists()) {
            if (!subcarpeta.exists()) {
                System.out.println("Carpeta creada");
                subcarpeta.mkdir();
                if (!archivo2.exists()) {
                    try {
                        System.out.println("Archivo crreado");
                        archivo2.createNewFile();
                    } catch (IOException ex) {
                        Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {
                    System.out.println("Ya existe el archivo");
                }

            } else {
                System.out.println("Ya existe la carpeta");
            }
        } else {
            System.out.println("La carpeta arquivosdir no existe");
        }

    }

    /**
     * Metodo amosar Este metodo muestra lo que contiene la carpeta arquivosdir
     */
    public void amosar() {
        if (carpeta.exists()) {
            System.out.println(Arrays.toString(carpeta.list()));
        } else {
            System.out.println("No existe la carpeta Arquivosdir");
        }

    }

    /**
     * Metodo rutaArquivosdir Este metodo enseña la ruta de arquivosdir
     */
    public void rutaAquivosdir() {
        if (carpeta.exists()) {
            System.out.println(carpeta.getAbsolutePath());
        } else {
            System.out.println("No existe la carpeta");
        }
    }

    /**
     * Metodo datosArquivo1 Este metodo muestra datos de products1.txt
     */
    public void datosArquivo1() {
        if(archivo.exists()){
        System.out.println("Nombre : " + archivo.getName());
        System.out.println("Ruta : " + archivo.getPath());
        System.out.println("Es posible leer : " + archivo.canRead());
        System.out.println("Es posible escribir : " + archivo.canWrite());
        System.out.println("Tamaño : " + archivo.getTotalSpace());}
        else System.out.println("No existe el archivo");

    }

    /**
     * Metodo lecturaNo Este metodo pone el archivo en modo lectura.
     */
    public void lecturaNo() {
        if(archivo.exists()){
        archivo.setReadOnly();
            System.out.println("Ya no se puede escribir");}
        else System.out.println("No existe el archivo");
    }

    /**
     * Metodo lecturaSi Este metodo hace que se pueda escribir en el archivo.
     */
    public void lecturaSi() {
        if(archivo.exists()){
        archivo.setWritable(true);
            System.out.println("Se puede escribir");}
        else System.out.println("El archivo no existe");
    }

    /**
     * Metodo borrar Este metodo sirve para borrar el archivo products1.txt
     */
    public void borrar() {
        if(archivo.exists()){
        archivo.delete();
            System.out.println("Archivo borrado");}
        else System.out.println("El archivo no existe");
    }

    /**
     * Metodo borrarTodo Este metodo borra todos lo creado.
     */
    public void borrarTodo() {
        if(carpeta.exists()){
           String[] contenido = carpeta.list();
            for (int i = 0; i < contenido.length; i++) {
                File fil=new File(carpeta.getPath()+"/"+contenido[i]);
                System.out.println(contenido[i]);
                fil.delete();
                if(fil.isDirectory()){
                        File fil1=new File(fil.getAbsolutePath());
                        System.out.println(fil1.toString());
                        String[]contenido2=fil1.list();
                        for (int j = 0; j < contenido2.length; j++) {
                            File fil2=new File(fil1.getPath()+"/"+contenido2[j]);
                            fil2.delete();
                            fil1.delete();
                            carpeta.delete();
                    }
                    }else {fil.delete();carpeta.delete();}
                }
        System.out.println("Borrado de todo");}
        else System.out.println("No existe la carpeta");
    }
}


