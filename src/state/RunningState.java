package state;

import robot.Robot;

public class RunningState extends RobotState {
    public RunningState(Robot robot) {
        super(robot);
    }

    @Override
    public void start() {
        System.out.println("Le robot est déjà en cours d'exécution.");
    }

    @Override
    public void pause() {
        System.out.println("Mise en pause du robot.");
        robot.setState(robot.getPausedState());
    }

    @Override
    public void resume() {
        System.out.println("Le robot est déjà en cours d'exécution.");
    }

    @Override
    public void stop() {
        System.out.println("Arrêt du robot.");
        robot.setState(robot.getIdleState());
    }

    @Override
    public void executeTask() {
        System.out.println("Exécution de la tâche en cours.");
        if (robot.getCurrentTask() != null) {
            robot.getCurrentTask().executeTask();
        } else {
            System.out.println("Aucune tâche assignée.");
        }
    }
}
