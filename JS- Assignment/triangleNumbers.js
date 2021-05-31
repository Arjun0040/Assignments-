function isTriangular(num) {

    // Base case
    if (num < 0)
        return false;

    // A Triangular number must be sum of first n
    // natural numbers
    let sum = 0;
    for (let n = 1; sum <= num; n++) {
        sum = sum + n;
        if (sum == num)
            return true;
    }

    return false;
}

// Driver code
let n = 55;
for (let i = 0; i < n; i++) {
    if (isTriangular(i))
        console.log(i); 
}
