
public class DatabasePipeline extends DataPipeline {
    @Override
    protected void connect(String URL) {
        System.out.println("Connecting to database...");
        // Implement database connection logic here
    }

    @Override
    protected void transformData() {
        System.out.println("Transforming data for database...");
        // Implement data transformation logic here
    }

    @Override
    protected void storeData() {
        System.out.println("Storing data in database...");
        // Implement storing data in database logic here
    }
}

// CloudPipeline.java
public class CloudPipeline extends DataPipeline {
    @Override
    protected void connect(String URL) {
        System.out.println("Connecting to cloud...");
        // Implement cloud connection logic here
    }

    @Override
    protected void transformData() {
        System.out.println("Transforming data for cloud...");
        // Implement data transformation logic here
    }

    @Override
    protected void storeData() {
        System.out.println("Storing data in cloud...");
        // Implement storing data in cloud logic here
    }
}
