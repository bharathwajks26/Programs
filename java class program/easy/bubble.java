class bubble {
    public static void main(String[] args) {
        int[] array = {64, 45, 2, 22, 11};
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
}}}

        System.out.println("\nSorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
}}
