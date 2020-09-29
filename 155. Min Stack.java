class minTracker{
    int val;
    int minVal;
    public minTracker(int val, int minVal){
        this.val = val;
        this.minVal = minVal;
    }
}
class MinStack {

    int min;
   
    ArrayList<minTracker> stack; 
    /** initialize your data structure here. */
    public MinStack() {
        stack = new ArrayList<minTracker>();
    }
    
    public void push(int x) {    
        if(stack.isEmpty()){
            min = x;   
        }
        else if(x < min){
            min = x;
        }
        // System.out.println(" element: "+ x + min);
        stack.add(new minTracker(x, min));
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            // minTracker m = stack.get(stack.size()-1);
            // System.out.println(" pop: "+  m.val + m.minVal);
            stack.remove(stack.size()-1);
            if(stack.size()> 0){
                min = stack.get(stack.size()-1).minVal;
            }
            else{
                min = Integer.MAX_VALUE;
            }
            
        }
        
    }
    
    public int top() {
        return stack.get(stack.size()-1).val;
    }
    
    public int getMin() {
        return stack.get(stack.size()-1).minVal;
    }
}