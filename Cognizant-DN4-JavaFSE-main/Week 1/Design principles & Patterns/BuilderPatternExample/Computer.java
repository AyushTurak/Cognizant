public class Computer {
    private String cpu;
    private String gpu;
    private int cores;
    private int storage;
    private int vram;
    private int ram;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.gpu = builder.gpu;
        this.cores = builder.cores;
        this.storage = builder.storage;
        this.vram = builder.vram;
        this.ram = builder.ram;
    }

    public String getCpu() {
        return this.cpu;
    }

    public String getGpu() {
        return this.gpu;
    }

    public int getCores() {
        return this.cores;
    }

    public int getStorage() {
        return this.storage;
    }

    public int getVram() {
        return this.vram;
    }

    public int getRam() {
        return this.ram;
    }

    public static class Builder {
        private String cpu;
        private String gpu;
        private int cores;
        private int storage;
        private int vram;
        private int ram;

        public Builder() {};

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder setCores(int cores) {
            this.cores = cores;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setVram(int vram) {
            this.vram = vram;
            return this;
        }


        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}