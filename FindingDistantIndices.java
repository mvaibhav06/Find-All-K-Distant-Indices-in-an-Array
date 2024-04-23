import java.util.ArrayList;
import java.util.List;

public class FindingDistantIndices {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> temp = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]==key){
                temp.add(i);
            }
        }
        List<Integer> out = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<temp.size(); j++){
                if(Math.abs(i-temp.get(j))<=k){
                    out.add(i);
                    break;
                }
            }
        }
        return out;
    }
}
