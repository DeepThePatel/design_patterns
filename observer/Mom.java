public class Mom{
    protected Subject baby;

    Mom(Subject baby) {
        
    }

    public static void update(Cry cry) {
        if(cry == Cry.ANGRY)
        {
            System.out.println("Mom hugs " + name);
            receiveLove();
        }
        else if(cry == Cry.HUNGRY)
        {
            System.out.println("Mom feeds " + name);
            eat();
        }
        else if(cry == Cry.WET)
        {
            System.out.println("Mom changes " + name);
            getChanged();
        }
    }
}
