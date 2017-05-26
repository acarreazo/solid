/**
 * 
 */
package com.java.uml.liskov.ave.fail;

/**
 * @author adm
 *
 */
public class Pinguino extends Ave {
	
	public void volar(){
	    throw new UnsupportedOperationException();
	}

}
