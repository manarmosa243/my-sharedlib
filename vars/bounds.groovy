def call(int min, int max) {
    echo "Bounds library called with min=${min}, max=${max}"
    for (int i = min; i <= max; i++) {
        if (i % 20 == 0) {
            echo "Number: ${i}"
        }
    }
}
