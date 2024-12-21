package state;

import robot.Robot;

public class PausedState extends RobotState {
    public PausedState(Robot robot) {
        super(robot);
    }

    @Override
    public void start() {
        System.out.println("Impossible de démarrer depuis Paused.");
    }

    @Override
    public void pause() {
        System.out.println("Le robot est déjà en pause.");
    }

    @Override
    public void resume() {
        System.out.println("Reprise de l'exécution du robot.");
        robot.setState(robot.getRunningState());
    }

    @Override
    public void stop() {
        System.out.println("Arrêt du robot depuis l'état Paused.");
        robot.setState(robot.getIdleState());
    }

    @Override
    public void executeTask() {
        System.out.println("Impossible d'exécuter une tâche depuis l'état Paused.");
    }
}
