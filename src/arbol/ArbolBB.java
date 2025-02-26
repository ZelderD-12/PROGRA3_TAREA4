package arbol;

import java.util.LinkedList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ArbolBB {

    private Nodo raiz;

    public ArbolBB() {
        raiz = null;
    }


    // Método para agregar un número al árbol
    public boolean agregar(Integer dato) {
        if (raiz == null) {
            raiz = new Nodo(dato);
            return true;
        } else {
            return agregarRecursivo(raiz, dato);
        }
    }

    // Método recursivo para agregar un número al árbol
    private boolean agregarRecursivo(Nodo nodo, Integer dato) {
        if (dato < nodo.getDato()) {
            if (nodo.getIzq() == null) {
                nodo.setIzq(new Nodo(dato));
                return true;
            } else {
                return agregarRecursivo(nodo.getIzq(), dato);
            }
        } else if (dato > nodo.getDato()) {
            if (nodo.getDer() == null) {
                nodo.setDer(new Nodo(dato));
                return true;
            } else {
                return agregarRecursivo(nodo.getDer(), dato);
            }
        } else {
            // El dato ya existe en el árbol
            return false;
        }
    }

    // Métodos de recorrido (preOrden, inOrden, postOrden)
    public LinkedList preOrden() {
        LinkedList rec = new LinkedList();
        preorden(raiz, rec);
        return rec;
    }

    private void preorden(Nodo aux, LinkedList recorrido) {
        if (aux != null) {
            recorrido.add(aux.getDato());
            preorden(aux.getIzq(), recorrido);
            preorden(aux.getDer(), recorrido);
        }
    }

    public LinkedList inOrden() {
        LinkedList rec = new LinkedList();
        inorden(raiz, rec);
        return rec;
    }

    private void inorden(Nodo aux, LinkedList recorrido) {
        if (aux != null) {
            inorden(aux.getIzq(), recorrido);
            recorrido.add(aux.getDato());
            inorden(aux.getDer(), recorrido);
        }
    }

    public LinkedList postOrden() {
        LinkedList rec = new LinkedList();
        postorden(raiz, rec);
        return rec;
    }

    private void postorden(Nodo aux, LinkedList recorrido) {
        if (aux != null) {
            postorden(aux.getIzq(), recorrido);
            postorden(aux.getDer(), recorrido);
            recorrido.add(aux.getDato());
        }
    }

    // Método para verificar si un dato existe en el árbol
    public boolean existe(int dato) {
        Nodo aux = raiz;
        while (aux != null) {
            if (dato == aux.getDato()) {
                return true;
            } else if (dato > aux.getDato()) {
                aux = aux.getDer();
            } else {
                aux = aux.getIzq();
            }
        }
        return false;
    }

    // Método para obtener el panel de dibujo del árbol
    public ArbolExpresionGrafico getdibujo(JScrollPane scrollPane, JPanel panel) {
        return new ArbolExpresionGrafico(this, scrollPane, panel);
    }

    // Método para repintar el árbol
    public void repintar(JPanel panel) {
        panel.removeAll(); // Limpia el panel
        ArbolExpresionGrafico dibujo = new ArbolExpresionGrafico(this, new JScrollPane(), panel);
        panel.add(dibujo); // Agrega el nuevo dibujo al panel
        panel.revalidate(); // Revalida el panel
        panel.repaint(); // Repinta el panel
    }

    public Nodo getRaiz() {
        return raiz;
    }
    
}