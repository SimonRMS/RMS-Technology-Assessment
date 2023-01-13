package GridProductTest;

public class GridCount {
	
	public long findCount(int[][] grid, int length) {
		long count = 0;
		
		int row = grid.length;
		int col = grid[0].length;

	// Count left/right combinations count
		long LeftCombinations = row * (col - length + 1);
	
	// Count up/down combinations
		long DownCombinations = col * (row - length + 1);
		
	// Count upwards diagonal combinations
		long UpDiagCombinations = (col - length + 1) * (row - length + 1);
		
	// Count downwards diagonal combinations
		long DownDiagCombinations = (col - length + 1) * (row - length + 1);
		
	// Total sum of all counts
		long TotalCount = LeftCombinations + DownCombinations + UpDiagCombinations + DownDiagCombinations;
		
		System.out.println(TotalCount);
		return count;
	}
		
}
