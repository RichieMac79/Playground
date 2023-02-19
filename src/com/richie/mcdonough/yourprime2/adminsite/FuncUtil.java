package com.richie.mcdonough.yourprime2.adminsite;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.richie.mcdonough.yourprime2.*;

public class FuncUtil {
	
	private Map<String, Subscriber> userDb = new HashMap<>();
	
	public FuncUtil(Map<String, Subscriber> userDb) {
		this.userDb = userDb;
	}
	
	public Map<String, Subscriber> getUserDb() {
		return userDb;
	}
	
	public void addSubscriber(Subscriber subscriber) {
		
		Supplier<String> userId = () -> generateId().toString();
		String id = userId.get();
		subscriber.setUserID(id);
		userDb.putIfAbsent(id, subscriber);
	}
	
	public Integer generateId() {
		return new Random().nextInt(80000);
	}
	
	public boolean modifyPassword(String userId, String newPassword) {
		Subscriber subscriber = userDb.get(userId);
		subscriber.setPassword(newPassword);
		userDb.replace(userId, subscriber);
		if (userDb.get(userId).getPassword().equals(newPassword))
			return true;
		else
			return false;
	}
	
	public boolean deleteSubscriber(String userId) {
		userDb.remove(userId);
		if (userDb.get(userId) == null)
			return true;
		else
			return false;
	}
	
	// TODO refactor the implementation of the searchSubscriber() method using Java 8 stream
	// and lambda expression. You can also use the existing interfaces if you prefer (but not required).
	//
	public List<Subscriber> searchSubscriber(String keyword) {
		List<Subscriber> returnList = userDb.values()
				.stream()
				.filter(subscriber -> {
					return subscriber.getUserID().contains(keyword) || subscriber.getName().contains(keyword);
				})
				.collect(Collectors.toList());

		return returnList;
		// TIP: 
		// declare a list with type subscriber that will store the search result
		// you will need to return this list
		// use your subscriber map (check instance variable declared on top of this class) as stream, and
		// filter your data for matching keywords in user id or name (you can use predicate or lambda expression)
		//
		
	}
	
	// TODO refactor the implementation of the total sum of fees calculation using Java 8 streams
	// and lambda expression. You can also use the exisiting interfaces if you prefer (but not required).
	//
	public double calculateOverdueFees() {
		// TIP:
		// declare a variable type double that will store the result of total summation of fees,
		// use your subscriber map as stream, and include the necessary operations to get total sum using 
		// the subscriber getFees() method (with lambda expersson or method reference
		//

		double fees = userDb.values()
				.stream()
				.mapToDouble(subscriber -> subscriber.getFees())
				.sum();

		return fees;
	}
	
	// TODO refactor the implementation of the printAllSubscriber() method here with Java 8 stream and method
	// reference. You MUST use the function interface already defined here. The method will also print out the
	// details according to the sort by option - name of the subscriber, and the outstanding fees.
	//
	public void printAllSubscribers(String sortBy) {
		// TIP: 
		// use the function interface as string that you print out
		//
		Function<Subscriber, String> details = p -> p.getName() + " with outstanding amount = " + String.format("%.2f", p.getFees());

		userDb.values()
				.stream()
				.sorted((s1, s2) -> {
					if(sortBy.equals("name")) {
						return s1.getName().compareTo(s2.getName());
					} else if (sortBy.equals("fee")) {
						if (s1.getFees() > s2.getFees())
							return 1;
						else
							return -1;
					} else
						return 0;
				}).forEach(subscriber -> {
					System.out.println(details.apply(subscriber));
				});

		// you need a condition to check for the sortBy argument, use the subscriber map as stream source, and include the necessary 
		// operations to sort (based on the argument type) and print out the string for each subscriber
		//
		
	}
	
	// TODO create a method to return the average outstanding fees from all accounts using Java 8 stream and lambda expression. 
	//
	public double getAverageOutstanding() {
		// TIP:
		// declare a variable type double that will store the results of an average operation - you will return this value
		// use subscriber map as stream input and include necessary operations to calculate average
		//

		double average = userDb.values()
				.stream()
				.mapToDouble(Subscriber::getFees)
				.average()
				.orElse(Double.NaN);

		return average;
	}
	
	// TODO create a method to return the outstanding fees from all accounts group by the media type. 
	// You should make use of Java 8 Streams and lambda expression to do this - return map
	//
	public Map<String, Double> getTotalFeesGroupByMedia() {
		// TIP:
		// declare a map collection that will store the total fees you generate - check out the generic types
		// for your map as per the method signature. 
		//
		// Check MyMedia class and explore the getters you can call for each media type. 
		// For each subscriber, you need to calculate the total fees for each media type. As you traverse your
		// subscriber map, you will then call the list of each media, and calculate the total.
		// 
		// For e.g., if you have 5 subscribers, you will have 4 list of Movie, Book and Song. So you need to 
		// calculate the total fees for all movies, and then all books and lastly, all songs.
		// 
		// *SECRET TIP: 
		// With Java Stream, lambda expression and method reference, you can do this in 3 lines 
		// (one for each media type). Use subscriber stream to get media, then invidividual list can be 
		// processed as stream (all in a single pipeline) - but don't get hung up on it, use anything that you're
		// comfortable with ! -> the read tip :)
		//
		Map<String, Double> mapMedia = new HashMap<>();

		userDb.values()
				.stream();

		return mapMedia;
	}
	
	// TODO create a method to return the total number of items from all accounts using Java 8 streams and lambda expression.
	// group by the media type. Use the programming logic (idioms) that you've implemented in the getTotalFeesGroupByMedia() 
	// method as a source of inspiration in completing this method.
	//
	public Map<String, Long> getCountGroupByMedia() {
		// TIP:
		// This will be exactly like the getTotalFeesByGroupMedia() method above. You just need to return the count
		// instead of the total sum. You will return three values (in a map) for each media type. The generic types
		// assigned to the map collection are a good clue to figure out the operators that you will use to construct
		// your stream pipeline/
		//
		// *SECRET TIP:
		// Don't reinvent the wheel, use what you already created above - just replace the operator
		//
		Map<String, Long> mapMedia = new HashMap<>();

		return mapMedia;
	}
	
}
