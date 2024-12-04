package fr.veldoom;

import java.util.ArrayList;
import java.util.Random;

public class Agent {
    private int inputsNumber, outputsNumber;

    public Agent(int inputsNumber, int outputsNumber) {
        this.inputsNumber = inputsNumber;
        this.outputsNumber = outputsNumber;
    }

    public ArrayList<Float> getOutputs() {
        ArrayList<Float> outputsList = new ArrayList<>();
        for (int i = 0; i != outputsNumber; i++) {
            outputsList.add(new Random().nextFloat() * 2);
        }

        return outputsList;
    }
}
