module com.example.chapter_14_javafx_basics {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    exports com.example.chapter_14_javafx_basics.listings.listing_14_1;
    opens com.example.chapter_14_javafx_basics.listings.listing_14_1 to javafx.fxml;
}