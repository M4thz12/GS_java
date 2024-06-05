package model;


import javax.swing.*;



public class Funcoes_DAO {
    public static String temp, ph, erro, plastico;

    public static void coletar_temperatura() {
        JOptionPane.showMessageDialog(null, "Iniciando sensor de temperatura\n\nColetando dados da temperatura da água ");
        temp = JOptionPane.showInputDialog(null, "Digite a temperatura da água no momento");
    }

    public static void coletar_ph_agua() {
        JOptionPane.showMessageDialog(null, "Iniciando sensor de PH\n\nColetando dados do PH da água");
         ph = JOptionPane.showInputDialog(null, "Digite o PH da água no momento");
    }
    public static void alerta(){
        JOptionPane.showMessageDialog(null, "ALERTA!\n\n\nO ambiente não está favoravel para o desenvolvimento da bacteria\n verificar biorreator imediatamente\n"+erro+" não é adequado para a sobrevivencia da bacteria", "alerta", 0);
    }
    public static void verificar_biorreator(String temp_p,String ph_p){
        JOptionPane.showMessageDialog(null, "Verificando se o interior do Biorreator, está adequado para a sobrevivencia da bacteria");
        double ph = Double.parseDouble(ph_p);
        double temp = Double.parseDouble(temp_p);

        if (temp >= 15 && temp <= 42){
            JOptionPane.showMessageDialog(null, "A temperatura do ambiente está propricia para o desenvolvimento da bacteria");
        }else{
            JOptionPane.showMessageDialog(null, "A bacteria não consegue sobreviver nessas consições\n\nGerar função de alerta!");
            erro = "Temperatura";
            alerta();
        }
        if (ph >= 5.5 && ph <= 9 ){
            JOptionPane.showMessageDialog(null, "O nivel do PH do ambiente está propricio para o desenvolvimento da bacteria");
        }else{
            JOptionPane.showMessageDialog(null, "A bacteria não consegue sobreviver nessas consições\n\nGerar função de alerta!");
            erro = "PH";
            alerta();
        }
    }
    public static void coleta_plastico(){
        JOptionPane.showMessageDialog(null, "iniciando sensor que identifica o quanto de plastico tem dentro do Biorreator");
        plastico = JOptionPane.showInputDialog(null, "Digite a quantidade de plastico que está contido dentro do Biorreator\n\n*a quantida de plastico é em gramas*");
        double plastico_gramas = Double.parseDouble(plastico);
        if (plastico_gramas < 1000){
            JOptionPane.showMessageDialog(null, "Quantidadae de plastico baixa!\n\nIniciando coleta de plastico...");
        }else {
            JOptionPane.showMessageDialog(null, "Ainda tem plastico suficiente dentro do biorreator\n\nNão é necessaria a coleta de mais material");
        }
    }


}