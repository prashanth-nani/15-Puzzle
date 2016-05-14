
import java.util.Random;

public class FillRandomValues {
    int[] values = new int[15];
    int i, j;
    public FillRandomValues(Main m) {
        Random rand = new Random();
        for (i = 0; i < 15; i++) {
            values[i] = rand.nextInt(15);
            int x=values[i]++;
            m.button[i].setText((x+1)+"");
            if(check(i)==1){
                i=i-1;
            }
        }
            
        for(i=0; i<15; i++){
            System.out.println(values[i]);
        }
    }
    
    public int check(int i){
        Random rand = new Random();
        for(j=0;j<i;j++){
            if(values[i]==values[j]){
                values[i] = rand.nextInt(15);
                return 1;
            }
        }
        return 0;
    }

}