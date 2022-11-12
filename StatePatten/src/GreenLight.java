public class GreenLight implements TrafficLightStatus {
    @Override
    public void getState() {
        System.out.println("초록불이야");
    }

    @Override
    public TrafficLightStatus covert() {
        return new YellowLight();
    }
}
