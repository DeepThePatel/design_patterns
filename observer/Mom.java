public class Mom{
    protected Subject baby;

    Mom(Subject baby) {
        
    }

    /**
     * Receives type of cry and displays message and calls method
     * @param cry Based on type of cry, update selects correct type of cry received and outputs corresponding message and calls method
     */
    public static void update(Cry cry) {
        if(cry == Cry.ANGRY)
        {
            System.out.println("Mom hugs " + name);
            ((Baby)baby).receiveLove();
        }
        else if(cry == Cry.HUNGRY)
        {
            System.out.println("Mom feeds " + name);
            ((Baby)baby).eat();
        }
        else if(cry == Cry.WET)
        {
            System.out.println("Mom changes " + name);
            ((Baby)baby).getChanged();
        }
    }
}
