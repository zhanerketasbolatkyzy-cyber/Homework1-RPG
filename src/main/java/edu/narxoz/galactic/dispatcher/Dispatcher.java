package edu.narxoz.galactic.dispatcher;

import edu.narxoz.galactic.drones.Drone;
import edu.narxoz.galactic.drones.DroneStatus;
import edu.narxoz.galactic.task.DeliveryTask;
import edu.narxoz.galactic.task.TaskState;

public class Dispatcher {

    public Result assignTask(DeliveryTask task, Drone drone) {
        if (task == null || drone == null) {
            return Result.failure("Task or drone is null");
        }

        if (drone.getStatus() != DroneStatus.IDLE) {
            return Result.failure("Drone is not IDLE");
        }

        if (task.getState() != TaskState.CREATED) {
            return Result.failure("Task is not in CREATED state");
        }

        double cargoWeight = task.getCargo().getWeightKg();
        if (cargoWeight > drone.getMaxPayloadKg()) {
            return Result.failure("Cargo is overweight for this drone");
        }
        task.assignDroneInternal(drone);
        task.setStateInternal(TaskState.ASSIGNED);
        drone.startFlight();

        return Result.success();
    }

    public Result completeTask(DeliveryTask task) {
        if (task == null) {
            return Result.failure("Task is null");
        }

        if (task.getState() != TaskState.ASSIGNED) {
            return Result.failure("Task is not ASSIGNED");
        }

        Drone drone = task.getAssignedDrone();
        if (drone == null) {
            return Result.failure("Assigned drone is null");
        }

        if (drone.getStatus() != DroneStatus.IN_FLIGHT) {
            return Result.failure("Drone is not IN_FLIGHT");
        }
        task.setStateInternal(TaskState.DONE);
        drone.finishFlight();

        return Result.success();
    }
}
