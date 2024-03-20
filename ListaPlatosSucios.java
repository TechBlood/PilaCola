/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lista;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author jcasb
 */
public class ListaPlatosSucios {

    public static void main(String[] args) {
       //Crear una pola nueva para almacenar los platos sucios (Datos)
        Stack<String> pilaPlatos = new Stack<>();
                
        //Crear un objeto para Scanner pueda leer la entrada de usuario
        Scanner scanner = new Scanner(System.in);
        
        //Variable para controlar la salida del bucle
        boolean salir = false;
        
        //Iniciamos el cicel while, se ejecuta mientras salir sea falso
        while (!false){
            System.out.println("1.Agregar un plato sucio a la pila");
            System.out.println("2.lavar el plato superior");
            System.out.println("3.Ver el plato superior de la pila");
            System.out.println("4.Verificar si la pila esta vacia");
            System.out.println("5.Buscar un plato en la pila");
            System.out.println("6.Salir");
            //Solicitar al usuario que ingrese una opcion
            System.out.println("Ingrese una opcion:");
            //Leer la opcion ingresada por el usuario
            int opcion = scanner.nextInt();
            //Consumir el salto de linea despues de leer 
            scanner.nextLine();
            
            //Inicio del bloque del switch 
            switch(opcion){
            case 1:
                //Solicitar al usuario que ingrese el plato
                //Leer el 
                System.out.println("Ingrese el plato a la pila:");
                //leer el plato ingresado
                String plato = scanner.nextLine();
                //Agregar el plato a la pila utilizando push()
                pilaPlatos.push(plato);
                //Mostrar mensaje indicando que fue ingresado
                System.out.println("Plato sgregado a la pila.");
                break;
            case 2:
                //Verificar si la pila no esta vacia
                if(!pilaPlatos.isEmpty()){
                    //LImpiar el plato superior = eliminarlo con pop()
                    String platoLimpio = pilaPlatos.pop();
                    System.out.println("Se lavo el plato superior:" + platoLimpio );
                    
                }else{
                    //Indicar que la pila esta vacia
                    System.out.println("La pila esta vacia. No se puede lavar ningun plato");
                }
                    break;
            case 3:
                //Verificar si la pila no esta vacia
                if(!pilaPlatos.isEmpty()){
                    String platoSuperior = pilaPlatos.peek();
                    System.out.println("El plato superior de la pila es::" + platoSuperior );
                    
                }else{
                    //Indicar que la pila esta vacia
                    System.out.println("No se puede mostrar un plato");
                }
                    break;
            case 4:
                //Verificar si la pila esta vacia
                boolean estaVacia = pilaPlatos.isEmpty();
                System.out.println("La pila de los platos esta vacia:" + estaVacia);
                    break;
            case 5:
                //Solicitar al usuario que ingrese el plato a buscar en la pilla
                System.out.println("Ingrese el plato que desea buscar:");
                //Leer el plato a buscar por el usuario
                String platoBuscar = scanner.nextLine();
                //Buscar el plato en la pila utilizando search()
                int distanciaDesdeSuperior = pilaPlatos.search(platoBuscar);
                //Verificar si el plato se encuentra en la pila
                if(distanciaDesdeSuperior != -1){
                    //Mostrar mensaje
                    System.out.println("El plato '" + platoBuscar + "'se encuentra a una distancia" + distanciaDesdeSuperior + "desde la parte superior de la pila.");
                }else{
                    System.out.println("El plato '" + platoBuscar + "'se encuentra a una distancia" + distanciaDesdeSuperior + "no se encuantra en la pila.");
                }
                    break;
            case 6:
                salir = true;
                    break;
            default:
                System.out.println("Opcion invalida, intente nuevamente");
                    break;
            }
            System.out.println("Hasta luego");
        }
        
    }

}
