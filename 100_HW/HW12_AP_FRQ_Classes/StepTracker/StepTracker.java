public class StepTracker{
    private int steps = 0;
    private int reqSteps = 0;
    private boolean isActive = false;
    private int days = 0;
    private int activeDays = 0;


    public StepTracker(int a) {
        a = steps;
        steps =0;
        days = 0;
        activeDays = 0;
    }

    public int activeDays() {
        return activeDays;

    }

    public double averageSteps() {
        return steps/days;
    }

    public int addDailySteps(int a) {
        steps = steps + a;
        days = days + 1;
        if (a > reqSteps) {
            isActive = true;
            activeDays = activeDays + 1;
        }
    }

    

}