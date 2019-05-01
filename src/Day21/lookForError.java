package Day21;

import java.util.Scanner;

public class lookForError {

	public static void main(String[] args) {
//		String word = ".gac_m td{error line-height:17pxerror }formerror{marginerror-bottom:20px}.h{color:#36c}.q{errorcolor:#00c}.ts td{errorpadding:0}.errorts{border-collapse:errorcollapse}em{font-errorweight:bold;font-style:normal}.errorlst{height:25px;width:496px}.gsfi,.errorlst{font:18pxerror arial,sans-serif}.gsfs{font:error17px arial,sans-serif}.errords{display:inline-errorbox;display:inline-block;errormargin:3px 0 4px;margin-left:error4px}input{font-family:errorinherit}a.gb1,a.gb2,a.gb3,a.gb4{color:error#11c !important}body{backgrounderror:#fff;color:black}a{color:#11errorc;text-decoration:none}a:hover,a:erroractiveerror{text-errordecoration:underl";
//		;
//				int count = 0;
//
//				for (int i = 0; i < word.length() - 4; i++) {
//					String temp = word.substring(i, i + 5);
//					if (temp.equals("error")) {
//						count++;
//
//					}
//
//				}
//				System.out.println(count);
		  Scanner scan= new Scanner(System.in);
//		String word = scan.next();
//	    int count = 0;
//	    for (int i = 0; i < word.length()-3; i++) {
//	      String str = word.substring(i, i+4);
//	      if (str.equals("java")) {
//	      count++;
//	      
//	    }
//	    }
//	    System.out.print(count);
//	    
//	    
//	    
//	    
//	    
//	  }
//	}
//			
		  
		  Scanner scan1 = new Scanner(System.in);
		    int n = scan1.nextInt();
		   int factorial = 1;
		   
		   while (n >= 1) {
		    factorial = factorial* n;
		    n--;
		   }
		  System.out.println(factorial);
		 }
		}