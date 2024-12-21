
import robot.Robot;
import task.*;

import java.util.Arrays;

public class RobotTest {
    public static void main(String[] args) {
        System.out.println("=== Test 1 : Démarrage et exécution d'une tâche ===");
        testDemarrageEtExecution();

        System.out.println("\n=== Test 2 : Pause et reprise ===");
        testPauseEtReprise();

        System.out.println("\n=== Test 3 : Exécution de tâches séquentielles ===");
        testExecutionTachesSequentielles();
    }

    public static void testDemarrageEtExecution() {
        Robot robot = new Robot();
        Task paintingTask = new PaintingTask();

        robot.setTask(paintingTask);
        robot.start();
        robot.executeTask();
        robot.stop();
    }

    public static void testPauseEtReprise() {
        Robot robot = new Robot();
        Task weldingTask = new WeldingTask();

        robot.setTask(weldingTask);
        robot.start();
        robot.pause();
        robot.resume();
        robot.executeTask();
        robot.stop();
    }

    public static void testExecutionTachesSequentielles() {
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
        robot.stop();
    }
}
