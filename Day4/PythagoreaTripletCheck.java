public class PythagoreaTripletCheck {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 4, 6, 9, 8 };
        int arr_size = arr.length;
        if (tripletCheck(arr, arr_size))
            System.out.println("Yes");
        else
            System.out.println("No");
        


    }

    static boolean tripletCheck(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {

                    int x = arr[i] * arr[i];
                    int y = arr[j] * arr[j];
                    int z = arr[k] * arr[k];

                    if (x == y + z || y == x + z || z == x + y)
                        return true;

                }
            }
        }
        return false;
    }

}
