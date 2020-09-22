package forelesningRekursivtBinarySearch;

public class RekursivBinarysearch {
    public static void main(String[] args) {
        int[] verdier = {1, 2, 4, 8, 17, 19, 22};
        for (int i = 0; i < 22; ++i) {
            System.out.println("i " + binarySearch(i, verdier, 0, verdier.length));
        }
    }

    // Søker gjennom intervallet(left, right)
    public static int binarySearch(int sokeVerdi, int[] verdier, int left, int right) {
        int midten = (left + right) / 2;
        if (right - left == 0) {
            return -left;
        }

        if (verdier[midten] <= sokeVerdi) {
            if (verdier[midten] == sokeVerdi) {
                return midten;
            }
            return binarySearch(sokeVerdi, verdier, midten + 1, right);
        } else {
            return binarySearch(sokeVerdi, verdier, left, midten - 1);

        }
    }
}


