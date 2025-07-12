public class test {
    public static void main(String[] args) {
        Computer computer1 = new Computer.Builder()
                .setCpu("Intel i5-12400F")
                .setGpu("Nvidia GTX 1650")
                .setCores(8)
                .setStorage(8)
                .setVram(4)
                .setRam(8)
                .build();

        System.out.println("CPU: " + computer1.getCpu());
        System.out.println("GPU: " + computer1.getGpu());
        System.out.println("Cores: " + computer1.getCores());
        System.out.println("Storage: " + computer1.getStorage());
        System.out.println("VRAM: " + computer1.getVram());
        System.out.println("RAM: " + computer1.getRam());
    }
}