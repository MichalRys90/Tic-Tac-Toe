package com.kodilla;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static com.kodilla.bigGame.LogicForBigGame.getBigLogic;
import static com.kodilla.gameWithComputer.LogicWithComputer.getLogicWithComputer;
import static com.kodilla.names.ComputerName.computer;
import static com.kodilla.names.PlayerOneName.playerOneName;
import static com.kodilla.names.PlayerTwoName.playerTwoName;
import static com.kodilla.game.Logic.getLogic;

public class Rankings {

    File savedHashMaps = new File("Ranking.txt");
    File savedHashMapsBig = new File("RankingBig.txt");
    File savedHashMapsHard = new File("RankingHard.txt");
    File savedHashMapsPvP = new File("RankingPvP.txt");
    File savedHashMapsFX = new File("RankingFX.txt");
    Map<String, Integer[]> map = new HashMap<>();
    Integer[] result = new Integer[2];

    public Rankings() {
    }

    public void saveMap() {
        try {
            if (map.containsKey(playerOneName)) {
                if (getLogicWithComputer().equals(playerOneName)) {
                    int i = 0;
                    for (Integer a : map.get(getLogicWithComputer())) {
                        result[i++] = a + 1;
                    }
                    map.put(getLogicWithComputer(), result);
                } else {
                    int j = 1;
                    int i = 0;
                    for (Integer a : map.get(playerOneName)) {
                        result[i++] = a + j;
                        j--;
                    }
                    map.put(playerOneName, result);
                }
            } else {
                if (getLogicWithComputer().equals(playerOneName)) {
                    map.put(getLogicWithComputer(), new Integer[]{1, 1});
                } else if ((getLogicWithComputer().equals(computer)) || (getLogicWithComputer().equals("draw"))) {
                    map.put(playerOneName, new Integer[]{1, 0});
                }
            }
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(savedHashMaps));
            oos.writeObject(map);
            oos.close();
        } catch (Exception e) {
            // obsługa błędów
        }
    }

    public void loadMap() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(savedHashMaps));
            Object readMap = ois.readObject();
            if (readMap instanceof HashMap) {
                map.putAll((HashMap) readMap);
            }
            ois.close();
            for (Map.Entry<String, Integer[]> ma : map.entrySet()) {
                System.out.println("User Name: " + ma.getKey() + " [All game] [games won]" + Arrays.toString(ma.getValue()));
            }
        } catch (Exception e) {
            // obsługa błędów
        }
    }

    public void saveMapHard() {
        try {
            if (map.containsKey(playerOneName)) {
                if (getLogicWithComputer().equals(playerOneName)) {
                    int i = 0;
                    for (Integer a : map.get(getLogicWithComputer())) {
                        result[i++] = a + 1;
                    }
                    map.put(getLogicWithComputer(), result);
                } else {
                    int j = 1;
                    int i = 0;
                    for (Integer a : map.get(playerOneName)) {
                        result[i++] = a + j;
                        j--;
                    }
                    map.put(playerOneName, result);
                }
            } else {
                if (getLogicWithComputer().equals(playerOneName)) {
                    map.put(getLogicWithComputer(), new Integer[]{1, 1});
                } else if ((getLogicWithComputer().equals(computer)) || (getLogicWithComputer().equals("draw"))) {
                    map.put(playerOneName, new Integer[]{1, 0});
                }
            }
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(savedHashMapsHard));
            oos.writeObject(map);
            oos.close();
        } catch (Exception e) {
            // obsługa błędów
        }
    }

    public void loadMapHard() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(savedHashMapsHard));
            Object readMap = ois.readObject();
            if (readMap instanceof HashMap) {
                map.putAll((HashMap) readMap);
            }
            ois.close();
            for (Map.Entry<String, Integer[]> ma : map.entrySet()) {
                System.out.println("User Name: " + ma.getKey() + " [All game] [games won]" + Arrays.toString(ma.getValue()));
            }
        } catch (Exception e) {
            // obsługa błędów
        }
    }

    public void saveMapBig() {
        try {
            if ((map.containsKey(playerOneName)) && (map.containsKey(playerTwoName))) {
                if (getBigLogic().equals(playerOneName)) {
                    int i = 0;
                    for (Integer a : map.get(getBigLogic())) {
                        result[i++] = a + 1;
                    }
                    map.put(playerOneName, result);
                    int j = 1;
                    int c = 0;
                    for (Integer a : map.get(playerOneName)) {
                        result[c++] = a + j;
                        j--;
                    }
                    map.put(playerTwoName, result);
                } else if (getBigLogic().equals(playerTwoName)) {
                    int i = 0;
                    for (Integer a : map.get(getBigLogic())) {
                        result[i++] = a + 1;
                    }
                    map.put(playerTwoName, result);
                    int j = 1;
                    int c = 0;
                    for (Integer a : map.get(playerOneName)) {
                        result[c++] = a + j;
                        j--;
                    }
                    map.put(playerOneName, result);
                } else {
                    int j = 1;
                    int i = 0;
                    for (Integer a : map.get(playerOneName)) {
                        result[i++] = a + j;
                        j--;
                    }
                    map.put(playerOneName, result);
                    map.put(playerTwoName, result);
                }
            } else if (map.containsKey(playerTwoName)) {
                if (getBigLogic().equals(playerTwoName)) {
                    int i = 0;
                    for (Integer a : map.get(getBigLogic())) {
                        result[i++] = a + 1;
                    }
                    map.put(playerTwoName, result);
                    map.put(playerOneName, new Integer[]{1, 0});
                } else if (getBigLogic().equals(playerOneName)) {
                    int j = 1;
                    int i = 0;
                    for (Integer a : map.get(playerTwoName)) {
                        result[i++] = a + j;
                        j--;
                    }
                    map.put(playerTwoName, result);
                    map.put(playerOneName, new Integer[]{1, 1});
                } else {
                    int j = 1;
                    int i = 0;
                    for (Integer a : map.get(playerTwoName)) {
                        result[i++] = a + j;
                        j--;
                    }
                    map.put(playerTwoName, result);
                    map.put(playerOneName, new Integer[]{1, 0});
                }
            } else if (map.containsKey(playerOneName)) {
                if (getBigLogic().equals(playerOneName)) {
                    int i = 0;
                    for (Integer a : map.get(getBigLogic())) {
                        result[i++] = a + 1;
                    }
                    map.put(playerOneName, result);
                    map.put(playerTwoName, new Integer[]{1, 0});
                } else if (getBigLogic().equals(playerTwoName)) {
                    int j = 1;
                    int i = 0;
                    for (Integer a : map.get(playerOneName)) {
                        result[i++] = a + j;
                        j--;
                    }
                    map.put(playerOneName, result);
                    map.put(playerTwoName, new Integer[]{1, 1});
                } else {
                    int j = 1;
                    int i = 0;
                    for (Integer a : map.get(playerOneName)) {
                        result[i++] = a + j;
                        j--;
                    }
                    map.put(playerOneName, result);
                    map.put(playerTwoName, new Integer[]{1, 0});
                }
            } else {
                if (getBigLogic().equals(playerOneName)) {
                    map.put(playerOneName, new Integer[]{1, 1});
                    map.put(playerTwoName, new Integer[]{1, 0});
                } else if (getBigLogic().equals(playerTwoName)) {
                    map.put(playerOneName, new Integer[]{1, 0});
                    map.put(playerTwoName, new Integer[]{1, 1});
                } else if (getBigLogic().equals("draw")) {
                    map.put(playerOneName, new Integer[]{1, 0});
                    map.put(playerTwoName, new Integer[]{1, 0});
                }
            }
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(savedHashMapsBig));
            oos.writeObject(map);
            oos.close();
        } catch (Exception e) {
            // obsługa błędów
        }
    }

    public void loadMapBig() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(savedHashMapsBig));
            Object readMap = ois.readObject();
            if (readMap instanceof HashMap) {
                map.putAll((HashMap) readMap);
            }
            ois.close();
            for (Map.Entry<String, Integer[]> ma : map.entrySet()) {
                System.out.println("User Name: " + ma.getKey() + " [All game] [games won]" + Arrays.toString(ma.getValue()));
            }
        } catch (Exception e) {
            // obsługa błędów
        }
    }

    public void saveMapPvP() {
        try {
            if ((map.containsKey(playerOneName)) && (map.containsKey(playerTwoName))) {
                if (getLogic().equals(playerOneName)) {
                    int i = 0;
                    for (Integer a : map.get(getLogic())) {
                        result[i++] = a + 1;
                    }
                    map.put(playerOneName, result);
                    int j = 1;
                    int c = 0;
                    for (Integer a : map.get(playerOneName)) {
                        result[c++] = a + j;
                        j--;
                    }
                    map.put(playerTwoName, result);
                } else if (getLogic().equals(playerTwoName)) {
                    int i = 0;
                    for (Integer a : map.get(getLogic())) {
                        result[i++] = a + 1;
                    }
                    map.put(playerTwoName, result);
                    int j = 1;
                    int c = 0;
                    for (Integer a : map.get(playerOneName)) {
                        result[c++] = a + j;
                        j--;
                    }
                    map.put(playerOneName, result);
                } else {
                    int j = 1;
                    int i = 0;
                    for (Integer a : map.get(playerOneName)) {
                        result[i++] = a + j;
                        j--;
                    }
                    map.put(playerOneName, result);
                    map.put(playerTwoName, result);
                }
            } else if (map.containsKey(playerTwoName)) {
                if (getLogic().equals(playerTwoName)) {
                    int i = 0;
                    for (Integer a : map.get(getLogic())) {
                        result[i++] = a + 1;
                    }
                    map.put(playerTwoName, result);
                    map.put(playerOneName, new Integer[]{1, 0});
                } else if (getLogic().equals(playerOneName)) {
                    int j = 1;
                    int i = 0;
                    for (Integer a : map.get(playerTwoName)) {
                        result[i++] = a + j;
                        j--;
                    }
                    map.put(playerTwoName, result);
                    map.put(playerOneName, new Integer[]{1, 1});
                } else {
                    int j = 1;
                    int i = 0;
                    for (Integer a : map.get(playerTwoName)) {
                        result[i++] = a + j;
                        j--;
                    }
                    map.put(playerTwoName, result);
                    map.put(playerOneName, new Integer[]{1, 0});
                }
            } else if (map.containsKey(playerOneName)) {
                if (getLogic().equals(playerOneName)) {
                    int i = 0;
                    for (Integer a : map.get(getLogic())) {
                        result[i++] = a + 1;
                    }
                    map.put(playerOneName, result);
                    map.put(playerTwoName, new Integer[]{1, 0});
                } else if (getLogic().equals(playerTwoName)) {
                    int j = 1;
                    int i = 0;
                    for (Integer a : map.get(playerOneName)) {
                        result[i++] = a + j;
                        j--;
                    }
                    map.put(playerOneName, result);
                    map.put(playerTwoName, new Integer[]{1, 1});
                } else {
                    int j = 1;
                    int i = 0;
                    for (Integer a : map.get(playerOneName)) {
                        result[i++] = a + j;
                        j--;
                    }
                    map.put(playerOneName, result);
                    map.put(playerTwoName, new Integer[]{1, 0});
                }
            } else {
                if (getLogic().equals(playerOneName)) {
                    map.put(playerOneName, new Integer[]{1, 1});
                    map.put(playerTwoName, new Integer[]{1, 0});
                } else if (getLogic().equals(playerTwoName)) {
                    map.put(playerOneName, new Integer[]{1, 0});
                    map.put(playerTwoName, new Integer[]{1, 1});
                } else if (getLogic().equals("draw")) {
                    map.put(playerOneName, new Integer[]{1, 0});
                    map.put(playerTwoName, new Integer[]{1, 0});
                }
            }
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(savedHashMapsPvP));
            oos.writeObject(map);
            oos.close();
        } catch (Exception e) {
            // obsługa błędów
        }
    }

    public void loadMapPvP() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(savedHashMapsPvP));
            Object readMap = ois.readObject();
            if (readMap instanceof HashMap) {
                map.putAll((HashMap) readMap);
            }
            ois.close();
            for (Map.Entry<String, Integer[]> ma : map.entrySet()) {
                System.out.println("User Name: " + ma.getKey() + " [All game] [games won]" + Arrays.toString(ma.getValue()));
            }
        } catch (Exception e) {
            // obsługa błędów
        }
    }
}
