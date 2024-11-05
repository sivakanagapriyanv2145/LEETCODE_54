class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer>ne=new ArrayList<Integer>();
        int n=matrix.length;
        int m=matrix[0].length;
        int top=0;
        int bottom=n-1;
        int i;
        int left=0,right=m-1;
        while(top<=bottom && left<=right){
        for(i=left;i<=right;i++)
        {
            ne.add(matrix[top][i]);
        }
        top++;
        for(i=top;i<=bottom;i++)
        {
            ne.add(matrix[i][right]);
        }
        right--;
        if(top<=bottom){
        for(i=right;i>=left;i--)
        {
            ne.add(matrix[bottom][i]);
        }
        bottom--;
        }
        if(left<=right){
        for(i=bottom;i>=top;i--){
            ne.add(matrix[i][left]);
        }
        left++;
        }
        }
        return ne;
        
    }
}
