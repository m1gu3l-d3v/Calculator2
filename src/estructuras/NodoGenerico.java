/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

/**
 *
 * @author DALGUMA
 * @param <Tipo> cualquier tipo pq me pidem parametrear esto ahhhhhhhhhhh
 */
public class NodoGenerico<Tipo> {
  Tipo dato;
  NodoGenerico siguiente;
  NodoGenerico previo;

  public NodoGenerico(Tipo dato) {
    this.dato = dato;
    this.siguiente = null;
    this.previo = null;
  }
}
