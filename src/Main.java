public class Main {
    public static void main(String[] args) {
        CountDown countDown = new CountDown();
        CountDownThread countDownThread1 = new CountDownThread(countDown);
        CountDownThread countDownThread2 = new CountDownThread(countDown);
        countDownThread1.setName("Thread 1");
        countDownThread2.setName("Thread 2");

        countDownThread1.start();
        countDownThread2.start();

    }
}
