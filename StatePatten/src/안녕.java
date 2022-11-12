public class 안녕 implements TrafficLightStatus {
    @Override
    public void getState() {
        System.out.println("안녕 친구들");
    }

    @Override
    public TrafficLightStatus covert() {
        return null;
    }
}
