package stack_Queues;

import java.util.Stack;

public class Island_Problem {
	public int findIslands(char[][] matrix) {
		int h = matrix.length;
		if (h == 0)
			return 0;
		int l = matrix[0].length;
		int result = 0;
		boolean[][] visited = new boolean[matrix.length][matrix[0].length];
		// loop for rows
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < l; j++) {
				visited[i][j] = false;
			}
		}
		Stack<String> stack = new Stack<>();
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < l; j++) {
				if (!visited[i][j] && matrix[i][j] == '1') {
					stack.push(i + "," + j);
					dfs(stack, matrix, visited);
					result++;
				}
			}
		}
		return result;
	}

	public void dfs(Stack<String> stack, char[][] matrix, boolean[][] visited) {
		int H = matrix.length;
		int L = matrix[0].length;
		while (stack.empty() == false) {
			String x = stack.pop();
			int row = Integer.parseInt(x.split(",")[0]);
			int col = Integer.parseInt(x.split(",")[1]);
			if (row < 0 || col < 0 || row >= H || col >= L || visited[row][col] || matrix[row][col] != '1')
				continue;
			visited[row][col] = true;
			stack.push(row + "," + (col - 1));
			stack.push(row + "," + (col + 1));
			stack.push((row - 1) + "," + col);
			stack.push((row + 1) + "," + col);
		}
	}

	public static void main(String[] args) {
		Island_Problem noi = new Island_Problem();
		char[][] island = new char[][] { { '1', '1', '0', '0', '1' }, { '1', '0', '0', '1', '0' },
				{ '0', '0', '1', '0', '0' }, { '0', '0', '0', '1', '1' } };

		System.out.println("Number of Islands: " + noi.findIslands(island));
	}

}
