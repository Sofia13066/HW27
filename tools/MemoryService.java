public class MemoryService {
	public static int getMaxArrayMemory() {
	int high = Integer.MAX_VALUE;
    int low = 0;
    int middle;
    int res = 0;
    
    while(low <= high) {
        
        middle = (low + high) / 2;
        
        try {
            
        int[] arr = new int[middle];
        res = middle;
        low = middle + 1;
        
    } catch(Throwable e) {
        
        high = middle - 1;
        
        }
    }
    
    return res;
    }
}
