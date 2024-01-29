## Find a bug

Clone the [Simba Organizer repository](https://github.com/selabs-ur1/doodle) and follow the instructions to run the application on your machine.

Find a bug in the application. 

With the help of Selenium and the Page Object Model desing pattern write a simple test that fails for this bug.

Optionally make a pull request to the project.

Include in this document the code of the test and, if you did it, the link to the pull request.

## Answer

### Reproduction du bug

- Créer un sondage
- Cliquer sur le premier lien pour accéder au sondage
- Poster un commentaire
- **Bug :** une fois le commentaire posté, le bouton "Ajouter commentaire" est grisé. Rafraîchir la page le rend à nouveau fonctionnel