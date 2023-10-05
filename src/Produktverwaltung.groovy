class Produktverwaltung {
    List<Produkt> inventur = []

    void produktHinzufuegen(String name, String barcode) {
        def produkt = new Produkt(name, barcode)
        inventur.add(produkt)
    }

    void produktBearbeiten(String barcode, String name, String kategorie, String beschreibung) {
        def produkt = inventur.find { it.barcode == barcode }
        if (produkt) {
            produkt.bearbeiteProdukt(name, barcode, kategorie, beschreibung)
        } else {
            println("Produkt mit Barcode $barcode nicht gefunden.")
        }
    }

    void produktLoeschen(String barcode) {
        inventur.removeIf { it.barcode == barcode }
    }

    void automatischeKategorisierung(String barcode, String kategorie) {
        def produkt = inventur.find { it.barcode == barcode }
        if (produkt) {
            produkt.kategorie = kategorie
        } else {
            println("Produkt mit Barcode $barcode nicht gefunden.")
        }
    }

    void automatischeBeschreibung(String barcode, String beschreibung) {
        def produkt = inventur.find { it.barcode == barcode }
        if (produkt) {
            produkt.beschreibung = beschreibung
        } else {
            println("Produkt mit Barcode $barcode nicht gefunden.")
        }
    }

}