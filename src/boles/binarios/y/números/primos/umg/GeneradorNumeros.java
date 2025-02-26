/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    private ModeloPrimos modelo;
    private int cantidadaciertos = 0;
    private JLabel texto;
    private SimuladorArbolBinario simulador;
    final Random r=new Random();
    private JScrollPane spane;
    private JPanel pane;
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
        int indiceFuente = 0;
        int tamanioFuente = 0;
        
        while(!Thread.interrupted() && (modelo.gettamaniolistaprimos() < modelo.getnumerolimite())){
            Thread.sleep(500);
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
            }
            cantidadaciertos = 0;
            System.out.println("" + modelo.getnumeroevaluando());
            modelo.setnumeroevaluando(modelo.getnumeroevaluando()+1);
        }
        simulador.getDibujo(this.spane, this.pane);
        for(int y = 0; y<= modelo.gettamaniolistaprimos()-1;y++){
            System.out.println("" + modelo.getnumeroprimo(y));
            simulador.insertar(modelo.getnumeroprimo(y));
        }
        
        cantidadaciertos = 0;
        }catch(Exception ex){ System.out.println("" + ex);}
    }
}