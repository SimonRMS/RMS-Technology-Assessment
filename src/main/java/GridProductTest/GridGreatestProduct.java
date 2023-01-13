package GridProductTest;

public class GridGreatestProduct {

		public long findProduct(int[][] grid, int length) {
			long greatestproduct = 0;
			int row = grid.length;
			int col = grid[0].length;
			
	// highest left/right product
			for(int n = 0; n <= (row - 1); n++) {
				for(int m = 0; m <= (col - length); m++) {
					long product = 1;
					for(int x = 0; x <= (length - 1); x++) {
						product = product * grid[n][m+x];
					}
					if(product > greatestproduct){
						greatestproduct = product;
				}
			}
		}

	// highest up/down product
			for(int m = 0; m <= (col - 1); m++) {
				for(int n = 0; n <= (row - length); n++) {
					long product = 1;
					for(int x = 0; x <= (length - 1); x++) {
						product = product * grid[n+x][m];
						}
					if(product > greatestproduct){
						greatestproduct = product;
					}
				}
			}
			
	// highest upwards diagonal product
			for(int n = (length - 1); n <= (row - 1); n++) {
				for(int m = 0; m <= (col - length); m++) {
					long product = 1;
					for(int x = 0; x <=(length - 1); x++) {
						product = product * grid[n-x][m+x];
					}
					if(product > greatestproduct){
						greatestproduct = product;
				}
			}
		}
					
	// highest downwards diagonal product
			for(int n = 0; n <= (row - length); n++) {
				for(int m = 0; m <= (col - length); m++) {
					long product = 1;
					for(int x = 0; x <=(length - 1); x++) {
						product = product * grid[n+x][m+x];
					}
					if(product > greatestproduct){
						greatestproduct = product;
					}
				}
			}
	
	System.out.println(greatestproduct);
	return greatestproduct;
	}


}