import java.util.ArrayList;

public class WhaleWatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Whale> Whales = new ArrayList<Whale>();
		
		Whale whale1 = new Whale ();
		whale1.setName("Right");
		whale1.setMainOcean("Atlantic");
		whale1.setWeight(2001);
		whale1.setMaxSpeed(21);
		whale1.setLength(16);
		
		Whales.add(whale1);
		
		Whale whale2 = new Whale ();
		whale2.setName("Blue");
		whale2.setMainOcean("Pacific");
		whale2.setWeight(2001);
		whale2.setMaxSpeed(23);
		whale2.setLength(16);
		
		Whales.add(whale2);
		
		Whale whale3 = new Whale ();
		whale3.setName("Sperm");
		whale3.setMainOcean("Atlantic");
		whale3.setWeight(1900);
		whale3.setMaxSpeed(20);
		whale3.setLength(40);
		
		Whales.add(whale3);
		
		Whale whale4 = new Whale ();
		whale4.setName("Humpback");
		whale4.setMainOcean("Antarctic");
		whale4.setWeight(919);
		whale4.setMaxSpeed(13);
		whale4.setLength(13);
		
		Whales.add(whale4);
		
		System.out.println(whale1);
		System.out.println(whale2);
		System.out.println(whale3);
		System.out.println(whale4);
	
		int[] intArray = new int[] { 16, 16, 40, 13 }; 
       int sum = 0; 
       for (int i = 0; i < intArray.length; i++){ 
         sum = sum + intArray[i];     }
       double average = sum / intArray.length;  
         System.out.println("\nThe average length of all the whales is: " + average); 
		
         //atlantic whales
         System.out.println("---Atlantic Whales---");
         for(Whale whale: Whales)
         {
                if (whale.getMainOcean().equals("Atlantic"))
                {
                       System.out.println(whale.getName());
                }
         }
         System.out.println();
         

         //fastest whale
          System.out.println("---Fastest Whale---");
          Whale fastestWhale = Whales.get(0);
          for(Whale whale: Whales)
          {
                if(whale.getMaxSpeed() > fastestWhale.getMaxSpeed())
                {
                       fastestWhale = whale;
                }
          }
          System.out.println(fastestWhale.getName());
          System.out.println();
          
          

       
          }
 
 


	}

		

