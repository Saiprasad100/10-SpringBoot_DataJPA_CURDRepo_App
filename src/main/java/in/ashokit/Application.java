package in.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Book;
import in.ashokit.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		BookRepository repo = context.getBean(BookRepository.class);
	 
		//for get class name which is given by JPA 	
	   System.out.println(repo.getClass().getName());
		
	
	 

		/* 
		  //For Insertion The Record
		    Book b=new Book(); 
	b.setBookId(101);
	b.setBookName("Spring");
	b.setBookPrice(1000.00);
	
	repo.save(b);
	System.out.println("One Record Inserted.....");
	
	
			
		 //For retrievig the Data
		 
	Optional<Book>findByID=	repo.findById(101);
	System.out.println(findByID.get());
	
		
	 b.setBookId(103);
		b.setBookName("React");
		b.setBookPrice(3500.00);
		
		repo.save(b);
		
        System.out.println("One Record Inserted.....");	
 //#1    repo.save(b);
		*/
		
		/*
		 Book b1=new Book();
	    b1.setBookId(105);
		b1.setBookName("Hibernate");
		b1.setBookPrice(1500.00);
		
		
		Book b2=new Book();
	    b2.setBookId(106);
		b2.setBookName("AWS");
		b2.setBookPrice(1500.00);
		
		
		Book b3=new Book();
	    b3.setBookId(107);
		b3.setBookName("Oracle");
		b3.setBookPrice(1500.00);
		

//#2	repo.saveAll(Arrays.asList(b1,b2,b3));
		
		System.out.println("Records Inserted.....");	
		
	    */
		
//#3		//boolean status =repo.existsById(105);
		//System.out.println("Record Available :"+status);
		
//#4	System.out.println(repo.count()+" Record Availavle");
		
		/* Optional<Book> findById=repo.findById(104);
//#5	
		if(findById.isPresent()) {
			System.out.println(findById.get());
			System.out.println("Record Available");
		}
		else {
			System.out.println("Record Not available");
			
			
		}
	*/

//#6		
		/*Iterable<Book>findAllById =
	 repo.findAllById(Arrays.asList(105,102,106));
	 for(Book b:findAllById) {
		System.out.println(b);
	
	  }
	 */
		
//#7	
	   /*
		Iterable<Book>findAll =
				repo.findAll();
				for(Book b:findAll) {
					System.out.println(b);	
				}
	 
		*/
//#8		
		/*
		  if(repo.existsById(205)) {
		
			repo.deleteById(205);
			}
		else {
			System.out.println("No Record Found");
		}
		
		 if(repo.existsById(106)) {
				
				repo.deleteById(106);
				System.out.println( "Record Deleted");
				}
			else {
				System.out.println("No Record Found");
			}
			
			*/
//#9	
	        /*	
            Book b=new Book();
            b.setBookId(107);
	        repo.delete(b);
         	System.out.println("One Record Deleted");
	        */
	
//#10
		//repo.deleteAllById(Arrays.asList(103,105));
	
//#11 
		/*
		Book b1=new Book();
        b1.setBookId(101);
        
        Book b2=new Book();
        b2.setBookId(102);
        repo.deleteAll(Arrays.asList(b1,b2));
        System.out.println("Record Deleted");
       */
        
		/*List<Book> list1=repo.findByBookPriceGreaterThan(500.00);
        for(Book b:list1) 
        {
        	System.out.println(b);
        }
        
     */
		/*
		List<Book> list1=repo.findByBookName("React");
        for(Book b:list1) 
        {
        	System.out.println(b);
        }
        */	
		
		/*
	     List<Book> list2=repo.getAllBoks();
	     for(Book b:list2) {
	    	 System.out.println(b);
	     }
		*/
		
		List<Book> list2=repo.getBoks();
	     for(Book b:list2) {
	    	 System.out.println(b);
	    	 
	     }
	}
		
}
	
	
 
 

