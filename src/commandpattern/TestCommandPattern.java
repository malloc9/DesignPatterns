package commandpattern;

public class TestCommandPattern {
    public static void main(String[] args) {
        init();
    }

    private static void init() {
        ThreadPool pool = new ThreadPool(10);

        EmailJob emailJob = new EmailJob();
        SmsJob smsJob = new SmsJob();
        FileIOJob fileIOJob = new FileIOJob();
        LoggingJob logJob = new LoggingJob();

        for (int i = 0; i < 5; i++) {
            emailJob.setEmail(new Email());
            smsJob.setSms(new Sms());
            fileIOJob.setFileIO(new FileIO());
            logJob.setLogging(new Logging());

            pool.addJob(emailJob);
            pool.addJob(smsJob);
            pool.addJob(fileIOJob);
            pool.addJob(logJob);
        }
        pool.shutdownPool();
    }

}
