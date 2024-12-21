
import robot.Robot;
import task.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();

        Task weldingTask = new WeldingTask();
        Task paintingTask = new PaintingTask();
        Task assemblyTask = new AssemblyTask();

        Task sequentialTasks = new SequentialTaskDecorator(
                Arrays.asList(weldingTask, paintingTask, assemblyTask)
        );

        robot.setTask(sequentialTasks);

        robot.start();
        robot.executeTask();
        robot.pause();
        robot.resume();
        robot.stop();
    }
}
