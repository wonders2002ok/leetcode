package Structure;

/**
 * @author Wallace
 */
public class ArrayTest {

    private int size; //数组长度
    private int data[];
    private int index;

    public ArrayTest (int size) {
        this.size = size;
        data = new int[size];
        index = 0;
    }

    public void print() {
        System.out.println("index: "+ index);
        for (int i = 0; i < index; i++) {
            System.out.println(data[i] + " ");
        }
        System.out.println();
    }

    public void insert(int loc, int n) {
        if (index ++ < size) {
            // 把所有元素后移
            for (int i = size - 1; i > loc; i--) {
                data[i] = data[i - 1];
            }
            data[loc] = n;
        }
    }



}
