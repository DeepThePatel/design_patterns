package state;

public class NetflixState implements State{
    private TV tv;
    private String[] movies = new String[] {"The Land Before Time", "Frozen", "The Little Mermaid", "Ice Age"};
    private String[] tvShows = new String[] {"Peppa Pig","My Little Pony", "Garfield", "Teenage Mutant Ninja Turtles"};

    public NetflixState(TV tv) {
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
        return "Already in Netflix";
    }

    @Override
    public String pressHuluButton() {
        System.out.println("Loading Hulu...");
        tv.setState(tv.getHuluState());
        return "Welcome to Hulu";
    }

    @Override
    public String pressMovieButton() {
        System.out.println("Netflix Movies:");
        for(int i=0;i<movies.length;i++) {
            System.out.println("- " + movies[i] + "\n");
        }
        return "Netflix Movies";
    }

    @Override
    public String pressTVButton() {
        System.out.println("Netflix TV Shows:");
        for(int i=0;i<tvShows.length;i++) {
            System.out.println("- " + tvShows[i] + "\n");
        }
        return "Netflix TV Shows";
    }
}
