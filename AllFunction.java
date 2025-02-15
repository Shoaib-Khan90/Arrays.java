package Array;

public class AllFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		String sentence="my name is shoaib :";
		
		String name=sentence.substring(11,sentence.length());
		
		System.out.println(name);
		
		//replace value//////////////////////////////////////////////////////////
		
		
		StringBuilder sb=new StringBuilder("shoaib");
		
		System.out.println(sb);
		
		
		System.out.println(sb.charAt(2));
		
		//insert matlb addition://////////////////////////
		
		 sb.insert(3,'a');
		
		 System.out.println(sb);
		
		// delete variable: ///////////////
		
		 sb.delete(3, 4);
		 
		 System.out.println(sb);
		
		// append values add karna one by one: ///////////////
		 
		 sb.append(" k");
		 
		 sb.append("h");
		 
		 sb.append( "a");
		 
		 sb.append( "n");
		 
		 System.out.println(sb);
		 
		 System.out.println(sb.length());
		
		// // char ulta: /////////////////////////////
		 
		 for(int i=0; i<sb.length()/2; i++) {
		 
			 int front=i;
		 	
			 int back=sb.length()-1-i;
			
		 	char frontchar=sb.charAt(front);
		 	
		 	char backchar=sb.charAt(back);
			
		 	sb.setCharAt(front, backchar);
		 	
		 	sb.setCharAt(back, frontchar);
			
		 }
		 
		 System.out.println(sb);
		    
	}
	}


