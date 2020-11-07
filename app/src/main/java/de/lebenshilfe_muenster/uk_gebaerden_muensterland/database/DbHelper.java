package de.lebenshilfe_muenster.uk_gebaerden_muensterland.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Copyright (c) 2016 Matthias Tonhäuser
 * <p/>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p/>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
class DbHelper extends SQLiteOpenHelper {

    DbHelper(Context context) {
        super(context, DbContract.DATABASE_NAME, null, DbContract.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DbContract.SignTable.CREATE);
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'afterwards', 'Dann/Danach', 'Die Zukunft liegt vor mir', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'again', 'Noch mal', 'Gebärde ''eins'' kommt von hinten nach vorn', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'airplane', 'Flugzeug/Fliegen', 'Y-Hand startet vom Boden', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'allah', 'Allah', 'Faust öffnet nach vorn', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'alone', 'Alleine', 'Erhobenen Zeigefinger von oben nach unten ziehen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'apology', 'Entschuldigung', 'Handfläche kreist auf Handrücken', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'apple', 'Apfel', 'Abbeißen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'are_you_ok', 'Geht es dir Gut?', 'Mit fragender Mimik ''du'' und ''gut'' gebärden', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'as_well', 'Auch', 'Komma in die Luft malen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'baby', 'Baby', 'Baby auf Arm schaukeln', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'bad', 'Schlecht/Doof', 'Daumen runter', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'bag', 'Tasche', 'Taschengriff ergreifen und hochnehmen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'baking', 'Backen/Kneten', 'Mit Händen kneten', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'ball', 'Ball', 'Mit Handflächen Ball umfahren', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'banana', 'Banane', 'Dominante Hand schält', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'bathing', 'Baden', 'Rücken mit Handtuch abrubbeln', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'bathroom', 'Badezimmer', 'Erst ''baden'' dann ''Zimmer''', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'bed', 'Bett', 'Kopf legt sich  schlafen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'before', 'Vorher', 'Vergangenheit liegt hinter mir', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'begin', 'Anfangen', 'Eine Arbeit aufnehmen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'below', 'Unter', 'Handrücken unter Handfläche legen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'big', 'Groß', 'Hände maximal breit auseinander', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'bike', 'Fahrrad', 'Fäuste fahren', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'bird', 'Vogel', 'Schnabel auf und zu', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'bloom', 'Blühen', 'Pflanze wächst aus Boden/neben Körper', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'blue', 'Blau', 'Fluss von oben nach unten schlängeln', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'book', 'Buch', 'Handflächen öffnen sich wie Buch', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'boy', 'Junge', '2x mit gestreckter Hand grüßen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'bread', 'Brot', 'Eine Scheibe abschneiden', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'broken', 'Kaputt', 'Fäuste zerbrechen etwas', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'brush_hair', 'Bürsten/Kämmen', 'Faust bürstet über Haare', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'brush_teeth', 'Zähne putzen', 'Zeigefinger putzt Zähne auf und ab', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'buddha', 'Buddha', 'O-Hände bewegen sich nach vorn', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'build', 'Bauen/Bauklötze', 'Hände stapeln', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'bus', 'Bus', 'Buslänge zeigen, diagonal', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'butter', 'Butter', 'Zeigefinger streicht Butter auf Brot', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'butterfly', 'Schmetterling', 'Hände verhaken und Flügel flattern', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'cacao', 'Kakao', 'Daumen tippt 2x an Mundwinkel', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'candy', 'Bonbon', 'Bonbon in Wange', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'car', 'Auto', 'lenken mimen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'careful', 'Achtung/Vorsicht', 'V-Hände gucken weit zu den Seiten', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'carrot', 'Möhre', 'Schrappen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'cat', 'Katze', '3 Schnurrhaare andeuten', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'chair', 'Stuhl', 'Gebeugte Finger  als Lehne', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'chicken', 'Huhn', 'Mit Zeigefinger und Daumen picken', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'children', 'Kinder', 'Köpfe wie Orgelpfeifen zeigen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'chocolade', 'Schokolade', 'Tafel zeigen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'clean', 'Sauber', 'Hand sauber wischen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'climbing', 'Klettern', 'Mit Krallhänden nach oben klettern', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'close', 'Schlüssel/Schließen', 'Auf- und zuschließen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'coffee', 'Kaffee', 'Kaffee mahlen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'cold', 'Kalt/Frieren', 'Vor Kälte zittern', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'come_here', 'Kommen', 'Heranwinken', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'cookie', 'Keks', 'Abbeißen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'cooking', 'Kochen', 'In Stielkasserolle rühren', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'cow', 'Kuh', 'Hörner nachahmen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'cucumber', 'Gurke', 'Gurke nachformen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'cupboard', 'Schrank', 'Mit Handflächen Schrank umreißen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'deaf_aid', 'Hörgerät', 'Hörgerät hinter Ohr mimen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'diaper', 'Windel', 'Handflächen kletten Windel zu', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'dirty', 'Schmutzig', 'Krümel auf Hand verteilen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'doctor', 'Arzt/Doktor', 'Auf Handrücken pieksen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'dog', 'Hund', 'Hund zu sich ''heranklopfen''', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'doll', 'Puppe', 'Baby still auf Arm halten', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'done', 'Fertig', 'Handkante auf Handfläche ''schlagen''', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'door', 'Tür/Tor', 'Mit gestreckter Hand ''Türöffnen'' zeigen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'down', 'Unten/ Tief', 'Nach unten zeigen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'drink', 'Getränk', 'Getränk/Trinkgefäß', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'drinking', 'Trinken', 'Getränk zum Mund führen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'drop', 'Tropfen', 'Zeigefinger tropft (tippen)', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'eating', 'Essen', 'Essen nachahmen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'egg', 'Ei', 'Eigröße zeigen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'empty', 'Leer', 'Alles weg', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'fall_down', 'Runterfallen', 'Zeige-und Mittelfinger fallen von Handfläche', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'first', 'Zuerst', 'Daumen taucht von unten auf', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'fish', 'Fisch', 'Hand schlängelt sich durch''s Wasser', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'flower', 'Blume', 'Blüte öffnet sich unter Nase', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'fond', 'Lieb', 'Wange 1x von oben nach unten streicheln', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'football', 'Fußball Spielen', 'Faust tritt in Handfläche', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'fork', 'Gabel', 'Gabel piekt in Handfläche', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'friend', 'Freund/In', '2x Hände schütteln', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'full', 'Voll', 'Bis oben randvoll', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'fun', 'Spaß', '2x Nasenspitze stupsen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'girl', 'Mädchen', 'Mit Daumen 2x Trägerkleid andeuten', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'give', 'Geben', 'Richtungsgebärde von … zu …', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'glasses', 'Brille', 'Zeigefinger und Daumen formen Brille', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'go_away', 'Geh weg!', 'Wegwerf-Bewegung', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'go_there', 'Geh Da Hin', 'Richtung zeigen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'god', 'Gott', 'Dreieinigkeit fährt in den Himmel', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'good', 'Gut/Prima', 'Daumen hoch', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'grandma', 'Oma', 'Dutt andeuten', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'grandpa', 'Opa', 'Zwirbelbart andeuten', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'green', 'Grün', 'Grasbüschel wackelt', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'hello', 'Hallo/Tschüss', 'Winken', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'helping', 'Ich helfe dir', '2. Hand hilft der anderen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'here', 'Hier', 'Punkt zeigen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'horse', 'Pferd', 'Mit Zügeln reiten', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'hot', 'Heiß/Warm', 'Schweiß von Stirn wischen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'house', 'Haus', 'Dach andeuten', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'i', 'Ich', 'Mit Zeigefinger auf sich zeigen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'ice', 'Eis', 'Eis lecken', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'in', 'In', 'In ein ''Regal'' oder in ein ''Gefäß'' zeigen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'jesus', 'Jesus', 'Mittelfinger tippen auf Nagelmale', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'juice', 'Saft', 'Saft läuft aus gepresster Frucht', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'jump', 'Springen/Hüpfen', 'Zeige-und Mittelfinger hüpfen auf Handfläche', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'kindergarden', 'Kindergarten', 'Kinder'' und ''Garten'' zeigen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'kitchen', 'Küche', 'Erst ''kochen'' dann ''Zimmer''', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'knife', 'Messer/Schneiden', 'Beide Zeigefinger schneiden', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'lamp', 'Licht/Lampe', 'Strahlende Lampe seitlich oben neben Kopf', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'later', 'Später', 'Wellenförmige Bewegung', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'listening', 'Hören', 'Schall kommt an das Ohr', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'look', 'Sehen/Gucken', 'Richtungsgebärde', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'make', 'Machen', 'Obere Faust klopft drehend auf untere Faust', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'mama', 'Mama', 'Wange kreisend streicheln', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'man', 'Mann', 'Hut an Krempe fassen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'many', 'Viele', 'Finger zappeln am Kinn zur dominanten Seite', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'marmelade', 'Marmelade', 'Hand streicht flächig auf Brotscheibe', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'milk', 'Milch', 'Melken', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'more', 'Mehr', 'Handfläche bewegt sich nach oben vorn', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'motorcycle', 'Motorrad/Mofa', 'An Lenker gibt eine Faust Gas', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'music', 'Singen/Musik', 'Dirigieren', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'no', 'Nein', 'Schnell von einer zur anderen Seite', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'noodles', 'Nudeln', 'Spaghetti aufwickeln', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'now', 'Jetzt', 'Ich bin die Gegenwart', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'on_sth', 'Auf', 'Handfläche auf Handrücken legen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'one', 'Eins/Ein', 'Zeigefinger und Handrücken zum Gegenüber', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'orange', 'Orange', 'Schalen zeigen und herausbrechen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'outside', 'Draußen', 'Nach draußen zeigen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'owning', 'Haben', 'Handfläche auf Brustkorb legen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'pain', 'Schmerzen', 'Handfläche vibriert vor Schmerzstelle', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'painting', 'Malen', 'Großflächig in Luft malen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'papa', 'Papa', 'Schnauzbart andeuten', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'paper', 'Papier', 'Fäuste klopfen 2x aneinander', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'picture', 'Bild', 'DIN A4-Blatt in die Luft malen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'pig', 'Schwein', 'Schnauze nach vorn ziehen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'pill', 'Tablette', 'Tablette auf Handfläche malen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'pink', 'Rosa/Pink', 'Rosa Rose öffnet sich unter Nase', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'plate', 'Teller', 'Mit Zeigefinger Teller auf Handfläche malen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'playing', 'Spielen', 'Fächerhände 2x gegengleich auf- und abbewegen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'please', 'Bitte', '2x Handflächen aneinander', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'puke', 'Sich übergeben', 'Den Weg von unten aus Mund heraus', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'rabbit', 'Hase', 'Zeige-und Mittelfinger zeigen Ohren', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'reading', 'Lesen', 'Auf Handfläche lesen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'red', 'Rot', 'Lippenrot zeigen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'roll', 'Brötchen', '2x Brötchen formen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'room', 'Zimmer', 'Zeigefinger ziehen Mauer um Zimmer', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'run', 'Rennen/Laufen', 'Mit Armen ''rennen''', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'salt', 'Salz', 'Prise', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'sand', 'Sand', 'Sand aufnehmen und rieseln', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'school', 'Schule', 'Kreide an der Tafel', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'scissors', 'Schere/Schneiden', 'Scherbewegung mimen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'scolding', 'Schimpfen', 'Wie die Geste', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'shave', 'Rasieren', 'Rasierer halten und rasieren mimen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'sheep', 'Schaf', 'Wolle am Bauch zeigen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'ship', 'Schiff/Boot', 'Mit Handflächen Bug nach vorn fahren', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'showering', 'Duschen', 'Über dem Kopf duschen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'sibling', 'Bruder/Schwester', 'Gestreckte Zeigefinger aneinander führen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'sick', 'Krank', 'Krallhand klopft 2x auf Brustkorb', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'sink', 'Waschbecken', 'Handschüsseln formen Waschbecken', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'sit', 'Sitzen', 'Häschenhand zieht von oben nach unten', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'small', 'Klein', 'Handflächen 20 cm breit auseinander', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'something_else', 'Etw. Anderes', 'Zeigefinger deuten viele andere Möglichkeiten an', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'spoon', 'Löffel', '2x in Mund löffeln', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'stand', 'Stehen', 'Zeige-und Mittelfinger  stehen auf Handfläche', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'stand_up', 'Aufstehen', 'Wie der Pfarrer in der Kirche', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'stop', 'Stopp', 'Halt zeigen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'sugar', 'Zucker', 'Erst ''süß'' zeigen, dann mit Fingern streuen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'swimming', 'Schwimmen', 'Brustschwimmen mimen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'switch_off', 'Etw. Aus(Schalten)', 'Klappe zu!', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'switch_on', 'Etw. An(Schalten)', 'Daumen drückt Schalter', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'table', 'Tisch', 'Tischfläche von innen nach außen streichen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'tea', 'Tee', 'Teebeutel auf-und abschwenken', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'telephone', 'Telefon', 'Y-Hand an Ohr', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'thank_you', 'Danke', 'Wie die Queen vom Kinn aus nach vorn', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'there', 'Da', 'Zeigen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'thinking', 'Denken/Schlau', 'Mit Zeigefinger auf Kopf tippen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'tidy_up', 'Aufräumen', '3x einen Stapel zusammenschieben', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'tiny', 'Winzig/Wenig', 'Zeigefinger und Daumen zeigen ''wenig''', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'today', 'Heute', '2x langsam vor sich nach unten zeigen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'toilet', 'Toilette', 'Y-Hand dreht neben Kopf', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'tomato', 'Tomate', 'Tomate vom Busch abdrehen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'tomorrow', 'Morgen', 'Großen Bogen nach vorn zeigen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'towel', 'Handtuch', 'Handtuch mit Zeigefinger umfahren', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'toy', 'Kuscheltier', 'Kuscheln zeigen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'train', 'Zug/Eisenbahn', 'Neben Körper Räderdrehen zeigen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'tree', 'Baum', 'Arm=Baumstamm, Finger=Äste', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'tumbling', 'Hinfallen', 'Nach vorn abstützen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'tv', 'Fernseher/Fernsehen', 'Fernbedienung tippen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'two', 'Zwei', 'Zwei Finger', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'up', 'Oben/Hoch', 'Nach oben zeigen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'wait', 'Warte/Langsam', 'verlangsamende Bewegung', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'walk', 'Gehen', 'Zeige-und Mittelfinger spazieren', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'washing', 'Waschen', 'Hände waschen sich', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'water', 'Wasser', 'Steht mir bis zum Hals', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'we', 'Wir', 'Auf alle und sich selbst zeigen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'what', 'Was?', 'Handflächen hin und her schütteln', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'when', 'Wann?', 'Finger klopfen ungeduldig an Wange', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'where', 'Wo?', 'Schüssel mit Händen nachahmen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'who', 'Wer?', 'Fingeralphabet-R wackelt', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'window', 'Fenster', 'Mit Zeigefingern Fenster in Luft malen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'with', 'Mit', 'Daumen kommt mit anderen Fingern mit', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'woman', 'Frau', 'Ohrring', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'writing', 'Stift/Schreiben', 'Mit Stift schreiben mimen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'yellow', 'Gelb', 'Y-Hand (Yellow) dreht im Handgelenk', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'yes', 'Ja', 'Nicken', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'yesterday', 'Gestern', 'Großen Bogen  nach hinten zeigen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'yoghurt', 'Joghurt', 'Becher auslöffen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'you', 'Du', 'mit Zeigefinger auf Gegenüber zeigen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'you_help_me', 'Du Hilfst Mir', '2. Hand hilft der anderen', 0, 0)");
        db.execSQL("INSERT INTO signs (name, name_de, mnemonic, learning_progress, starred) VALUES ( 'yours', 'Dein', 'Handfläche zeigt langsam auf Gesprächspartner', 0, 0)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO: 07.11.2020 Update per SQL
    }
}
