package boles.binarios.y.números.primos.umg;

import Modelos.ModeloPrimos;
import arbol.SimuladorArbolBinario;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class GeneradorNumeros extends Thread{
    final ModeloPrimos modelo;
    private int cantidadaciertos = 0;
    final JLabel texto;
    final SimuladorArbolBinario simulador;
    final Random r=new Random();
    final JScrollPane spane;
    final JPanel pane;
    public GeneradorNumeros(ModeloPrimos modelo, JLabel texto, JScrollPane spane, JPanel pane){
        simulador = new SimuladorArbolBinario();
        this.modelo = modelo;
        this.texto = texto;
        this.pane = pane;
        this.spane = spane;
    }
    
    @Override
    public void run(){
       try{
        //variables para cambiar fuentes
        Font[] fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();
        int indiceFuente;
        int tamanioFuente;
        
        while(!Thread.interrupted() && (modelo.gettamaniolistaprimos() < modelo.getnumerolimite())){
            Thread.sleep(400);
            indiceFuente = r.nextInt(fuentes.length);
                tamanioFuente = (int) Math.round(Math.random() * (90 - 20 + 1) + 20);
                Font fuente = new Font(fuentes[indiceFuente].getFontName(), Font.PLAIN, tamanioFuente);
            
            this.texto.setFont(fuente);
                this.texto.setText(""+modelo.getnumeroevaluando());
                
                
                Color c = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
                
                this.texto.setForeground(c);
            
            if (Thread.interrupted()) {
                break;
            }
            
            for(int contadorsecundario = 1; contadorsecundario<=modelo.getnumeroevaluando(); contadorsecundario++){
                int residuo = modelo.getnumeroevaluando()%contadorsecundario;
                if(residuo == 0){
                    cantidadaciertos++;
                }
                
                if(cantidadaciertos>=3){
                    break;
                }
            }
            
            if(cantidadaciertos==2){
                modelo.setnumeroprimo(modelo.getnumeroevaluando());
                
                simulador.getDibujo(this.spane, this.pane);
                simulador.insertar(modelo.getnumeroevaluando());
            }
            cantidadaciertos = 0;
            modelo.setnumeroevaluando(modelo.getnumeroevaluando()+1);
        }
        
        cantidadaciertos = 0;
        }catch(InterruptedException ex){ System.out.println("" + ex);}
    }
}