package HomeWork3;

public class ArrayMethods {
    public class ArrayUtils {
        private int[] array;

        public ArrayUtils(int[] array) {
            this.array = array;
        }

        public void sort() {
            if (array == null || array.length == 0) {
                return;
            }
            quickSort(0, array.length - 1);
        }

        public int findMax() {
            if (array == null || array.length == 0) {
                return -1;
            }
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }

        public int findIndex(int value) {
            if (array == null || array.length == 0) {
                return -1;
            }
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    return i;
                }
            }
            return -1;
        }

        private void quickSort(int left, int right) {
            int i = left;
            int j = right;
            int pivot = array[left + (right - left) / 2];

            while (i <= j) {
                while (array[i] < pivot) {
                    i++;
                }
                while (array[j] > pivot) {
                    j--;
                }
                if (i <= j) {
                    swap(i, j);
                    i++;
                    j--;
                }
            }

            if (left < j) {
                quickSort(left, j);
            }
            if (i < right) {
                quickSort(i, right);
            }
        }

        private void swap(int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
