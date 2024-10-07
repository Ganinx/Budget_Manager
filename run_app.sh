#!/bin/bash

# Chemin vers le fichier JAR de votre application
JAR_FILE="target/BudgetManager-1.0-SNAPSHOT.jar"

# Vérifiez si le fichier JAR existe avant de tenter de l'exécuter
if [[ ! -f "$JAR_FILE" ]]; then
    echo "Le fichier JAR $JAR_FILE n'existe pas."
    exit 1
fi

# Lancer l'application
java -jar "$JAR_FILE"