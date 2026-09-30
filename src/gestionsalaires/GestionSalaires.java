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
        Developpeur d = new Developpeur("Durand", "Michel", 4, "Developpeur");
        Manager m = new Manager("Dupont", "Lucie", 2, "Manager");
        AgentAdministratif a = new AgentAdministratif("Martin", "Sophie", 5, "Agent Administratif");
        
        System.out.println(d.getDescription());
        System.out.println(m.getDescription());
        System.out.println(a.getDescription());
    }
    
}
