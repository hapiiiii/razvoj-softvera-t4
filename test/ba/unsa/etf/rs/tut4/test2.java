package ba.unsa.etf.rs.tut4;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;
import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(ApplicationExtension.class)
public class test2 {
    @Start
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));
        stage.setTitle("Hello World");
        stage.setScene(new Scene(root));
        stage.show();
    }
    @Test
    public void test2_1(FxRobot robot) {
        robot.lookup("#dodaj").queryButton();
        robot.lookup("#ulaz").queryTextInputControl();
        robot.lookup("#izlaz").queryTextInputControl(); }
    @Test
    public void test2_2(FxRobot robot) {
        robot.clickOn("#ulaz");
        robot.write("mlj1,mljeko1,2");
        robot.clickOn("#dodaj");
        TextArea textArea = (TextArea)robot.lookup("#izlaz").query();
        assertEquals("mlj1,mljeko1,2.0\n", textArea.getText());
    }

    @Test
    public void test2_3(FxRobot robot) {
        robot.clickOn("#ulaz");
        robot.write("mlj1,mljeko1,2\n"+ "mlj2,mljeko2,1.3\n" + "mlj3,mljeko3,2.25");
        robot.clickOn("#dodaj");
        TextArea textArea = (TextArea)robot.lookup("#izlaz").query();
        assertEquals("mlj1,mljeko1,2.0\n" + "mlj2,mljeko2,1.3\n" + "mlj3,mljeko3,2.25\n", textArea.getText());
    }


}

