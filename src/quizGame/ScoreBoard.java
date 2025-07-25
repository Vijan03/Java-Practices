package quizGame;

import java.time.LocalDate;

public class ScoreBoard {

    private int userId;
    private int score;
    private LocalDate Date;


    public int getUserId() {
        return userId;
    }

    public int getScore() {
        return score;
    }

    public LocalDate getDate() {
        return Date;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }
}
