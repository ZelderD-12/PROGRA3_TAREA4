package Modelos;

import java.util.List;
import java.util.ArrayList;

public class ModeloPrimos {
    private List<Integer> numerosprimos;
    private int limite;
    private int numeroevaluando;
    // Constructor
    public ModeloPrimos() {
        this.numerosprimos = new ArrayList<>();  // Inicializamos la lista vacía
    }
    
    //setters
    public void setnumeroprimo(int numero){
        this.numerosprimos.add(numero);
    }
    
    public void setnumerolimite(int numero){
        this.limite = numero;
    }
    
    public void setnumeroevaluando(int numero){
        this.numeroevaluando = numero;
    }
    
    //getters
    
    public int getnumeroprimo(int indice){
        return numerosprimos.get(indice);
    }
    
    public int getnumerolimite(){
        return limite;
    }
    
    public int gettamaniolistaprimos(){
        return numerosprimos.size();
    }
    
    public int getnumeroevaluando(){
        return numeroevaluando;
    }
}
