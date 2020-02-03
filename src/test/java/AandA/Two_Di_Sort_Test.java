package AandA;

public class Two_Di_Sort_Test {

	public static void main(String[] args) {
		
		int ia[][] ={{1,4,4,2,1},{4,2,3,1,5},{1,5,3,4,2}};
		
		for(int i=0;i<=ia.length-1;i++) {
			for(int j=0;j<=ia[i].length-1;j++) {
				for(int k=j+1;k<=ia[i].length-1;k++) {
					if(ia[i][j]<ia[i][k]) {
						int temp=ia[i][j];
						ia[i][j]=ia[i][k];
						ia[i][k]=temp;
					}
				}
			}
		}

		for(int i=0;i<=ia.length-1;i++) {
			for(int j=0;j<=ia[i].length-1;j++) {
				System.out.print(ia[i][j]);
			}
			System.out.println();
		}
	}

}
