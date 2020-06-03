/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

/**
 *
 * @author danta
 */
public class Lista1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Telefone t1 = new Telefone();
        TelefoneFixo tf1 = new TelefoneFixo();
        Celular c1 = new Celular();
        Smartphone s1 = new Smartphone();
        t1.numero = 111;
        tf1.numero = 222;
        c1.numero = 333;
        System.out.println("numero do telefone generico:" + t1.numero);
        System.out.println("numero do telefone fixo:" + tf1.numero);
        System.out.println("numero do celular:" + c1.numero);
        System.out.println("numero do smartphone:" + s1.numero);
        
    }
    
}
