public class MyCard {

    public String cartAt(int position) {
        String ดอกไพ่ = "C";
        String[] เลขไพ่ = {"2", "3", "4", "5", "6", "7", "8", "9", "0", "J", "Q", "K", "A"};
        return String.format("%s%s", เลขไพ่[position-1], ดอกไพ่);
    }
}
