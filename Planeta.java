/**
* @author Hugo Martin 
* @version 1.0
* @since 30/01/2023
*/
public class Planeta 
{
    //DOCUMENTAR
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
    public Planeta(){}

    //DOCUMENTAR
    
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
    public void expansio()
    {        
        this.diametre= this.diametre*3;

      
    }

    //DOCUMENTAR
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
