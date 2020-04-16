/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberosdormilones;

/**
 *
 * @author PAOLITA
 */
public class BarberosDormilones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        interfaz inicio = new interfaz();
        inicio.setVisible (true);  
        
        inicio.dormir(1);
        inicio.dormir(2);
        inicio.dormir(3);
    }
    
}
