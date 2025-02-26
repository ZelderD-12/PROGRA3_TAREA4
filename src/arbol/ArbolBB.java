package arbol;

import java.util.LinkedList;
import javax.swing.*;

public class ArbolBB {

    private Nodo raiz;
    int num_nodos;
    int alt;

    public ArbolBB() {
        raiz = null;
    }

    public boolean agregar(int dato) {
        Nodo nuevo = new Nodo(dato, null, null);
        raiz = insertar(nuevo, raiz);
        return true;
    }

    // Método para insertar un dato en el árbol (no acepta repetidos)
    private Nodo insertar(Nodo nuevo, Nodo pivote) {
        if (pivote == null) {
            return nuevo;
        } else {
            if (nuevo.getDato() <= pivote.getDato()) {
                pivote.setIzq(insertar(nuevo, pivote.getIzq()));
            } else {
                pivote.setDer(insertar(nuevo, pivote.getDer()));
            }
        }
        return balancear(pivote);
    }

    // Método para balancear el árbol
    private Nodo balancear(Nodo nodo) {
        int balance = obtenerBalance(nodo);

        // Rotación simple a la derecha
        if (balance > 1 && obtenerBalance(nodo.getIzq()) >= 0) {
            return rotarDerecha(nodo);
        }

        // Rotación simple a la izquierda
        if (balance < -1 && obtenerBalance(nodo.getDer()) <= 0) {
            return rotarIzquierda(nodo);
        }

        // Rotación doble izquierda-derecha
        if (balance > 1 && obtenerBalance(nodo.getIzq()) < 0) {
            nodo.setIzq(rotarIzquierda(nodo.getIzq()));
            return rotarDerecha(nodo);
        }

        // Rotación doble derecha-izquierda
        if (balance < -1 && obtenerBalance(nodo.getDer()) > 0) {
            nodo.setDer(rotarDerecha(nodo.getDer()));
            return rotarIzquierda(nodo);
        }

        return nodo;
    }

    // Método para obtener la altura de un nodo
    private int altura(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        return Math.max(altura(nodo.getIzq()), altura(nodo.getDer())) + 1;
    }

    // Método para obtener el balance de un nodo
    private int obtenerBalance(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        return altura(nodo.getIzq()) - altura(nodo.getDer());
    }

    // Rotación simple a la derecha
    private Nodo rotarDerecha(Nodo y) {
        Nodo x = y.getIzq();
        Nodo T2 = x.getDer();

        x.setDer(y);
        y.setIzq(T2);

        return x;
    }

    // Rotación simple a la izquierda
    private Nodo rotarIzquierda(Nodo x) {
        Nodo y = x.getDer();
        Nodo T2 = y.getIzq();

        y.setIzq(x);
        x.setDer(T2);

        return y;
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

    // Método para verificar si un nodo existe en el árbol
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

    // Método para calcular la altura del árbol
    private void altura(Nodo aux, int nivel) {
        if (aux != null) {
            altura(aux.getIzq(), nivel + 1);
            alt = nivel;
            altura(aux.getDer(), nivel + 1);
        }
    }

    // Devuelve la altura del árbol
    public int getAltura() {
        altura(raiz, 1);
        return alt;
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