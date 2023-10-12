class insert {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int r = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > r; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = r;
        }
        
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
