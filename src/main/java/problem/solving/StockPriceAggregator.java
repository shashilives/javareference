package problem.solving;

import java.util.*;

public class StockPriceAggregator {

    public static class StatisticsAggregatorImpl implements StatisticsAggregator {
        Map<String, List<Double>> stockTrackerMap = new HashMap<>();

        @Override
        public void putNewPrice(String symbol, double price) {
            // YOUR CODE HERE
            if (stockTrackerMap.containsKey(symbol)) {
                stockTrackerMap.get(symbol).add(price);
            } else {
                stockTrackerMap.put(symbol, new ArrayList<Double>() {{
                    add(price);
                }});
            }
        }

        @Override
        public double getAveragePrice(String symbol) {
            // YOUR CODE HERE
            List<Double> temp = stockTrackerMap.get(symbol);
            return temp.stream().mapToDouble(Double::doubleValue).sum() / temp.size();
        }

        @Override
        public int getTickCount(String symbol) {
            // YOUR CODE HERE
            return stockTrackerMap.get(symbol).size();
        }
    }

    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

    public interface StatisticsAggregator {
        // This is an input. Make note of this price.
        public void putNewPrice(String symbol, double price);

        // Get the average price
        public double getAveragePrice(String symbol);

        // Get the total number of prices recorded
        public int getTickCount(String symbol);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            final StatisticsAggregator stats = new StatisticsAggregatorImpl();
            final Set<String> symbols = new TreeSet<>();

            String line = scanner.nextLine();
            String[] inputs = line.split(",");
            for (int i = 1; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String symbol = tokens[0];
                symbols.add(symbol);
                final double price = Double.parseDouble(tokens[1]);
                stats.putNewPrice(symbol, price);
            }

            for (String symbol : symbols) {
                System.out.println(
                        String.format("%s %.4f %d", symbol, stats.getAveragePrice(symbol), stats.getTickCount(symbol)));
            }
        }
        scanner.close();

    }
}

//1,IBM 22.22,AAPL 33.33,IBM 44.44,AAPL 55.55,IBM 66.66