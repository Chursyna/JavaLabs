import edu.ntudp.fit.chursyna.lab4.JsonManager;
import edu.ntudp.fit.chursyna.lab4.Model.University;
import org.junit.jupiter.api.Test;
import static edu.ntudp.fit.chursyna.lab4.CreateOldUniversity.createOldUniversity;


public class JUnitTest {
    @Test
    public void TestObjectsEquality() {
        University oldUniversity = createOldUniversity();
        String filePath = "oldUniversity.json";
        JsonManager.writeUniversityToJson(oldUniversity, filePath);
        University newUniversity = JsonManager.readUniversityFromJson(filePath);

        if (oldUniversity.equals(newUniversity)) {
            System.out.println("Objects oldUniversity and newUniversity are equal.");
        } else {
            System.out.println("Objects oldUniversity and newUniversity are not equal.");
        }

    }
}
