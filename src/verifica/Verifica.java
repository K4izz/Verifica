/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verifica;

/**
 *
 * @author Wangj
 */
public class Verifica {

    public static void main(String[] args) {
        // Inizio : Creazione dell'oggetto e il passaggio del Docente e della sua materia.
        Docente1 Prof1 = new Docente1("Tagliabue","Matematica");
        Docente2 Prof2 = new Docente2("Infante","Informatica");
        Docente3 Prof3 = new Docente3("Torsello","LabInformatica");
        // Fine : Creazione dell'oggetto e il passaggio del Docente e della sua materia.
        
        // Inizio : Creazione dell'oggetto per il richiamo dei metodi della classe studenti.
        Studenti myStu = new Studenti();
        // Fine : Creazione dell'oggetto per il richiamo dei metodi della classe studenti.
        
        // Inizio : Richiamo dei metodi dell'input dei voti, nome , cognome.
        myStu.identita();
        myStu.InserimentoVotoInfo();
        myStu.InserimentoVotoLabInfo();
        myStu.InserimentoVotoMate();
        // Fine : Richiamo dei metodi dell'input dei voti, nome , cognome.
        
        // Inizio : Stampa dei professori e la materia e i voti inseriti con il passaggio del voto inserito.
        Prof1.Stampa(myStu.getVotoMate());
        Prof2.Stampa(myStu.getVotoInfo());
        Prof3.Stampa(myStu.getVotoLabInfo());
        // Fine : Stampa dei professori e la materia e i voti inseriti con il passaggio del voto inserito.
        
        // Inizio : Richiamo dei metodi per i controlli dei voti e dei debiti e la stampa del nome e cognome.
        myStu.StampaIdentita();
        myStu.Media();
        myStu.ControlloDebiti();
        // Fine : Richiamo dei metodi per i controlli dei voti e dei debiti e la stampa del nome e cognome.
    }
    
    
}
