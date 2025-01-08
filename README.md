Project for Programming Advanced

# 📽️ Mijn Netflix Filmcatalogus Project

## 📝 Over dit project
Dit project is gebouwd als onderdeel van mijn examenopdracht. Het laadt een grote lijst films in vanuit een CSV-bestand en biedt verschillende functies, zoals zoeken op titel, regisseur, en releasejaar. Je kunt ook recensies toevoegen aan films.

## ⚙️ Functionaliteiten
- 📌 **Reviews toevoegen:** Je kunt een review toevoegen aan een film met een score tussen 0 en 10.
- 🔍 **Zoeken op titel:** Zoek films op naam of een deel van de naam.
- 🎬 **Zoeken op regisseur:** Toon alle films van een bepaalde regisseur.
- 📅 **Zoeken op jaar:** Bekijk alle films die in een bepaald jaar zijn uitgebracht.

## 📂 Projectstructuur
- **model/** Bevat de klassen `Film` en `Review`.
- **service/** Bevat de serviceklasse `FilmService` die zoekfunctionaliteiten mogelijk maakt.
- **util/** Bevat de klasse `CSVReader` die verantwoordelijk is voor het lezen van de CSV.
- **main/** Bevat de hoofdklasse `Main` waar het keuzemenu wordt weergegeven.

## 🛠️ Hoe start je het project?
1. Open het project in IntelliJ IDEA.
2. Zorg ervoor dat je Java hebt geïnstalleerd.
3. Plaats het bestand `netflix_titles.csv` in de map `resources`.
4. Start de applicatie door `Main.java` uit te voeren.
5. Volg de instructies in het keuzemenu.

## 🚧 Uitdagingen tijdens het project
- Het correct lezen van de CSV-bestanden en omzetten naar Java-objecten.
- Het maken van foutmeldingen wanneer gebruikers verkeerde input geven.
- Exception-handling bij ontbrekende of corrupte data in het bestand.

## 🎓 Wat ik heb geleerd
- Hoe je grote bestanden kunt verwerken in Java met behulp van BufferedReader.
- Werken met Java Streams voor zoekfunctionaliteiten.
- Exception-handling om fouten netjes op te vangen.
- Structureren van een Java-project met verschillende pakketten.

## ✅ Verbeteringen voor de toekomst
- Mogelijkheid om films op genre te zoeken.
- Een grafische gebruikersinterface (GUI) maken voor de applicatie.
- Gegevens opslaan in een database in plaats van een CSV-bestand.

## 🤖 Externe hulpmiddelen
- ChatGPT (OpenAI): Gebruikt als hulpmiddel voor optimalisatie van foutafhandeling, verbeteringen aan zoekfunctionaliteiten, suggesties voor codekwaliteit en documentatievoorbeelden.