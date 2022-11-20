public class HuluState implements State{
    private TV tv;
    private String[] movies = new String[] {"Cars", "Cinderella" , "Wall-E" , "ET"};
    private String[] tvShows = new String[] {"Sesame Street" , "Care Bears", "Looney Tunes"};


    public HomeState(TV tv) {
        this.tv = tv;
    }

    @Override
    public String pressHomeButton() {
        System.out.println("Going to Home");
        tv.setState(tv.getHomeState());
        return tv;
    }

    @Override
    public String pressNetflixButton() {
        System.out.println("Going to Netflix");
        tv.setState(tv.getNetflixState());
        return tv;
    }

    @Override
    public String pressHuluButton() {
        return "Already in Hulu";
    }

    @Override
    public String pressMovieButton() {
        for(int i=0;i<movies.length;i++) {
            System.out.println("- " + movies[i] + "\n");
        }
        return 0;
    }

    @Override
    public String pressTVButton() {
        for(int i=0;i<tvShows.length;i++) {
            System.out.println("- " + tvShows[i] + "\n");
        }
        return 0;
    }
}
