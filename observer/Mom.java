public class Mom{
    protected static Subject baby;

    Mom(Subject baby) {

    }

    /**
     * Receives type of cry and displays message and calls method
     * @param cry Based on type of cry, update selects correct type of cry received and outputs corresponding message and calls method
     */
    public static void update(Cry cry) {
        if(cry == Cry.ANGRY)
        {
            System.out.println("Mom hugs " + ((Baby)baby).getName());
            ((Baby)baby).receiveLove();
        }
        else if(cry == Cry.HUNGRY)
        {
            System.out.println("Mom feeds " + ((Baby)baby).getName());
            ((Baby)baby).eat();
        }
        else if(cry == Cry.WET)
        {
            System.out.println("Mom changes " + ((Baby)baby).getName());
            ((Baby)baby).getChanged();
        }
    }
}
