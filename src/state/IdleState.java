package state;

import robot.Robot;

public class IdleState extends RobotState {
    public IdleState(Robot robot) {
        super(robot);
    }

    @Override
    public void start() {
        System.out.println("Démarrage du robot depuis l'état Idle.");
        robot.setState(robot.getRunningState());
    }

    @Override
    public void pause() {
        System.out.println("Impossible de mettre en pause depuis Idle.");
    }

    @Override
    public void resume() {
        System.out.println("Impossible de reprendre depuis Idle.");
    }

    @Override
    public void stop() {
        System.out.println("Le robot est déjà arrêté.");
    }

    @Override
    public void executeTask() {
        System.out.println("Pas de tâche à exécuter depuis l'état Idle.");
    }
}
