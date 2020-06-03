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
public class TelefoneFixo extends Telefone{
    protected boolean comFio;
    protected int voltagem;

    public boolean isComFio() {
        return comFio;
    }

    public void setComFio(boolean comFio) {
        this.comFio = comFio;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
    
}
