/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.polimorfismo;

/**
 *
 * @author IC
 */
public class Polimorfismo {
    
    public static void main(String[] args) {
         Notificacao[] notificacao = {new SMSNotificacao(), new EmailNotificacao()};
         notificacao[0].enviarMenssagem();
         notificacao[1].enviarMenssagem();
    }
}
