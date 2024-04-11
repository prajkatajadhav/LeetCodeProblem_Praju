package LeetCodeProblem_Praju;
/*Given array is monotonic or not means number should be accesnding or decending  */
public class Monotonic {
   /*
    * logic 
    *//**
     * @param args
     */
    public static void main(String[] args) {
        int a[]={0,1,2,2,3};
        boolean decresing=false,incresing=true ;
        for(int i=0;i<a.length-1;i++){
            for(a[i] < a[i+1]){
                decresing=false;

            }
            else if (a[i]>a[i+1]) {
                incresing=false;
                
            }
        }return incresing||decresing;
    
    }
   
    }

