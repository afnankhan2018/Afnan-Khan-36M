
public abstract class DataPipeline {
    public final boolean processData(String URL) {
        connect(URL);
        transformData();
        storeData();
        return true;
    }

    protected abstract void connect(String URL);
    protected abstract void transformData();
    protected abstract void storeData();
}
