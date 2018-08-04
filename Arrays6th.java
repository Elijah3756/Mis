import java.lang.*;
public class Arrays6th
{
    public static void main(String[] args) {//if(i%2==0)
        //4 8 12 16 20 24 28
        //easy way
        int[] nums=new int[5];//array positions 0-13        
        int sum = 2;//null
        //nums[6]=3;
        for (int i=0; i<nums.length; i++) {//2 4 6 8 10
            nums[i] = sum;
            //nums[i-1] = sum;//previous value
           //nums[i-2] = sum;//2 values before
            //nums[i+1] = sum;//next value
            //nums[i+2] = sum;//next next value
            sum=sum+2;//sum+=2;
            //System.out.print(nums[i]+" ");
        }
        for (int myValue : nums) {
            System.out.print(myValue+" ");
        }
        System.out.println("easy way above");
        
        System.out.println("hard way below");
        
        int[] pums=new int[5];//array positions 0-13        
        int sun = 20;//null
        //nums[6]=3;
        for (int i=0; i<nums.length; i++) {//2 4 6 8 10
            pums[i] = sun;
            //nums[i-1] = sum;//previous value
           //nums[i-2] = sum;//2 values before
            //nums[i+1] = sum;//next value
            //nums[i+2] = sum;//next next value
            sun/=2;//sum+=2;
            //System.out.print(nums[i]+" ");
        }
        for (int myValue : pums) {
            System.out.print(myValue+" ");
        }
        ////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////
    
        System.out.println("easy way above");
        System.out.println("hard way below");
         ////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////
        int[] pms=new int[5];//array positions 0-13        
        int sn = 1;//null
        //nums[6]=3;
        for (int i=0; i<nums.length; i++) {//2 4 6 8 10
            pms[i] = sn;
            //nums[i-1] = sum;//previous value
           //nums[i-2] = sum;//2 values before
            //nums[i+1] = sum;//next value
            //nums[i+2] = sum;//next next value
           sn+=2;
            //System.out.print(nums[i]+" ");
        }
        for (int myValue : pms) {
            System.out.print(myValue+" ");
        }
         System.out.println("easy way above");
      

         ////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////
        
      pms=new int[6];
       pms[0]=1;
       pms[1]=1;
       sum= 1; //1 1 2 3 5 8
       for(int i=1; i<pms.length ;i++) {
        pms[i] = sum;
        sum= pms[i-1] + pms[i];
    }    
    for (int myValue : pms) {
            System.out.print(myValue+" ");
        } 
        System.out.println("easy way above");
          
         ////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////
        pms=new int[7];     
         pms [0]=3;
         pms [1]=3;
         sn= 3;
       
        for (int i=1; i<nums.length; i*=2) {//3 3 6 12 24 48
            pms[i] = sn;
            
           sn*=2;
            //System.out.print(nums[i]+" ");
        }
        for (int myValue : pms) {
            System.out.print(myValue+" ");
        }
         System.out.println("easy way above");
    }
}
        
        
        
        
        
        
        
        
        

        
        
        
        
        
        
        
        
           

         

 





