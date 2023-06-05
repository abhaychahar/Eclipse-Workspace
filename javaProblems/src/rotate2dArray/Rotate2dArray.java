package rotate2dArray;

public class Rotate2dArray {
	
	//rotation
	public int[][] rotate(int[][] matrix) {
        int tempHolder=0;
        int c=0;
        int i=0;
        int j=0;
        
        //empty array
        if(matrix.length==0) {
        	System.out.println("This matrix is empty");
        	return matrix;
        }
        else if(matrix[0].length==0) {
        	System.out.println("This matrix contains rows of empty arrays");
        	return matrix;
        }
        
        //transpose
        while(i<matrix.length) {
            while(j<matrix.length) {
                tempHolder=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tempHolder;
                j++;
            }
            c++;
            i=c;
            j=c;
        }

        //reversal
        for(int m=0; m<matrix.length; m++) {
            for(int n=0; n<(matrix.length/2); n++) {
                tempHolder=matrix[m][n];
                matrix[m][n]=matrix[m][matrix[0].length-1-n];
                matrix[m][matrix[0].length-1-n]=tempHolder;
            }
        }
        
        return matrix;
    }
	
	//print
	public void print(int[][] arr) {
		
		//empty array
        if(arr.length==0) {
        	System.out.println("This matrix is empty");
        	return;
        }
        else if(arr[0].length==0) {
        	System.out.println("This matrix contains rows of empty arrays");
        	return;
        }
		
		//print
        for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("--------- printed");
	}
}



















