package arbol;

public class Nodo {
    private int dato;       // Valor almacenado en el nodo
    private Nodo izq;       // Referencia al hijo izquierdo
    private Nodo der;       // Referencia al hijo derecho

    // Constructor para crear un nodo con un dato específico
    public Nodo(int dato) {
        this.dato = dato;
        this.izq = null;
        this.der = null;
    }

    // Constructor para crear un nodo con un dato y referencias a hijos izquierdo y derecho
    public Nodo(int dato, Nodo izq, Nodo der) {
        this.dato = dato;
        this.izq = izq;
        this.der = der;
    }

    // Método para obtener el dato del nodo
    public int getDato() {
        return dato;
    }

    // Método para establecer el dato del nodo
    public void setDato(int dato) {
        this.dato = dato;
    }

    // Método para obtener el hijo izquierdo
    public Nodo getIzq() {
        return izq;
    }

    // Método para establecer el hijo izquierdo
    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    // Método para obtener el hijo derecho
    public Nodo getDer() {
        return der;
    }

    // Método para establecer el hijo derecho
    public void setDer(Nodo der) {
        this.der = der;
    }

    // Método para verificar si el nodo es una hoja (no tiene hijos)
    public boolean esHoja() {
        return (this.izq == null && this.der == null);
    }

    // Método para verificar si el nodo tiene un hijo izquierdo
    public boolean tieneIzq() {
        return this.izq != null;
    }

    // Método para verificar si el nodo tiene un hijo derecho
    public boolean tieneDer() {
        return this.der != null;
    }

    // Método para obtener la altura del nodo en el árbol
    public int altura() {
        if (this.esHoja()) {
            return 0;
        }
        int alturaIzq = (this.tieneIzq()) ? this.izq.altura() : 0;
        int alturaDer = (this.tieneDer()) ? this.der.altura() : 0;
        return Math.max(alturaIzq, alturaDer) + 1;
    }

    // Método para obtener el número de hijos del nodo
    public int numeroHijos() {
        int count = 0;
        if (this.tieneIzq()) count++;
        if (this.tieneDer()) count++;
        return count;
    }

    // Método para representar el nodo como una cadena de texto
    @Override
    public String toString() {
        return "Nodo{" +
                "dato=" + dato +
                ", izq=" + (izq != null ? izq.getDato() : "null") +
                ", der=" + (der != null ? der.getDato() : "null") +
                '}';
    }
}