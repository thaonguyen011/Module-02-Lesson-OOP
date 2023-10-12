public class StopWatch {
    private int startTime, endTime;

    StopWatch() {

    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void start(int time) {
        startTime = time;
    }

    public void end(int time) {
        endTime = time;
    }

    public int getElapsedTime() {
        return endTime - startTime;
    }
}
