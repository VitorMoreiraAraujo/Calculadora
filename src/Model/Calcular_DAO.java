
package Model;

import javax.swing.JOptionPane;


public class Calcular_DAO {
    
    public static void soma(){
        String va = "";
        float Num1=0, Num2=0;
        try{
            va = View.Calculadora_GUI.n1.getText();
            Num1 = Float.parseFloat(va);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "ERRO, coloque um número\n");
        }
        try{
            va = View.Calculadora_GUI.n2.getText();
            Num2 = Float.parseFloat(va);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "ERRO, coloque um número\n");
        }
        
        float R = Num1 + Num2;
        View.Calculadora_GUI.RESU.setText(String.valueOf(R));
    }
    
    public static void subtracao(){
        
        String va = View.Calculadora_GUI.n1.getText();
        float Num1 = Float.parseFloat(va);
        va = View.Calculadora_GUI.n2.getText();
        float Num2 = Float.parseFloat(va);
        float R = Num1 - Num2;
        View.Calculadora_GUI.RESU.setText(String.valueOf(R));
    }
    
    public static void divisao(){
        String va = View.Calculadora_GUI.n1.getText();
        float Num1 = Float.parseFloat(va);
        va = View.Calculadora_GUI.n2.getText();
        float Num2 = Float.parseFloat(va);
        float R = Num1 / Num2;
        View.Calculadora_GUI.RESU.setText(String.valueOf(R));
    }
    
    public static void multi(){
        String va = View.Calculadora_GUI.n1.getText();
        float Num1 = Float.parseFloat(va);
        va = View.Calculadora_GUI.n2.getText();
        float Num2 = Float.parseFloat(va);
        float R = Num1 * Num2;
        View.Calculadora_GUI.RESU.setText(String.valueOf(R));
    }
    
    public static void limpa(){
        View.Calculadora_GUI.n1.setText("");
        View.Calculadora_GUI.n2.setText("");
        View.Calculadora_GUI.RESU.setText("");
    }
    
    
}
