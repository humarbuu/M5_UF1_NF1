import org.junit.Test;
/**
* @author Hugo Martin 
* @version 1.0
* @since 30/01/2023
*/
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PlanetaTest {    

    @Test 
    public void testPlanetaEnano()
    {     
        String nom= "urus";
        int diametre = 1500;
        int pes= 50000;


        String nom1= "Pluto";
        int diametre1 = 1200;
        int pes1= 10000;

        Planeta planeta = new Planeta(nom, diametre,pes);
        Planeta planeta2 = new Planeta(nom1, diametre1,pes1);
        int prova= planeta.planetaEnano();
        int prova2= planeta2.planetaEnano();
         
        assertEquals(0, prova);
        //assertEquals(expected, actual);
        assertEquals(1, prova2);
        //assertEquals(expected, actual);

    }    

    @Test 
    public void testExpansio()
    {
        
        //assertEquals(expected, actual);

    }

    @Test 
    public void testColisio()
    {        

        //assertEquals(expected, actual);
        //assertEquals(expected, actual);
        //assertEquals(expected, actual);
        //assertNotEquals(unexpected, actual);              

    }    
}
