package org.example.designP.strategy;

public class SubstractOperation implements Operation{
    @Override
    public int solve(int i, int j) {
        return i-j;
    }
}
