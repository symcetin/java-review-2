import java.util.Optional;

import static java.util.Comparator.comparing;

public class TransactionTest {


    public static void main(String[] args) {

        //find all transactions in 2021 and sort by  value
        System.out.println("***TASK-1***");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getYear()==2011)
                .sorted(comparing(Transaction:: getValue))
                .forEach(System.out::println);

        //what are the unique cities where the traders work
        System.out.println("***TASK-2***");
        TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        //find all the traders from Cambridge and sort them by name
        System.out.println("***TASK-3***");
        TransactionData.getAll().stream()
                .map(Transaction :: getTrader)
                .filter(trader -> trader.getCity()=="Cambridge")
                .distinct()
                .sorted(comparing(Trader :: getName))
                .forEach(System.out::println);

        //Return a string os all trader's names sorted alphabetically
        System.out.println("***TASK-4***");
        String result = TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("",(name1,name2) -> name1 + name2 + " ");
        System.out.println(result);

        //Are any traders based in Milan
        System.out.println("***TASK-5***");
        boolean milanBased = TransactionData.getAll().stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println(milanBased);

        //Print the values of all transactions from the traders living in Cambridge
        System.out.println("***TASK-6***");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        //What is the highest value of all the transactions
        System.out.println("***TASK-7***");
        Optional<Integer> high =TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println(high.get());

        //Find the transaction with smallest value
        System.out.println("***TASK-8***");
        TransactionData.getAll().stream()
                .sorted(comparing(Transaction :: getValue))
                .limit(1)
                .forEach(System.out::println);
        //2nd way
        Optional<Transaction> smallValue = TransactionData.getAll().stream()
                .reduce((t1,t2) ->t1.getValue()<t2.getValue() ? t1 :t2);
        System.out.println(smallValue.get());
        //3rd way
        Optional<Transaction> smallValue2 = TransactionData.getAll().stream()
                .min(comparing(Transaction::getValue));
        System.out.println(smallValue2.get());


    }

}
