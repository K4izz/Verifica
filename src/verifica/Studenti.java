/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package verifica;
import java.util.Scanner;

public class Studenti {
    
    Scanner myScan = new Scanner(System.in);
    // Inizio : Dichiarazione dei attributi della classe. 
    private String Nome;
    private String Cognome;
    private int media;

    private int VotoInfo = 0;
    private int VotoLabInfo = 0;
    private int VotoMate = 0;
    // Fine : Dichiarazione dei attributi della classe. 
    
    // Inizio : Creazione del metodo per l'input del cognome e nome dello studente.
    public void identita(){
        System.out.print("\nInserire il Cognome dello studente : ");
        Cognome = myScan.next();
        
        System.out.print("\nInserire il Nome dello studente : ");
        Nome = myScan.next();
    }
    // Fine : Creazione del metodo per l'input del cognome e nome dello studente.
    
    // Inizio : Creazione dei metodi per l'input dei voti per ogni materia.
    public void InserimentoVotoMate(){
        System.out.print("\nInserire il Voto dello studente in Matematica : ");
        VotoInfo = myScan.nextInt();
    }
    
    public void InserimentoVotoInfo(){
        System.out.print("\nInserire il Voto dello studente in Informatica : ");
        VotoLabInfo = myScan.nextInt();
    }
    public void InserimentoVotoLabInfo(){
        System.out.print("\nInserire il Voto dello studente in LabInfo : ");
        VotoMate = myScan.nextInt();
    }
    // Fine : Creazione dei metodi per l'input dei voti per ogni materia.
    
    // Inizio : Creazione dei metodo per il controllo dei debiti.
    public void ControlloDebiti(){
        if(VotoInfo < 6 || VotoMate < 6 || VotoLabInfo < 6){
            System.out.print("\nLo studente ha avuto il debito");
        } 
        else {
            System.out.print("\nNon ha debiti");
        }
    }
    // Fine : Creazione dei metodo per il controllo dei debiti.
    
    // Inizio : Creazione del metodo per la media aritmetica e il controllo delle mancanze dei voti.
    public void Media(){
    if(VotoInfo == 0 || VotoMate == 0 || VotoLabInfo == 0){
        System.out.print("\nallo studente manca dei voti");
    }
    else {
    media = (VotoInfo + VotoMate + VotoLabInfo )/3;
    System.out.print("\nla media dello studente e' : " + media);
    }
    }
    // Fine : Creazione del metodo per la media aritmetica e il controllo delle mancanze dei voti.
    
    // Inizio : Creazione dei metodi get dei voti.
    public int getVotoInfo() {
        return VotoInfo;
    }

    public int getVotoLabInfo() {
        return VotoLabInfo;
    }

    public int getVotoMate() {
        return VotoMate;
    }
    // Fine : Creazione dei metodi get dei voti.
    
    // Inizio : Stampa nome e cognome dello studente.
    public void StampaIdentita(){
        System.out.print("\nLo studente si chiama : " + Cognome + " " + Nome);
    }
    // Fine : Stampa nome e cognome dello studente.
}
