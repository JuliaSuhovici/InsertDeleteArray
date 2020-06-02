package algorithms;

public class SimpleArray {
	public static void run() {
		//----DELETE----//
		int[] data = {10,20,30,40,50};
		int indexToDelete = 2;
		output("Default: ", data);
		
		int[] newData = new int[data.length - 1];
		 for(int oi = 0, ci = 0; oi < data.length; oi++ )
		    {
		        if( oi != indexToDelete ){
		            newData[ ci++ ] = data[ oi ];
		        }
		    }
		 data = newData;
		 output("Delete: ", data);
		 
		//----INSERT----//
		 int newValue = -10;
		 int indexToInsert = 2;
		 int[] newDataInsert = new int[data.length+1];
		 
		 for(int oi=0, ci=0; ci<newDataInsert.length; ci++) {
			 if( ci != indexToInsert ){
		            newDataInsert[ ci ] = data[ oi++ ];
		        }
			 else {
				 newDataInsert[ci] = newValue;
			 }			 
		 }
		 
		 data = newDataInsert;
		 output("Insert: ", data);
		 
	}
	//----OUTPUT----//
	public static void output(String operation, int[] data) {
		System.out.print(operation);
		 for(int i : data) {
			 System.out.print(i + " ");
		 }
		 System.out.println();
	}
}
