import java.util.Random;

public class Dad {
    protected Subject baby;

    Dad(Subject baby) {
        
    }

    public static void update(Cry cry) {
        if(cry == Cry.ANGRY || cry == Cry.HUNGRY || cry == cry.WET)
        {
            Random rand = new Random();
            String [] dad = {" Dad puts a pillow over his head.", "Dad nudges mom.", "Dad screams .... aaaaa"};
            int select = rand.nextInt(dad.length);
            System.out.println(dad[select]);
        }
    }
}
