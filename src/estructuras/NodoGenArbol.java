/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import java.util.*;

/**
 *
 * @author DALGUMA
 * @param <Tipo> cualquier tipo pq me pidem parametrear esto ahhhhhhhhhhh
 */
public class NodoGenArbol<Tipo> {
    private Tipo valor;
    private List<NodoGenArbol> hijos;
    public NodoGenArbol (Tipo valor){
        this.valor = valor;
        this.hijos = new Arraylist<Tipo>();
    }
    public Tipo getValor(){
        return valor;
    }
    public List<NodoGenArbol> getHijos(){
        return hijos;
    }
    public void agregarHijo( NodoGenerico hijo){
        hijos.add(hijo);
    }
}