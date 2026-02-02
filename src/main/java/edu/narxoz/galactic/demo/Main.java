package edu.narxoz.galactic.demo;

import edu.narxoz.galactic.bodies.Planet;
import edu.narxoz.galactic.bodies.SpaceStation;
import edu.narxoz.galactic.cargo.Cargo;
import edu.narxoz.galactic.dispatcher.Dispatcher;
import edu.narxoz.galactic.dispatcher.Result;
import edu.narxoz.galactic.drones.HeavyDrone;
import edu.narxoz.galactic.drones.LightDrone;
import edu.narxoz.galactic.task.DeliveryTask;

public class Main {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();

        Planet earth = new Planet("Earth", 0, 0, "Nitrogen-Oxygen");
        SpaceStation station = new SpaceStation("ISS", 100, 0, 5);

        Cargo heavyCargo = new Cargo(15.0, "Heavy box"); // overweight for light drone
        DeliveryTask task = new DeliveryTask(earth, station, heavyCargo);

        LightDrone light = new LightDrone("LD-1", 10.0);
        HeavyDrone heavy = new HeavyDrone("HD-1", 20.0);

        System.out.println("1) Try assign overweight cargo to LightDrone:");
        Result r1 = dispatcher.assignTask(task, light);
        System.out.println("   ok=" + r1.ok() + ", reason=" + r1.reason());

        System.out.println("2) Assign to HeavyDrone:");
        Result r2 = dispatcher.assignTask(task, heavy);
        System.out.println("   ok=" + r2.ok() + ", reason=" + r2.reason());

        System.out.println("3) Estimate time (min):");
        System.out.println("   time=" + task.estimateTime());

        System.out.println("4) Complete task:");
        Result r3 = dispatcher.completeTask(task);
        System.out.println("   ok=" + r3.ok() + ", reason=" + r3.reason());

        System.out.println("Final statuses:");
        System.out.println("   drone status=" + heavy.getStatus());
        System.out.println("   task state=" + task.getState());
    }
}
