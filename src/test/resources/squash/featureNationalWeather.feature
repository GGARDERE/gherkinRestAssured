# language: fr
Fonctionnalité: verifier le code retour de l'api

  Scénario: aller a l'endpoint de national weather et verifier sa disponibilité

    Quand Je selectionne l API National Weather
    Quand j envoie une requete GET sur l endpoint ""
    Alors Le code retour est 200
