package com.srinivas.hackerrank.smartinterview.contest2;

class CountSquares {
    double countSquares(long a, long b) {
        return (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1);
    }
}

// Driver Code

