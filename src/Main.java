public class Main {
    public static void main(String[] args) {
        Archive arch = new ZipArchive();
        arch = new ProtectedArchiveDecorator(arch, "pass123");
        System.out.println(arch.unwrap());
    }
}