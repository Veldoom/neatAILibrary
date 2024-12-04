package fr.veldoom;

import java.util.ArrayList;

public class NeatAILibrary {
    static int inputsNumber, outputsNumber;
    static float mutationRate;
    static ArrayList<Object> individualsList;
    static ArrayList<Agent> agents;

    public static void init(int inputsNumber, int outputsNumber, float mutationRate, ArrayList<Object> individualsList) {
        NeatAILibrary.inputsNumber = inputsNumber;
        NeatAILibrary.outputsNumber = outputsNumber;
        NeatAILibrary.mutationRate = mutationRate;
        NeatAILibrary.individualsList = individualsList;

        agents = new ArrayList<>();

        for (int i = 0; i != agents.size() - 1; i++) {
            agents.add(new Agent(inputsNumber, outputsNumber));
        }
    }
}
