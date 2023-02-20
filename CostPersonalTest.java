import static org.junit.Assert.*;
import org.junit.Test;
/**
* @author Hugo Martin 
* @version 1.0
* @since 20/02/2023
*/
public class CostPersonalTest {

    Treballador Cris =new Treballador("Cris",0, 2500,10);
    Treballador Robert=new Treballador("Robert",1, 1800,20);
    Treballador Hugo =new Treballador("Hugo",2, 1400,30);
    Treballador Ivan=new Treballador("Ivan",2, 800,40);
    Treballador Iker =new Treballador("Iker",2, 800,50);
    Treballador Rafel =new Treballador("Rafel",2, 0,0);
    Treballador[] treballadors1 = {Cris,Robert,Hugo,Ivan,Iker,Rafel};  
    Treballador[] treballadors2 = {Cris};  
    Treballador[] treballadors3 = {};  


@Test
public void testPersonal1(){

float cost1 = CostPersonal.CalculaCostDelPersonal(treballadors1);
float cost2 = CostPersonal.CalculaCostDelPersonal(treballadors2);
float cost3 = CostPersonal.CalculaCostDelPersonal(treballadors3);
float costExpected1 = 2500 + 1800 + 1400 + 800+ 800 + (20*120);
float costExpected2 = 2500;
float costExpected3 = 0;


assertEquals(costExpected1, cost1, 0.001);
assertEquals(costExpected2, cost2, 0.001);
assertEquals(costExpected3, cost3, 0.001);


}


    
@Test
public void testPersonal2(){

    float cost1 = CostPersonal.CostTreballador(Cris);
    float cost2 = CostPersonal.CostTreballador(Robert);
    float cost3 = CostPersonal.CostTreballador(Hugo);
    float cost4 = CostPersonal.CostTreballador(Rafel);


    float costExpected1 = 2500;
    float costExpected2 = 1800;
    float costExpected3 = 1400 + (30*20);
    float costExpected4 = 0;

    
    
    assertEquals(costExpected1, cost1, 0.001);
    assertEquals(costExpected2, cost2, 0.001);
    assertEquals(costExpected3, cost3, 0.001);
    assertEquals(costExpected4, cost4, 0.001);

    
    
    }

    @Test
    public void testPersonal3(){
    
    float cost1 = CostPersonal.CalculaCostDelPersonal2(treballadors1);
    float cost2 = CostPersonal.CalculaCostDelPersonal2(treballadors2);
    float cost3 = CostPersonal.CalculaCostDelPersonal2(treballadors3);
    float costExpected1 = 2500 + 1800 + 1400 + 800+ 800 + (20*120);
    float costExpected2 = 2500;
    float costExpected3 = 0;
    
    
    assertEquals(costExpected1, cost1, 0.001);
    assertEquals(costExpected2, cost2, 0.001);
    assertEquals(costExpected3, cost3, 0.001);
    
    
    }
    

}
    


