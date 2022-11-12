public class RadLight implements TrafficLightStatus {

    @Override
    public void getState() {
        System.out.println("빨간불이야");
    }

    @Override
    public TrafficLightStatus covert() {
        return new GreenLight();
    }
}
