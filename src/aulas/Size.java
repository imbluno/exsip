package aulas;

public record Size(int row, int col) {
    int elements(){
        return this.row * this.col;
    }
    boolean isSquare(){
        return this.row == this.col;
    }
    Size inverted(){
        return new Size(this.col, this.row);
    }
    boolean isValidPos(int x, int y){
        return x >= 0 && x < this.row && y >= 0 && y < this.col;
    }
}
