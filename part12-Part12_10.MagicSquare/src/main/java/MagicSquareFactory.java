public class MagicSquareFactory {
    public MagicSquare createMagicSquare(int size) {
        if (size % 2 == 0) {
            throw new IllegalArgumentException("Magic square width must be an odd integer.");
        }

        MagicSquare square = new MagicSquare(size);

        int num = 1;
        int row = 0;
        int col = size / 2;

        while (num <= size * size) {
            square.placeValue(row, col, num);
            num++;

            int newRow = (row - 1 + size) % size;
            int newCol = (col + 1) % size;

            if (square.readValue(newRow, newCol) != 0) {
                row = (row + 1) % size;
            } else {
                row = newRow;
                col = newCol;
            }
        }

        return square;
    }
}
