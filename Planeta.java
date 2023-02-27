/**
* @author Hugo Martin 
* @version 1.0
* @since 30/01/2023
*/
public class Planeta 
{
    //DOCUMENTAR
    /**
     *Hem d'introduir el nom, el diametre i el pes del planeta que estem afegint.
     */
    String nom;
    int diametre;
    int pes;    

    //DOCUMENTAR
    //De parametres d'entrada haurem d'introduir el nom, per exemple: Urus, el diametre, per exemple 1200, i el pes, per exemple 10000.
    //Contructor amb tots els parametres    
    public Planeta(String nom, int diametre, int pes)
    {
        this.nom = nom;
        this.diametre = diametre;
        this.pes = pes;
    }

    //DOCUMENTAR
    //Contructor buit
    /**
     * Aquesta funció es un planeta buit
     */
    public Planeta(){}

    //DOCUMENTAR
    
    /**
     * Esta funció ens dirà si el planeta té un diametre menor de 1300 significarà que es enano, pero si el diametre es major a 1300 significa que no es enano 
     * @return 1, quan el planeta es enano
     * @return 0 quan el planeta no es enano
     */
    public int planetaEnano()
    {
        if(this.diametre < 1300)
        {
            return 1;
        }
        else
        {
            return 0;
        }        
    }

    //DOCUMENTAR
    /**
     * EL planeta expandeix el seu diametre * 3 
     */
    public void expansio()
    {        
        this.diametre= this.diametre*3;

      
    }

    //DOCUMENTAR
    /**
     * @param meteorito
     * @return
     *  poden xocar amb un meteorit i això afectarà al seu pes, ja que, perdran
    una part del mateix. Concretament, quan hagi una col·lisió, perdran el mateix pes que el pes del
    propi meteorit. Si després de la col·lisió, el seu pes es igual o superior a 1800Kg, retornarem 1,
    sinó, retornarem 0 i, a més a més en aquest cas, el diàmetre del planeta augmentarà la meitat del
    que pesava el meteorit.
     */
    public int colisio(int meteorito)
    {
        //ACABAR
        return -1;
       
    }

    //Getters i setters
    public String getNom()
    {
        return this.nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public int getDiametre()
    {
        return this.diametre;
    }

    public void setDiametre(int diametre)
    {
        this.diametre = diametre;
    }
    
    public int getPes()
    {
        return this.pes;
    }

    public void setPes(int pes)
    {
        this.pes = pes;
    }    
}
