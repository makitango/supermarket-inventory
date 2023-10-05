class Produkt {
    String name
    String barcode
    String kategorie
    String beschreibung

    Produkt(String name, String barcode) {
        this.name = name
        this.barcode = barcode
        this.kategorie = "Unbekannt"
        this.beschreibung = "Keine Beschreibung verfügbar"
    }

    void bearbeiteProdukt(String name, String barcode, String kategorie, String beschreibung) {
        this.name = name
        this.barcode = barcode
        this.kategorie = kategorie
        this.beschreibung = beschreibung
    }
}