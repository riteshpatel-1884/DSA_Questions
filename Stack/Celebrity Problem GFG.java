
class Solution {
    public int celebrity(int mat[][]) {
        // code here
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<mat.length;i++)
         {
             st.push(i);
         }
        
        while(st.size()>1){
            int V1 = st.pop();
            int V2 = st.pop();
            if(mat[V1][V2] == 0 ) st.push(V1);  //It means V1 V2 ko nhi janata so V1 may be a celebrity
            else if(mat[V2][V1] == 0 ) st.push(V2); //It means V2 V1 ko nhi janata so V2 may be a celebrity
        }
            if(st.size()==0) return -1; //if stack is empty means no celebrity so return -1
            int potential = st.pop();  //After checking each element, the potential celebrity can be atmost 1 so pop it 
                                       //out and check its row and columns.
            
            //checking for row
            for(int j=0;j<mat.length;j++)
            {
                if(j==potential)   
                continue; //means skipping Mat[i][i]=1 in column
                if(mat[potential][j]==1)
                return -1;
            }
            //checking for column
            for(int i=0;i<mat.length;i++)
            {
                if(mat[i][potential]==0)
                return -1;
            }
        return potential;
    }
}
