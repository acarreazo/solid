package com.java.uml.liskov.ave.ok;

import java.util.ArrayList;
import java.util.List;

public class AveTest {


		
		  public static void main(String[] args){
		   List<Ave> aveList = new ArrayList<Ave>();
		   aveList.add(new Ave());
		   aveList.add(new AveVoladora());
		   aveList.add(new AveNoVoladora());
		    volarAve ( aveList );
		  }
		
		  static void volarAve ( List<Ave> aveList ){
		    for ( Ave b : aveList ) {
			      b.comer();
		    }
		 }
		
	

	
}
