package day13.practice;

import day07.Util.Utility;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static day07.Util.Utility.*;
import static java.lang.System.out;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );
        makeLine();
        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        // List<Transaction>
        List<Transaction> tr2021 = transactions.stream().filter(transaction -> transaction.getYear() == 2021).sorted(comparing(t -> t.getValue())).collect(toList());

        tr2021.forEach(transaction -> out.println(transaction));
        makeLine();
        // 연습 2: 거래자가 근무하는 모든 도시이름을 중복 없이 나열하시오.
        // List<String>
        // 거래목록에서 거래자들을 추출한담에 거래자안에 있는 도시이름을 추출
        // filter :  10개중에 조건에 맞는 3개를 필터링
        // map :  10개중에 10개를 가져오는데 조건에 맞게 추출
        makeLine();
        List<String> cities = transactions.stream().map(transaction -> transaction.getTrader().getCity()).collect(toList());

        out.println("cities = " + cities);
        makeLine();
        // 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 거래자리스트로 이름순으로 오름차정렬.
        // List<Trader>

        List<Trader> traderFromCamb = transactions.stream().map(transaction -> transaction.getTrader()).filter(trader -> trader.getCity().equals("Cambridge")).distinct().sorted(comparing(trader -> trader.getName())).collect(toList());
        traderFromCamb.forEach(out::println);
        makeLine();

        // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로  오름차정렬하여 반환
        // List<String>

        List<String> treaderNames = transactions.stream().map(transaction -> transaction.getTrader().getName()).distinct().sorted().collect(toList());
        out.println("treaderNames = " + treaderNames);
        makeLine();

        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?

        boolean isLiveMilan = transactions.stream().anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));

        out.println("isLiveMilan = " +isLiveMilan);

        makeLine();
        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.
        int cambridge = transactions.stream().filter(transaction -> transaction.getTrader().getCity().equals("Cambridge")).mapToInt(tr -> tr.getValue()).sum();
        out.println("cambridge = " + cambridge);

        makeLine();

        // 연습 7: 모든 거래에서 최고거래액은 얼마인가?
        int maxValue = transactions.stream().mapToInt(tr -> tr.getValue()).max().getAsInt();

        out.println("maxValue = " + maxValue);
        makeLine();
        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색

        List<Transaction> transactionList = transactions.stream().sorted(comparing(tr -> tr.getValue())).collect(toList());
        out.println("transactionList.get(0) = " + transactionList.get(0));
        
        makeLine();

        Transaction transaction = transactions.stream().min(comparing(tr ->tr.getValue())).get();

        out.println("transaction = " + transaction);

    }
}