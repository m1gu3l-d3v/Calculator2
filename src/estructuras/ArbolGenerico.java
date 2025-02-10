/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;
import java.util.*;
/**
 *
 * @author DALGUMA
 */
public class ArbolGenerico {
    private NodoGenArbol raiz;
    public ArbolGenerico(NodoGenArbol raiz){
        this.raiz=raiz;
    }
    public NodoGenArbol getRaiz(){
        return raiz;
    }
    public void recorreProfundidad(NodoGenArbol nodo){
        if(nodo==null) return;
        System.out.println(nodo.getValor()+"");
        for(Object var : nodo.getHijos())
            recorreProfundidad((NodoGenArbol) var);
    }
}
