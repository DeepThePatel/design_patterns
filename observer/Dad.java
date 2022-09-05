import java.util.Random;

public class Dad {
    protected Subject baby;

    Dad(Subject baby) {
        
    }
    
/**
 * Receives type of cry and returns message based on type of cry, type of cry insignificant for dad
 * @param cry Determines what message to display depending on cry type, but in dad's case it does not matter
 */
    public static void update(Cry cry) {
        if(cry == Cry.ANGRY || cry == Cry.HUNGRY || cry == Cry.WET)
        {
            Random rand = new Random();
            String [] dad = {" Dad puts a pillow over his head.", "Dad nudges mom.", "Dad screams .... aaaaa"};
            int select = rand.nextInt(dad.length);
            System.out.println(dad[select]);
        }
    }
}
