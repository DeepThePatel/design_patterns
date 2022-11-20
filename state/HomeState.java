public class HomeState implements State{
    private TV tv;

    public HomeState(TV tv) {
        this.tv = tv;
    }

    @Override
    public String pressHomeButton() {
        return "Already in Home";
    }

    @Override
    public String pressNetflixButton() {
        System.out.println("Going to Netflix");
        tv.setState(tv.getNetflixState());
        return tv;
    }

    @Override
    public String pressHuluButton() {
        System.out.println("Going to Hulu");
        tv.setState(tv.getHuluState());
        return tv;
    }

    @Override
    public String pressMovieButton() {
        System.out.println("Home: You must pick an app to show movies.");
    }

    @Override
    public String pressTVButton() {
        System.out.println("Home: You must pick an app to show TV shows.");
        return null;
    }
}
