public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if(isFull()) {
            resize();
        }
        this.data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        this.data = temp;
    }

    private boolean isFull() {
        return data.length == size;
    }

    public static void main(String[] args) {
        CustomArrayList customArrayList = new CustomArrayList();
        customArrayList.add(3);
        customArrayList.add(3);
        customArrayList.add(3);
        customArrayList.add(3);
        customArrayList.add(3);
        customArrayList.add(3);
        customArrayList.add(3);
        customArrayList.add(3);
        customArrayList.add(3);
        customArrayList.add(3);
        customArrayList.add(3);
    }


}
