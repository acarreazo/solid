package com.java.uml.liskov.ave.fail;

import java.util.ArrayList;
import java.util.List;

public class AveTest {


		
		  public static void main(String[] args){
		   List<Ave> aveList = new ArrayList<Ave>();
		   aveList.add(new Ave());
		   aveList.add(new Aguila());
		   aveList.add(new Pinguino());
		   volarAve ( aveList );
		  }
		
		  static void volarAve ( List<Ave> aveList ){
		    for ( Ave b : aveList ) {
			      b.volar();
		    }
		 }
		
	

	
}
