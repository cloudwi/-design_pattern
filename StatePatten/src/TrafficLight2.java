public class TrafficLight2 {
    private TrafficLightStatus trafficLightStatus;

    TrafficLight2() {
        this.trafficLightStatus = new GreenLight();
    }

    public void getState() {
        this.trafficLightStatus.getState();
        this.trafficLightStatus = this.trafficLightStatus.covert();
    }
}
