package controller;

import model.ATM;
import model.Card;
import model.UserBank;

public class BankSession {

    // Instancia única del Singleton
    private static BankSession instance;

    // Objetos almacenados (solo una instancia de cada)
    private ATM atm;
    private UserBank user;
    private Card card;

    // Constructor privado para prevenir instanciación directa
    private BankSession() {
    }

    // Método para obtener la instancia única (versión simplificada sin sincronización)
    public static BankSession getInstance() {
        if (instance == null) {
            instance = new BankSession();
        }
        return instance;
    }

    // Métodos para establecer los objetos
    public void setATM(ATM atm) {
        this.atm = atm;
    }

    public void setUser(UserBank user) {
        this.user = user;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    // Métodos para obtener los objetos
    public ATM getATM() {
        return atm;
    }

    public UserBank getUser() {
        return user;
    }

    public Card getCard() {
        return card;
    }

    // Método para limpiar todos los objetos
    public void clearSession() {
        this.atm = null;
        this.user = null;
        this.card = null;
    }

    // Método para verificar si hay una sesión activa
    public boolean hasActiveSession() {
        return atm != null || user != null || card != null;
    }
}
