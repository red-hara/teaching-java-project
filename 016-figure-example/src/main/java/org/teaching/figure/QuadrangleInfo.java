package org.teaching.figure;

public class QuadrangleInfo {
    private boolean isKite;
    private boolean isParallelogram;
    private boolean isRhombus;

    public QuadrangleInfo() {
        this.isKite = false;
        this.isParallelogram = false;
        this.isRhombus = false;
    }

    public boolean isKite() {
        return this.isKite;
    }

    public void setKite(boolean isKite) {
        this.isKite = isKite;
    }

    public boolean isParallelogram() {
        return this.isParallelogram;
    }

    public void setParallelogram(boolean isParallelogram) {
        this.isParallelogram = isParallelogram;
    }

    public boolean isRhombus() {
        return this.isRhombus;
    }

    public void setRhombus(boolean isRhombus) {
        this.isRhombus = isRhombus;
    }
}
