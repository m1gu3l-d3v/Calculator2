/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.lineales;

/**
 *
 * @author mike
 */
public class Pila<T> {
  private Nodo<T> cima;

  /**
   * Constructor para inicializar una pila vacía.
   */
  public Pila() {
    cima = null;
  }

  /**
   * Método para apilar un elemento en la cima de la pila.
   * 
   * @param dato El elemento a apilar.
   */
  public void apilar(T dato) {
    Nodo<T> nuevoNodo = new Nodo<>(dato);
    nuevoNodo.siguiente = cima;
    cima = nuevoNodo;
  }

  /**
   * Método para desapilar un elemento de la pila.
   * 
   * @return El elemento desapilado.
   * @throws IllegalStateException si la pila está vacía.
   */
  public T despilar() {
    if (cima == null)
      throw new IllegalStateException("¡Pila vacía!");
    T dato = cima.dato;
    cima = cima.siguiente;
    return dato;
  }

  /**
   * Método para mirar el elemento en la cima de la pila sin eliminarlo.
   * 
   * @return El elemento en la cima de la pila.
   * @throws IllegalStateException si la pila está vacía.
   */
  public T mirar() {
    if (cima == null)
      throw new IllegalStateException("¡Pila vacía!");
    return cima.dato;
  }

  /**
   * Método para verificar si la pila está vacía.
   * 
   * @return true si la pila está vacía, false en caso contrario.
   */
  public boolean estaVacia() {
    return cima == null;
  }
}

/**
 * Clase interna que representa un nodo en la estructura de lista enlazada.
 * 
 * @param <T> Tipo de dato almacenado en el nodo.
 */
class Nodo<T> {
  T dato;
  Nodo<T> siguiente;

  /**
   * Constructor para inicializar un nodo con un dato.
   * 
   * @param dato El dato a almacenar en el nodo.
   */
  public Nodo(T dato) {
    this.dato = dato;
    this.siguiente = null;
  }
}