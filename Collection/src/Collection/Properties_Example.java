package Collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
public class Properties_Example {

	public static void main(String[] args) throws FileNotFoundException, IOException {
//To read key value pair from properties file 
//we will use class called as Properties
		Properties prop=new Properties();

//Step 2 -we need to tell/provide file path which we want to read
//whenever you try to read a file , there is checked exception
//file not found 
//try catch and second is throws
		prop.load(new FileInputStream("F:\\eclips-workspace\\Collection\\resource\\Properties.Properties"));
		
//Step 3- Read the properties from the file 
		System.out.println(prop.getProperty("password"));
//keys are case -sensitive it means Firstname and firstname both are different
		System.out.println(prop.getProperty("firstname"));
		
//getproperty - I will help to read specific key from the properties file
		
//Change the value of key
//setproperty
		prop.setProperty("password", "2");
		prop.setProperty("firstname", "check firstname");
		prop.store(new FileWriter("F:\\eclips-workspace\\Collection\\resource\\Properties.Properties"), "password and firstname key is changed");
		System.out.println(prop.getProperty("password"));
//call the method setproperty --two parameter key and newvalue
//we have push the changes to file --store method 
		
// 1. Create object of properties class
// 2. we give access to properties file to object by using load method
// 3. if you want to read key -getproperty("keyname")
//if you want to change key value then setproperty("key", "newvalue")
//and called store method
		Set<Entry<Object,Object>> t=prop.entrySet();
		Iterator<Entry<Object,Object>> itr= t.iterator();
		while(itr.hasNext()) {
			Entry<Object,Object> j=itr.next();
			System.out.println(j.getKey() +"   "+ j.getValue());
		}
		
		System.out.println("Reading system properties ---------------------");
//If you want to read all the properties in one goal
		Properties p=System.getProperties();
//Sytem.getproperties will read the system
		Set<Entry<Object,Object>> t1=p.entrySet();
		Iterator<Entry<Object,Object>> itr1= t1.iterator();
		while(itr1.hasNext()) {
			Entry<Object,Object> j=itr1.next();
			System.out.println(j.getKey() +"   "+ j.getValue());
		}
		
//System property need to read based on key--getproperty system class
		System.out.println(System.getProperty("java.vendor"));
	
	}

}
