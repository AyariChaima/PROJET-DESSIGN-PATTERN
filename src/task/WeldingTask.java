package task;

public class WeldingTask implements Task {
    @Override
    public void executeTask() {
        System.out.println("Soudage en cours...");
    }
}