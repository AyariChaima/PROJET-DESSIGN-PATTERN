package robot;

import state.*;
import task.Task;

public class Robot {
    private RobotState idleState;
    private RobotState runningState;
    private RobotState pausedState;

    private RobotState currentState;
    private Task currentTask;

    public Robot() {
        idleState = new IdleState(this);
        runningState = new RunningState(this);
        pausedState = new PausedState(this);
        currentState = idleState; // État initial
    }

    public void setState(RobotState state) {
        currentState = state;
    }

    public void setTask(Task task) {
        currentTask = task;
    }

    public RobotState getIdleState() {
        return idleState;
    }

    public RobotState getRunningState() {
        return runningState;
    }

    public RobotState getPausedState() {
        return pausedState;
    }

    public Task getCurrentTask() {
        return currentTask;
    }

    public void start() {
        currentState.start();
    }

    public void pause() {
        currentState.pause();
    }

    public void resume() {
        currentState.resume();
    }

    public void stop() {
        currentState.stop();
    }

    public void executeTask() {
        currentState.executeTask();
    }
}
