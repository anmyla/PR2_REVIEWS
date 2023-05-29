package A_aSampleTest.main.java.at.campus02.iwi.devices;
// DO NOT CHANGE THIS CLASS - JUST USE IT
public class Processor {
    private String name;
    private int generation;
    private int nrCores;

    public Processor(String name, int generation, int nrCores) {
        this.name = name;
        this.generation = generation;
        this.nrCores = nrCores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public int getNrCores() {
        return nrCores;
    }

    public void setNrCores(int nrCores) {
        this.nrCores = nrCores;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "name='" + name + '\'' +
                ", generation=" + generation +
                ", nrCores=" + nrCores +
                '}';
    }

    public int compareTo(Processor processor) { // not yet finished. has to do the second category
        if (generation < processor.generation) {
            return -1;
        }
        if (generation > processor.generation) {
            return 1;
        }
        return 0;
    }

}
