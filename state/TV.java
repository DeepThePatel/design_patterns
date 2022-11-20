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
        state.HomeState();
    }

    public String pressNetflixButton() {
        state.NetflixState();
    }

    public String pressHuluButton() {
        state.HuluState();
    }

    public String pressMovieButton() {
        return state.pressMovieButton();
    }

    public String pressTVButton() {
        return state.pressTVButton();
    }

    public setState(State state) {
        this.state = state;
    }

    public State getHomeState() {
        return HomeState;
    }

    public State getNetflixState() {
        return NetflixState;
    }

    public State getHuluState() {
        return HuluState;
    }
}
