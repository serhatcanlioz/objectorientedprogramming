package ch10.polymorphism.log;

public class Main {

	public static void main(String[] args) {
		
		DatabaseLogger databaseLogger=new DatabaseLogger();
//		databaseLogger.log("database loglama yapıldı");

		//int[] deneme=new int[] {"serhat",1,2,3,4};
		
		BaseLogger baselogger=new BaseLogger();
		FileLogger fileLogger=new FileLogger();
		
		BaseLogger[] baseloggers= new BaseLogger[] {databaseLogger,fileLogger,baselogger};
		
		for(BaseLogger logger:baseloggers) {
			logger.log("Log Mesajı");
		}
		
		CustomerService customerService=new CustomerService(new ConsoleLogger());
		customerService.add();
	}

}
