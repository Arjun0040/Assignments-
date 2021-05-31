function binaryRightAngleTriangle(n) {
    // declare row and column
    var row, col;
    var str  = "*";

    for (row = 0; row < n; row++) {
        for (col = 0; col <= row; col++) {
            document.write(str);
        }
        document.write("<br>");
    }
}

// driver code
// no. of rows to be printed
var n = 4;
binaryRightAngleTriangle(n);