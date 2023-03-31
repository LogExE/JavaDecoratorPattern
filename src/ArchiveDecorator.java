public class ArchiveDecorator implements Archive {
    private Archive archive;
    public ArchiveDecorator(Archive archive) {
        this.archive = archive;
    }

    @Override
    public String unwrap() {
        return archive.unwrap();
    }
}
