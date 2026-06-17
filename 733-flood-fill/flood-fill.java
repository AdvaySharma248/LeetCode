class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oc = image[sr][sc];
        if(oc != color){
            fill(image, sr, sc, oc, color);
        }
        return image;
    }
    private void fill(int[][] image, int r, int c, int oc, int newColor){
        if(r < 0 || r >= image.length || c < 0 || c >= image[0].length || image[r][c] != oc){
            return;
        }
        image[r][c] = newColor;
        fill(image, r-1, c, oc, newColor);
        fill(image, r+1, c, oc, newColor);
        fill(image, r, c-1, oc, newColor);
        fill(image, r, c+1, oc, newColor);
    }
}