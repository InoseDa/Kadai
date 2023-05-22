public class Reigai {
    public static void main(String[] args) {
        String[] names = {"⽥中さん", "鈴⽊さん", "⼭⽥さん"};
        int index = -1; // ためしに0や3、または-1に変えてみるとよいです
        try {
            if (index < 0 || 3 < index) {
                throw new ArrayIndexOutOfBoundsException();
            }
            System.out.println(names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の範囲を超えています。");
        }
    }
}

