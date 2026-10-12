package q1;

import java.io.*;
import java.util.*;
import java.text.*;

class salesRecord {
    public String[] fields;

    public salesRecord(String[] data) {
        fields = data;
    }

    public double getProfit() {
        return Double.parseDouble(fields[13]);
    }

    public double getUnitsSold() {
        return Double.parseDouble(fields[8]);
    }
}

// Region,Country,Item Type,Sales Channel,Order Priority,Order Date,Order ID,
// Ship Date,Units Sold,Unit Price,Unit Cost,Total Revenue,Total Cost,Total
// Profit
public class prog1050a {
    public static List<salesRecord> loadSaleData(String filepath) {
        var records = new ArrayList<salesRecord>();
        try {
            var file = new Scanner(new File(filepath));
            file.nextLine();
            while (file.hasNextLine()) {
                String line = file.nextLine();
                String[] data = line.split(",");
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return records;
    }

    public static void main(String[] args) {
        var records = loadSaleData("Langdat/Lang1050a.csv");
        if (records != null) {
            var moneyformat = new DecimalFormat("$#,###.00");
            System.out.println("Sales to Europe: " + computeCount(records, 0, "Europe"));
            System.out.println("Cereal bought by cambodia: " + computeUnitsSold(records, 1, "Cambodia", 2, "Cereal"));
            System.out.println("Total profit from meat: " + moneyformat.format(computeSum(records, 2, "Meat")));
            System.out.println("High priority sales percentage: " + computePercentage(records, 4) + "%");
            System.out.println(
                    "Fruits profit lose in 2012: " + moneyformat.Format(computeProfitLoseIn2012(records, "Fruits")));
            System.out.println("High priority sales shipped >3 days late: " + computeHighPriotrityLateSales(records));
            System.out.println("Country with the highest profit on personal care items: "
                    + computeHighestProfit(records, 2, "personal care "));
            System.out.println("Region that bought the most snacks: " + computeMaxByField(records, 2, "Snacks", 0));
        }
        // 30:00 video
    }

    public static int computeCount(List<salesRecord> records, int fIndex, String value) {
        int count = 0;
        for (var record : records) {
            if (record.fields[fIndex].equalsIgnoreCase(value)) {
                count++;
            }

        }
        return count;
    }

    public static int computeCount(List<salesRecord> records, int fIndex1, String value1, int index2, String value2) {
        int count = 0;
        for (var record : records) {
            if (record.fields[fIndex1].equalsIgnoreCase(value1) && record.fields[fIndex2].equalsIgnoreCase(value2)) {
                count++;
            }

        }
        return count;
    }

    public static int computeUnitsSold(List<salesRecord> records, int fIndex1, String value1, int fIndex2,
            String value2) {
        int total = 0;
        for (var record : records) {
            if (record.fields[fIndex1].equalsIgnoreCase(value1) && record.fields[fIndex2].equalsIgnoreCase(value2)) {
                total += (int) record.getUnitsSold();
            }
        }
        return total;
    }

    public static double computeSum(List<salesRecord> records, int fIndex, String value) {
        double sum = 0;
        for (var record : records) {
            if (record.fields[fIndex].equalsIgnoreCase(value)) {
                sum += record.getProfit();
            }
        }
        return sum;
    }

    public static double computePercentage(List<salesRecord> records, int fIndex, String value) {
        return (double) computeCount(records, fIndex, value) / records.size() * 100;
    }

    public static double computeProfitLoseIn2012(List<salesRecord> records, int fIndex, String ItemType) {
        double lostprofit = 0;
        for (var record : records) {
            if (record.fields[2].equalsIgnoreCase(ItemType) && records.fields[5].endswith("2012")) {
                lostprofit += record.getProfit();
            }
        }
        return lostprofit;
    }

    public static int computeHighPriotrityLateSales(List<salesRecord> records) {
        int count = 0;
        var dateFormat = new SimpleDateFormat("M/d/yyyy");
        dateFormat.setTimeZone(TimeZone.getTimeZone("America/Chicago"));
        for (var record : records) {
            if (record.fields[4].equalsIgnoreCase("H")) {
                try {
                    Date orderDate = dateFormat.parse(record, fields[5]);
                    Date shipDate = dateFormat.parse(record, fields[7]);
                    long diffinMs = Math.abs(shipDate.getTime() - order.getTime());
                    long diffinDays = diffinMs / (1000 * 60 * 60 * 24);

                    if (diffinDays > 3) {
                        count++;
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }
        return count;
    }

    public static String computeHighestProfit(List<salesRecord> records, int fIndex, String ItemType) {
        String highestCountry = "nothing";
        double highestProfit = 0;
        for (var record : records) {
            if (record.fields[fIndex].equalsIgnoreCase(ItemType)) {
                double profit = records.getProfit();
                if (profit > highestProfit) {
                    highestProfit = profit;
                    highestCountry = record.fields[1];
                }
            }
        }
        return highestCountry;
    }

    public static string computeMaxByField(List<salesRecord> records, int fIndex, String ItemType, int resultFIndex) {
        String topRegion = "none";
        int maxcount = 0;
        var regions = new ArrayList<String>();
        for (var record : records) {
            if (record.fields[fIndex].equalsIgnoreCase(ItemType)) {
                String region = region.fields[resultFIndex];
                if (!regions.contains(region)) {
                    regions.add(region);
                }
            }
        }
        for (var region : regions) {
            int count = computeCount(records, fIndex, ItemType, resultFIndex, region);
            if (count > maxcount) {
                maxcount = count;
                topRegion = region;
            }

        }
        return topRegion;
    }
}