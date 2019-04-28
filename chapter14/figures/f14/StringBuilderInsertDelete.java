/**
 *Figures 14.14 -   StringBuilderInsertDelete
 * 
 * Author: Handan Unal
 * 
 */
package figures.f14;

public class StringBuilderInsertDelete {

	public static void main(String[] args) {
		Object objectRef = "hello";
		String string = "goodbye";
		char[] CharArray = {'a','b','c','d','e','f'};
		boolean booleanValue = true;
		char charactervalue = 'K';
		int integerValue = 7;
		long longValue = 100000000;
		float floatValue = 2.5f;
		double doubleValue = 33.333;
        StringBuilder buffer = new StringBuilder();
        
        buffer.insert(0,objectRef);
        buffer.insert(0,"  ");
        buffer.insert(0,string);
        buffer.insert(0,"  ");
        buffer.insert(0,CharArray);
        buffer.insert(0,"  ");
        buffer.insert(0,booleanValue);
        buffer.insert(0,"  ");
        buffer.insert(0,charactervalue);
        buffer.insert(0," ");
        buffer.insert(0,integerValue);
        buffer.insert(0,"  ");
        buffer.insert(0,longValue);
        buffer.insert(0,"  ");
        buffer.insert(0,floatValue);
        buffer.insert(0,"  ");
        buffer.insert(0,doubleValue);

        
        System.out.printf("buffer after inserts: %n%s%n%n",buffer.toString());
        
        buffer.deleteCharAt(10);
        buffer.delete(2, 6);
        System.out.printf("buffer after deletes: %n%s%n%n",buffer.toString());
        
        
        

	}

}
