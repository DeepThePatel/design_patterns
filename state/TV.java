package state;

public class TV {
    private State homeState;
    private State netflixState;
    private State huluState;
    private State state;

    public TV() {
        homeState = new HomeState(this);
        netflixState = new NetflixState(this);
        huluState = new HuluState(this);
        state = homeState;
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

    public void setState(State state) {
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
