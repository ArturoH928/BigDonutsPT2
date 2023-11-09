module cs380.bigdonutspt2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens cs380.bigdonutspt2 to javafx.fxml;
    exports cs380.bigdonutspt2;
}