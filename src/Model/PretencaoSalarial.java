package Model;

public class PretencaoSalarial {

    private Double pretencaoMin;
    private Double pretencaoMax;


    public PretencaoSalarial() {
    }

    public PretencaoSalarial(Double pretencaoMin, Double pretencaoMax) {
        this.pretencaoMin = pretencaoMin;
        this.pretencaoMax = pretencaoMax;
    }

    public Double getPretencaoMin() {
        return pretencaoMin;
    }

    public void setPretencaoMin(Double pretencaoMin) {
        this.pretencaoMin = pretencaoMin;
    }

    public Double getPretencaoMax() {
        return pretencaoMax;
    }

    public void setPretencaoMax(Double pretencaoMax) {
        this.pretencaoMax = pretencaoMax;
    }
}
