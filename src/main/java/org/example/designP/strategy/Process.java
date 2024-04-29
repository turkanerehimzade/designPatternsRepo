package org.example.designP.strategy;

public class Process {
    public Operation operation;
    public Process(Operation operation){
        this.operation=operation;
    }
    public int solution(int i,int j){
        return operation.solve(i,j);
    }
}
