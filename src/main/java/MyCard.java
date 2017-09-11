public class MyCard {

    public String cartAt(int position) {
        position = position - 1;
        String[] ดอกไพ่ = {"C", "D"};
        String[] เลขไพ่ = {"2", "3", "4", "5", "6", "7", "8", "9", "0", "J", "Q", "K", "A"};

        return String.format("%s%s", เลขไพ่[position % เลขไพ่.length], ดอกไพ่[position / เลขไพ่.length]);
    }
}
