package Project.project2_이우슬.project02_이우슬.QuizProgram.aa;

public class QuizResult {
    private String name;
    private int score;

    public QuizResult(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String toCSV() {
        return name + "," + score;
    }

    public static QuizResult fromCSV(String csv) {
        String[] parts = csv.split(",");
        return new QuizResult(parts[0], Integer.parseInt(parts[1]));
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Score: " + score;
    }
}
