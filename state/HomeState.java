package state;

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
        System.out.println("Loading Netflix...");
        tv.setState(tv.getNetflixState());
        return "Welcome to Netflix";
    }

    @Override
    public String pressHuluButton() {
        System.out.println("Loading Hulu...");
        tv.setState(tv.getHuluState());
        return "Welcome to Hulu";
    }

    @Override
    public String pressMovieButton() {
        return "Home: You must pick an app to show movies.";
    }

    @Override
    public String pressTVButton() {
        return "Home: You must pick an app to show TV shows.";
    }
}
