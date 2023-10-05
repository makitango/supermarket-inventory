static void main(String[] args) {

  def produktVerwaltung = new Produktverwaltung()
  produktVerwaltung.produktHinzufuegen("Apfel", "12345")
  produktVerwaltung.automatischeKategorisierung("12345", "Obst")
  produktVerwaltung.automatischeBeschreibung("12345", "Ein frischer Apfel.")
  produktVerwaltung.produktBearbeiten("12345", "Roter Apfel", "Obst", "Ein saftiger Apfel.")
  produktVerwaltung.produktLoeschen("12345")

  println(produktVerwaltung.inventur)
  println(produktVerwaltung)

}