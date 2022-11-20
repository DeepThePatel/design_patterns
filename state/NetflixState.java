public class NetflixState implements State{
    private TV tv;
    private String[] movies = new String[] {"The Land Before Time", "Frozen", "The Little Mermaid", "Ice Age"};
    private String[] tvShows = new String[] {"Peppa Pig","My Little Pony", "Garfield", "Teenage Mutant Ninja Turtles"};

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
        return "Already in Netflix";
    }

    @Override
    public String pressHuluButton() {
        System.out.println("Going to Hulu");
        tv.setState(tv.getHuluState());
        return tv;
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
