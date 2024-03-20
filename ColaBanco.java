/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cola;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author jcasb
 */
public class ColaBanco {

    public static void main(String[] args) {
        //Crear una nueva cola utilizando la clase LinkedList de java
        Queue<String> colaAtencion = new LinkedList<>();
        //Crear un objeto Scanner para leer la entrada de usuario
        Scanner scanner = new Scanner(System.in);
        //Varuable para controlar la salida del bucle
        boolean salir = false;
        
        while (!salir){//Inicio del bucle qhile, se ejecuta mientras salir sea falso
            //Mostrar opcion para agregar un cliente a la cola de atencion
            System.out.println("1. Agregar cliente a la cola de atención");
            //Mostrar opcion para atender el proximo cliente de la cola
            System.out.println("2. Atender el proximo cliente de la cola");
            //Mostrar opcion para ver al proximo cliente de la cola sin atenderlo
            System.out.println("3. ver el proximo cliente de la cola");
            //Mostrar opcion para verificar si la cola de atencion esta vacia
            System.out.println("4. Verificar si la cola de atención esta vacia");
            //Mostrar opcion para salir del programa
            System.out.println("5. Salir");
            //Solicite al usuario que ingrese una opcion
            System.out.println("Ingrese una opción");
            //Leer la opcion ingresada por el usuario
            int opcion = scanner.nextInt();
            //Consumir el salto de linea despues de leer la opcion
            scanner.nextLine();
            
            switch (opcion){//Inicio del bloque switch, se evalua al valor de la variable opcion
                case 1:
                    //Solicitar al usuario que ingrese al nombre del cliente a agregar a la cola
                    System.out.println("Ingrese el nombre del cliente a agregar a la cola");
                    //Leer el nombre del cliente ingresado por el usuario
                    String cliente = scanner.nextLine();
                    //Agregar el cliente a la cola utilizando el metodo add()
                    colaAtencion.add(cliente);
                    //Mostrar un mensaje indicando que el cleinte ha sido agregado a la cola
                    System.out.println("Cliente agregado a la cola de atención");
                    break;//Salir del bloque Switch
                    
                case 2:
                    if (!colaAtencion.isEmpty()){//Verificar si la cola de atencion esta vacia
                        //Atender el proximo cliente de la cola utilizando el metodo poll()
                        String clienteAtendido = colaAtencion.poll();
                        //Mostrar el nombre del cliente que ha sido atendido
                        System.out.println("Cliente atendido: " + clienteAtendido);
                    }else{
                        //Mostrar un mensaje indicado que la cola de atencion esta vacia
                        System.out.println("La cola de atencion esta vacia. No hayclientes que atender");
                        
                    }
                    break;//Salir del bolque switch
                    
                case 3:
                    if (!colaAtencion.isEmpty()){//Verificar si la cola de atencion no esta vacia
                        //Obtener el proximo cliente de la cola sin atenderlo utilizando el metodo peek()
                        String proximoCliente = colaAtencion.peek();
                        //Mostrar el nombre del proximo cliente en la cola
                        System.out.println("Proximo cliente en la cola: "+ proximoCliente);
                    }else{
                        //Mostrar un mensaje indicando que la cola de atencion esta vacia
                        System.out.println("La cola de atencion esta vacia: ");
                    }
                    break;//Salir del bloque switch
                    
                case 4:
                    //Verificar si la cola de atencion esta vacia utilizando el metodo isEmpty()
                    boolean estaVacia = colaAtencion.isEmpty();
                    //Mostrar si la cola de atencion esta vacia o no
                    System.out.println("La cola de atencion esta vacia: "+ estaVacia);
                    break;//Salir del bloque switch
                    
                case 5:
                    salir = true;//Establecer la variable salir a true para salir del bucle while
                    break;//Salir del pbloque switch
                    
                default:
                    //Mostrar un mensaje indicando que la opcion ingresada es invalida
                    System.out.println("Opcion invalida. Intente nuevamente.");
                    break;//Salir del bloque switch
            }
            System.out.println();//Imprimir una linea en blanco para separar las iteraciones del bucle while
        }
        //Mostrar un mensaje de despedida al salir del programa
        System.out.println("Hasta luego");
    }
}
