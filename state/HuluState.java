package state;

public class HuluState implements State{
    private TV tv;
    private String[] movies = new String[] {"Cars", "Cinderella" , "Wall-E" , "ET"};
    private String[] tvShows = new String[] {"Sesame Street" , "Care Bears", "Looney Tunes"};


    public HuluState(TV tv) {
        this.tv = tv;
    }

    @Override
    public String pressHomeButton() {
        System.out.println("Loading Home...");
        tv.setState(tv.getHomeState());
        return "Welcome to Home";
    }

    @Override
    public String pressNetflixButton() {
        System.out.println("Loading Netflix...");
        tv.setState(tv.getNetflixState());
        return "Welcome to Netflix";
    }

    @Override
    public String pressHuluButton() {
        return "Already in Hulu";
    }

    @Override
    public String pressMovieButton() {
        System.out.println("Hulu Movies:");
        for(int i=0;i<movies.length;i++) {
            System.out.println("- " + movies[i] + "\n");
        }
        return "Movies";
    }

    @Override
    public String pressTVButton() {
        System.out.println("Hulu TV Shows:");
        for(int i=0;i<tvShows.length;i++) {
            System.out.println("- " + tvShows[i] + "\n");
        }
        return "TV Shows";
    }
}
