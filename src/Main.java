import java.util.LinkedList;
import java.util.List;

//FIRST IN FIRST OUT
public class Main {
    public static void main(String[] args) {

        //Guardar distintos objetos de tipo persona en el ArrayList
        //Arreglo (lista) de objetos
                                  //Solo cambia el nombre al crearlo
                                    //Se importa sola la libreria que contiene la clase LinkedList
        List<Persona> lista = new LinkedList<Persona>();

        //Agregar Personas (elementos) al final de la lista
        lista.add(new Persona(1, "Jesu", 26));
        lista.add(new Persona(2, "orlando", 30));
        lista.add(new Persona(3, "Jose", 55));
        lista.add(new Persona(4, "Maria", 53));
        lista.add(new Persona(5, "Luis", 78));

        //Se puede agregar un elemento al inicio de la lista
                    //En la posicion 0 del indice se agregara este elemento (objeto) Persona
        lista.add(0,new Persona(6, "Javier",50));

        //REcorrer por indice (for simple)
        //tamaño = size
        //indice inicia en 0

        /*
        System.out.println("-------FOR--------");
        for (int i = 0; i < lista.size(); i++){
            //posicion de la persona
            //obtiene el nombre de la persona en la posicion en la que esta
            System.out.println("prueba: " + lista.get(i).getNum() + lista.get(i).getNombre() + lista.get(i).getEdad());
            //System.out.println("-------");
            //System.out.println(lista.get(i));

        }
        */

        System.out.println("-------FOREACH--------");
        //Recorrer por foreach (foreach = por cada (uno))
        //Por cada Persona creada "persona" dentro de la lista
        for (Persona persona: lista){
            System.out.println("prueba: " + persona.getNombre());
        }


    }
}

/*
COLECCIONES:

        -Son estructuras similares a los arreglos pero su principal característica es que son dinámicos,
         su tamaño y cantidad de elementos puede variar en el tiempo.
        -En java, se emplean mediante la INTERFAZ "Collections", que permite implementar una serie de métodos comunes
         como son: AÑADIR, ELIMINAR, OBTENER EL TAMAÑO DE LA COLECCIÓN, etc.
        -Tienen el tamaño que se quiera y la capacidad de manera dinamica ajustandose a lo que se requiera.

        Tipos principales de Collections:
            -LIST           De los mas utilizados
            -SET
            -QUEUE
            -MAP            De los mas utilizados


        *ARRAYLIST:
            -Las lista son un conjunto de elementos relacionados entre si que tienen un determinado orden.
            -Su tamaño es dinámico (puede cambiar en el tiempo).

            *CARACTERISTICAS:

                >Es un tipo de CLASE ESPECIAL que se representa como una matriz dinámica qu e permite almacenar elementos.
                >Hereda de la clase AbstractList, la cual implementa la Interfaz List.
                >Permite colecciones o elementos duplicados.
                >El orden de los registros es el orden que fueron insertados.
                >Permite acceso aleatorio (tiene índice)
                >Manipulacion lenta (se necesita recorrer todo el arraylist para hacer un cambio).
                >Solo se pueden agregar (inserción) elementos a la lista

            -En java existen diferentes tipos de listas:
                +ArrayList  (FIFO)
                +LinkedList (FIFO)
                +Stack      (LIFO)

            Tipo de orden que pueden tener las listas:
                -FIFO: First in First Out (El primero en entrar es el primero en salir)
                -LIFO: Last in First Out (El ultimo que entro va a ser el primero en salir)


        *LINKEDLIST: (Lista Enlazada)

            -Tipo de CLASE ESPECIAL
            -Representan a una LISTA DOBLEMEMTE ENLAZADA (forma de recorrerlo de ida y vuelta, ambas direcciones)
            -Permite duplicados
            -Mantiene el orden de inserción
            -Manipulación más rápida
            -Puede ser usada/tratada no solo como lista, sino también como PILA, o como COLA
            -Permite hacer INSERCIONES o ELIMINACIONES al principio o al final de la colección
             (por eso es que puede ser tratado como una pila o cola), ejemplo agregar al inicio con el INDICE[0]
                >Podemos agregar registros al principio y al final

                [0]    [1]<---[2]<---[3]
                [0]--->[1]--->[2]--->[3]


        *Diferencias entre ARRAYLIIST y LINKEDLIST:


        Linked List:

       null <---[0]    [1]<---[2]<---[3]
                [0]--->[1]--->[2]--->[3]--->null
                head                tail



        Array = vector

        [0]--->[1]--->[2]--->[3]--->[4]

        Los arraylist si tienen una posicion como los vectores, solo se agregan al final
        En cambio las linkedlist no ya que se puede agregar otro elemento en cualquier lugar

        Para borrar un elemento en el arraylist se debe indicar la posicion [2] mediante el metodo remove,
        luego reacomoda los demas valores para ocupar esa posicion vacia.
        En cambio en la linkedlist se elimina el elemento y se reacomodan los punteros que señalan los elementos




 */