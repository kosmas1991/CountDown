public class CountDown {
    public synchronized void countdown () {
        String color;
        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color =ANSICOLORS.ANSI_BLUE;
                break;
            case "Thread 2":
                color =ANSICOLORS.ANSI_GREEN;
                break;
            default:
                color =ANSICOLORS.ANSI_BLACK;
        }
        for (int i=10;i>0;i--)
            System.out.println(color + "Thread: " + Thread.currentThread().getName() + "\ti: " + i);
    }
}
