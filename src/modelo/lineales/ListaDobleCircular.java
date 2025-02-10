/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.lineales;

/**
 * 
 * @author mike
 */
public class ListaDobleCircular<T> {
  private Nodo<T> cabeza, cola;

  /**
   * Constructor para inicializar la lista vacía.
   */
  public ListaDobleCircular() {
    cabeza = null;
    cola = null;
  }

  /**
   * Inserta un elemento al final de la lista.
   * 
   * @param dato Elemento a insertar.
   */
  public void insertar(T dato) {
    Nodo<T> nuevoNodo = new Nodo<>(dato);
    if (cabeza == null) {
      // Si la lista está vacía, el nuevo nodo apunta a sí mismo
      cabeza = cola = nuevoNodo;
      cabeza.siguiente = cabeza.anterior = cabeza;
    } else {
      // Conectamos el nuevo nodo con la cola
      cola.siguiente = nuevoNodo;
      nuevoNodo.anterior = cola;
      nuevoNodo.siguiente = cabeza; // Apunta a la cabeza para hacerla circular
      cabeza.anterior = nuevoNodo; // La cabeza debe apuntar al nuevo nodo
      cola = nuevoNodo; // Actualizamos la cola
    }
  }

  /**
   * Busca un elemento en la lista.
   * 
   * @param dato Elemento a buscar.
   * @return true si el elemento está en la lista, false si no.
   */
  public boolean buscar(T dato) {
    if (cabeza == null)
      return false;
    Nodo<T> actual = cabeza;
    do {
      if (actual.dato.equals(dato))
        return true;
      actual = actual.siguiente;
    } while (actual != cabeza);
    return false;
  }

  /**
   * Elimina un elemento de la lista.
   * 
   * @param dato Elemento a eliminar.
   */
  public void eliminar(T dato) {
    if (cabeza == null) {
      System.out.println("Lista vacía, no se puede eliminar.");
      return;
    }

    Nodo<T> actual = cabeza;
    do {
      if (actual.dato.equals(dato)) {
        // Caso 1: Es el único nodo en la lista
        if (actual == cabeza && actual == cola) {
          cabeza = cola = null;
        }
        // Caso 2: Es la cabeza
        else if (actual == cabeza) {
          cabeza = cabeza.siguiente;
          cabeza.anterior = cola;
          cola.siguiente = cabeza;
        }
        // Caso 3: Es la cola
        else if (actual == cola) {
          cola = cola.anterior;
          cola.siguiente = cabeza;
          cabeza.anterior = cola;
        }
        // Caso 4: Nodo intermedio
        else {
          actual.anterior.siguiente = actual.siguiente;
          actual.siguiente.anterior = actual.anterior;
        }
        return;
      }
      actual = actual.siguiente;
    } while (actual != cabeza);

    System.out.println("Elemento no encontrado.");
  }

  /**
   * Imprime la lista en orden desde la cabeza hasta la cola.
   */
  public void imprimir() {
    if (cabeza == null) {
      System.out.println("Lista vacía");
      return;
    }
    Nodo<T> actual = cabeza;
    do {
      System.out.print(actual.dato + " <-> ");
      actual = actual.siguiente;
    } while (actual != cabeza);
    System.out.println("(circular)");
  }
}

/**
 * Clase interna para los nodos de la lista circular doblemente enlazada.
 * 
 * @param <T> Tipo de dato del nodo.
 */
class Nodo<T> {
  T dato;
  Nodo<T> siguiente, anterior;

  public Nodo(T dato) {
    this.dato = dato;
    this.siguiente = null;
    this.anterior = null;
  }
}