package KladdeOppg2;


public class Kladd2Main<T> {

	
	public static void main(String [] args ) {
		KjedetS<String> chainS = new KjedetS<String>();
 		String person1 ="Kari";
 		String person2 ="Per";
 		String person3 ="Tine";
 		String person4 = "Anne";
 		chainS.push(person1);
 		chainS.push(person2);
 		chainS.push(person3);
 		chainS.push(person4);
 		String person5 = "Berit";
 		
        
        
// 		Legg til på nr 2 
 		LinearNode<String> Anne = new LinearNode<String>(person5);
 		Anne.setNeste(chainS.start.getNeste().getNeste());
 		chainS.setAntall(chainS.getAntall()+1);
 		
 		for(int i = 0; i < chainS.getAntall(); i++) {
 			chainS.start.setNeste(chainS.start.getNeste());
 			System.out.println(chainS.start.getNeste().getElement());
 		}
	}
}
