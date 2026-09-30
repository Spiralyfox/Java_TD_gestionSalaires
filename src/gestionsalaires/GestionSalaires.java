/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionsalaires;

/**
 *
 * @author maxim
 */
public class GestionSalaires {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tests applicatifs
        Developpeur d1 = new Developpeur("Pierre", "Pierre", 4, "Developpeur", "Java");
        Developpeur d2 = new Developpeur("Paul", "Paul", 2, "Developpeur", "Python");
        Developpeur d3 = new Developpeur("Jacque", "Jacque", 3, "Developpeur", "php");
        Manager m = new Manager("Dupont", "Lucie", 2, "Manager");
        AgentAdministratif a = new AgentAdministratif("Martin", "Sophie", 5, "Agent Administratif");
        
        System.out.println(d1.getDescription());
        System.out.println(d2.getDescription());
        System.out.println(d3.getDescription());
        System.out.println(m.getDescription());
        System.out.println(a.getDescription());
    }
    
}
