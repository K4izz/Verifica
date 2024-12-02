/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package verifica;

/**
 *
 * @author Wangj
 */
public class Docente1 {
    // Inizio : Dichiarazione degli attributi della classe. 
    private String Docente;
    private String Materia;
    private int voto;
    // Fine : Dichiarazione degli attributi della classe. 
    
    // Inizio : Creazione del costruttore con il passaggio di 2 stringhe.
    public Docente1(String Docente,String Materia){
        this.Docente = Docente;
        this.Materia = Materia;
    }
    // Fine : Creazione del costruttore con il passaggio di 2 stringhe.
    
    // Inizio : Creazione del metodo per la stampa.
    public void Stampa(int voto){
        this.voto = voto;
        System.out.print("\nil prof " + Docente + " della materia : " + Materia + " ha inserito : " + voto );
        
    }
    // Fine : Creazione del metodo per la stampa.
}
