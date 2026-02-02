package edu.narxoz.galactic.drones;

public abstract class Drone {
    private final String id;
    private DroneStatus status;
    private final double maxPayloadKg;
    protected Drone(String id, double maxPayloadKg) {
        if (maxPayloadKg <= 0) {
            throw new IllegalArgumentException("maxPayloadKg must be > 0");
        }
        this.id = id;
        this.maxPayloadKg = maxPayloadKg;
        this.status = DroneStatus.IDLE;
    }
    public String getId() {
        return id;
    }
    public DroneStatus getStatus() {
        return status;
    }
    public double getMaxPayloadKg() {
        return maxPayloadKg;
    }
    public abstract double speedKmPerMin();
    public void startFlight() {
        setStatus(DroneStatus.IN_FLIGHT);
    }
    public void finishFlight() {
        setStatus(DroneStatus.IDLE);
    }
    protected void setStatus(DroneStatus status) {
        this.status = status;
    }
}
