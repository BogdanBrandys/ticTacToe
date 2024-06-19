package com.kodilla.tictactoe;
import java.io.*;
import java.util.*;

public class GameRanking {

    final static String outputFilePath = "ranking.list";
    File file = new File(outputFilePath);
    LinkedHashMap<String, Long> map = new LinkedHashMap<>();
    LinkedHashMap<String, Long> sortedMap = new LinkedHashMap<>();

    public String checkFile() {
        file.exists();
        return "File is: " + file.exists() + "File path: " + file.getAbsolutePath();
    }

    public void addPlayerToRanking(String player, Long wins) {
        map.put(player, wins);
    }

    public void saveMap() {
        BufferedWriter bf = null;
        ArrayList<Long> list = new ArrayList<>();
        try {

            // create new BufferedWriter for the output file
            bf = new BufferedWriter(new FileWriter(file));
            //sorting
            for (Map.Entry<String, Long> entry : map.entrySet()) {
                list.add(entry.getValue());
            }
            Collections.sort(list, Collections.reverseOrder());
            for (long num: list) {
                for (Map.Entry<String, Long> entry : map.entrySet()) {
                    if (entry.getValue().equals(num)) {
                        sortedMap.put(entry.getKey(), num);
                    }
                }
            }

            // iterate map entries
            for (Map.Entry<String, Long> entry :
                    sortedMap.entrySet()) {

                // put key and value separated by a colon
                bf.write(entry.getKey() + ":"
                        + entry.getValue());

                // new line
                bf.newLine();
            }

            bf.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {

                // always close the writer
                bf.close();
            } catch (Exception e) {
            }
        }
    }

    public void loadMap() {
        {
            Map<String, Long> mapFromFile
                    = HashMapFromTextFile();

            // iterate over HashMap entries
            System.out.println("Table of Awesomeness: ");
            for (Map.Entry<String, Long> entry :
                    mapFromFile.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    public LinkedHashMap<String, Long> HashMapFromTextFile() {

        BufferedReader br = null;

        try {

            File file = new File(outputFilePath);

            // create BufferedReader object from the File
            br = new BufferedReader(new FileReader(file));

            String line = null;

            // read file line by line
            while ((line = br.readLine()) != null) {
                // split the line by :
                String[] parts = line.split(":");

                // first part is name, second is number
                String name = parts[0].trim();
                Long number = Long.valueOf(parts[1].trim());

                // put name, number in HashMap if they are
                // not empty
                if (!name.equals("") && !number.equals(""))
                    map.put(name, number);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            // Always close the BufferedReader
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                }
                ;
            }
        }

        return map;
    }
}

