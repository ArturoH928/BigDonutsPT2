module cs380.bigdonutspt2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;
    requires java.sql;


    opens cs380.bigdonutspt2 to javafx.fxml;
    exports cs380.bigdonutspt2;
}