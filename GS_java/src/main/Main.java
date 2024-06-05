package main;


import model.Funcoes_DAO;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Coletando dados do Biorreator...","BIORREATOR",1);
        Funcoes_DAO.coletar_temperatura();
        Funcoes_DAO.coletar_ph_agua();
        Funcoes_DAO.verificar_biorreator(Funcoes_DAO.temp, Funcoes_DAO.ph);
        Funcoes_DAO.coleta_plastico();
        JOptionPane.showMessageDialog(null, "Temperatura do ambiente: "+Funcoes_DAO.temp+"°C\nNivel do PH d'água: "+Funcoes_DAO.ph+"\nQuantidade de pastico dentro do biorreator: "+Funcoes_DAO.plastico+"g");
    }
}