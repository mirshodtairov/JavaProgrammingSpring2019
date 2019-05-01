package OlimjonClass;

public class Strin {

	public static void main(String[] args) {
		String a = "Abc";
        a = "asd";
        a = "sdfsdf";
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        sb.append("jrarvrarvrarvavac");
        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.println(sb.capacity());
        
        
        sb.append("Java");
        sb.setCharAt(0, 'k');
        
//        
//        sb.append(123123);
//        boolean bo = true;
//        
//        sb.append(bo);
//        sb.delete(0, 1);
//        sb.reverse();
//        sb.insert(0, "new year");
//            
        System.out.println(sb);
        
        sb.setLength(4);
        
        String str =  sb.toString();
        
        
        System.out.println(str);

	}

}
