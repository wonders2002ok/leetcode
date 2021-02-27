package DFS;

/**
 * @author Wallace
 * Leetcode 200 Number of Islands
 * https://leetcode-cn.com/problems/number-of-islands/
 */
public class NumberOfIslands {
    /**
     * Calculating number of islands
     * @param grid
     * @return
     */
    public static int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    /**
     * Depth first search for grid (recursive)
     * @param grid
     * @param r
     * @param c
     */
    public static void dfs(char[][] grid, int r, int c) {
        // End condition of recursive
        if (!inArea(grid, r, c)) {
            return;
        }
        if (grid[r][c] != '1') {
            return;
        }
        // Avoid calculating twice
        grid[r][c] = '2';

        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

    /**
     * If the node is inside area
     * @param grid
     * @param r
     * @param c
     * @return
     */
    public static boolean inArea(char[][] grid, int r, int c) {
        return 0 <= r && r < grid.length && 0 <= c && c < grid[0].length;
    }
}
