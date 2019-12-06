# language: fr
Fonctionnalité: verifier le code retour de l'api

  Scénario: aller a l'endpoint de national weather et verifier sa disponibilité

    Etant donné Je selectionne l API National Weather
    Quand j envoie une requete GET sur l endpoint "alerts"
    Alors Le code retour est 200

  Scénario: Checker les alertes en Floried

    Etant donné Je selectionne l API National Weather
    Et Je selectionne la zone "FL"
    Quand j envoie une requete GET sur l endpoint "alerts"
    Alors Le code retour est 200