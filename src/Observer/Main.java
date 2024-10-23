package Observer;

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        NewsChannel channel1 = new NewsChannel("Channel 1");
        NewsChannel channel2 = new NewsChannel("Channel 2");

        agency.addObserver(channel1);
        agency.addObserver(channel2);

        agency.setLatestNews("Breaking News!");

        agency.removeObserver(channel1);
        agency.setLatestNews("Another News Update");
    }
}