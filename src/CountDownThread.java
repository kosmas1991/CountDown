public class CountDownThread extends Thread {
    CountDown countDown;

    public CountDownThread(CountDown countDown) {
        this.countDown = countDown;
    }

    @Override
    public void run() {
        countDown.countdown();
    }
}
