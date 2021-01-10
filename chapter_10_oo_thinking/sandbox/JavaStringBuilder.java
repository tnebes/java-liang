/*
 * 10.11.2
 */
public class JavaStringBuilder {

	public static void main(String[] args) {
		
		java.lang.StringBuilder builder = new java.lang.StringBuilder();
		System.out.println(builder.capacity());
		// throws exception
		// System.out.println(builder.charAt(0);
		builder.append("Hello, world!");
		System.out.println(builder);
		builder.delete(builder.indexOf("world"), builder.indexOf("!"));
		System.out.println(builder);
		builder.insert(builder.indexOf(",") + 1, " me");
		System.out.println(builder);
		builder.setCharAt(builder.indexOf("m"), 'b');
		System.out.println(builder);
		
		
	}
	
}
