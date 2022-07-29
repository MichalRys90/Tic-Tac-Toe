package ttttest;

import com.kodilla.names.ComputerName;
import org.junit.jupiter.api.Test;

import static com.kodilla.names.ComputerName.computer;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGame {

    @Test
    public void TestName() {
        //Given
        ComputerName computerName = new ComputerName();

        //When
        String result = computer;

        //Then
        assertEquals("Computer", result);
    }

//    @Test
//    public void TestMap() {
//        //Given
//        LogicMap logicMap = new LogicMap();
//        Map<String, Name> asd = logicMap.getLogicMap();
//
//        //When
//        asd.put("1A", new Name("O"));
//
//        //Then
//        assertEquals(logicMap.getLogicMap().get("1A"), asd.get("1A"));
//    }
}
