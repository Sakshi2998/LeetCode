package array;

public class SortColors {
	public void sortColors(int[] nums) {
		  
        if(nums.length==0||nums.length==1)
            return;
            
        
        
        	int front = 0, back = nums.length - 1, trav = 0;

		while (back>0 && nums[back] == 2) {
			back--;

		}

		while (front<nums.length && nums[front] == 0 ) {
			front++;

		}
		trav = front;

		while(trav<=back && trav<nums.length) {
			if (nums[trav] == 0) {
				int temp = nums[front];
				nums[front]=nums[trav];
				nums[trav] = temp;
				front++;
				if(nums[trav]==0)
					trav++;
				
			}
			else if (nums[trav] == 2) {
				int temp = nums[back];
				nums[back]=nums[trav];
				nums[trav] = temp;
				back--;
				
				
			}
			else
				trav++;
			

		}

		for(int i=0;i<nums.length;i++)
			System.out.println(nums[i]);
    }
	
}
