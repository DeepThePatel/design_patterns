public class TV {
    private State HomeState;
    private State NetflixState;
    private State HuluState;
    private State state;

    public TV() {
        homeState = new HomeState(this);
        netflixState = new NetflixState(this);
        huluState = new HuluState(this);
        stateState = new State(this);
    }

    public String pressHomeButton() {
        
    }

    public String pressNetflixButton() {

    }

    public String pressHuluButton() {

    }

    public String pressMovieButton() {
        
    }

    public String pressTVButton() {
        
    }

    public setState(State state) {
        
    }

    public State getHomeState() {
        
    }

    public State getNetflixState() {
        
    }

    public State getHuluState() {
        
    }
}
