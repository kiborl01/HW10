package lesson_12.football;

public class Team {
    // fields
    private Integer score;
    private Integer games;
    private Integer goals;

    // constructor


    public Team() {
    }

    public Team(Integer score, Integer games, Integer goals) {
        this.score = score;
        this.games = games;
        this.goals = goals;
    }

    // methods

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getGames() {
        return games;
    }

    public void setGames(Integer games) {
        this.games = games;
    }

    public Integer getGoals() {
        return goals;
    }

    public void setGoals(Integer goals) {
        this.goals = goals;
    }
}
