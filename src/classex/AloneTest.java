package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AloneTest {

	public static void main(String[] args) throws ClassNotFoundException{
		
		Class person = Class.forName("classex.Person");
	
		
		Constructor[] cons = person.getConstructors();
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println();
		
		Field[] fields = person.getFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		
		System.out.println();
		
		Method[] methods = person.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}

	}

}
