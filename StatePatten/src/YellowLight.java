public class YellowLight implements TrafficLightStatus {
    @Override
    public void getState() {
        System.out.println("노란불이야");

    }

    @Override
    public TrafficLightStatus covert() {
        return new RadLight();
    }
}
