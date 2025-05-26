package com.campusdual.classroom;


public class Exercise26 {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        // Añadir un contacto de ejemplo
        Contact ejemplo = new Contact("Javier", "López", "666123123");
        phonebook.addContact(ejemplo);

        // Iniciar menú
        phonebook.mainMenu();
    }
}

