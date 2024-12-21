package state;

import robot.Robot;

public abstract class RobotState {
    protected Robot robot;

    public RobotState(Robot robot) {
        this.robot = robot;
    }

    public abstract void start();
    public abstract void pause();
    public abstract void resume();
    public abstract void stop();
    public abstract void executeTask();
}
