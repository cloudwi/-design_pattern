public class TrafficLight {

    private String state;

    TrafficLight(String state) {
        this.state = state;
    }

    //신호등의 상태를 출력합니다.
    public void getState() {
        //그린이면 "초록불이야" 라는 말을 합니다.
        if (this.state.equals("green")) {
            System.out.println("초록불이야");
            //노란색이면 "노란불이야" 라는 말을 합니다.
        } else if (this.state.equals("yellow")) {
            System.out.println("노란불이야");
            //빨간이면 "빨간불이야" 라는 말을 합니다.
        } else if (this.state.equals("red")) {
            System.out.println("빨간불이야");
        }
    }

    public void convert() {
        if (this.state.equals("green")) {
            state = "rad";
        } else if (this.state.equals("yellow")) {
            state = "yellow";
        } else if (this.state.equals("red")) {
            System.out.println("빨간불이야");
        }
    }
}
