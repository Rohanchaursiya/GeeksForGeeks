//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG{
    public void solution(Stack<Integer> st){
        if(st.size()==1)return ;
        int x=st.pop();
        solution(st);
        put(st,x);
    }
    public void put(Stack<Integer> st,int val){
        if(st.isEmpty() || st.peek()<=val){
            st.push(val);
            return;
        }
        int temp=st.pop();
        put(st,val);
        st.push(temp);
    }
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
	    solution(s);
		return s;
	}
}