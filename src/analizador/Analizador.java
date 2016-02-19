/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David
 */
public class Analizador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variables que cuantan lineas, palabras y letras
        int contadorLetras = 0;
        int contadorLineas = 0;
        int contadorPalabras = 0;
        try {
            // TODO code application logic here

            //Recojo el proceso
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in,"Windows-1252"));
            
            try {
                String linea=br.readLine();
                
                while(linea!=null){
                    
                    contadorLineas++;
                
                    //Creo un StringTokenizer para primero contabilizar las palabras separadas
            StringTokenizer st = new StringTokenizer(linea);
            
            //Creo la variable para guardar el número de palabras
            contadorPalabras += st.countTokens();
            
            //Ahora meto en la variable linea el contenido del StringBuilder para trabajar mejor 
           
            for(int i = 0; i<linea.length();i++){
                
                //Abro un bucle para contar las letras
            if(Character.isLetter(linea.charAt(i))){
            contadorLetras++;
            }}
            
           
            
            System.out.println(" Número de letras: "+contadorLetras+" Número de Lineas: "+contadorLineas+"  Número de palabras: "+contadorPalabras);
            
                linea= br.readLine();
                }
                
            } catch (IOException ex) {
                Logger.getLogger(Analizador.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Analizador.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
}
