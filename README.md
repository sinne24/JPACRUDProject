# JPACRUDProject

Site URL:
http://3.134.219.255:8080/MyPokedex/home.do

### Description
The project simulates a pokemon game trainer PC regularly found in pokecenters and utilizes the fundamentals of CRUD development. The JPACrud project's trainer pc is a database with schema name pokedex. The pokedex houses pokemon entities that are entered along with various details about the creature. The details include their official pokedex number, pc location id, their type/s, region they are native to, and evolutionary stage. Upon accessing the index page, the user is met with a list of all available pokemon in the PC as well as the option to look one up by pc location, add a pokemon, or delete a pokemon. Each name links to the pokemon's detail summary. On the details page one can choose to update the pokemon, delete it, or return home. Whenever a user completes a CRUD task they are met with an applicable confirmation page and a link to the home page.  

### Technologies

MySql, Eclipse IDE, Boot Strap, Spring Boot, MySql Workbench

### Lessons Learned
- A good set-up will make or break the rest of project development
- When designing the update functionality I learned the lesson of how to pass a hidden identifier so that the entity being accessed is not lost between jsp files and the controller.
- Complete all of the functional needs before tackling aesthetics. While this is a typical practice for me, the applicability of it was strongly reinforced in this project. 
- Finding the balance between which functions needs a jsp page versus which can be backend functionalities was tricky. Ultimately the hardest balancing act as a novice was navigating between the jsp files, contoller, and DAO implementation.
- Reading through and understanding the stack traces when running into server errors was frustrating but necessary practice. I ran into the 405, 404, 500, 400, a whole host of those white label pages when developing this project. However, the sense of accomplishment after debugging a nagging issue was heady.

 
