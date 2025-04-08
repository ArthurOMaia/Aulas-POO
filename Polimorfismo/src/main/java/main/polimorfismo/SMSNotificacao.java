/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.polimorfismo;

/**
 *
 * @author IC
 */
 public class SMSNotificacao extends Notificacao{
    
   @Override
   public void enviarMenssagem(){
       System.out.println("Enviando notificação via SMS");
    }
 }
