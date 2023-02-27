# demo-test-project

* The project has been implemented wit spring boot 2.2, and it was written in java 11.
* It uses maven for building tool. It also uses some external dependencies such as lombok and commons-lang3 which helped the implementation.
* For testing used Junit.

There are basically two classes that represent the entities of the game which are the Player and the Result and there is also one class that 
holds the rules and calculates the final results which is the utility class Rules. Finally, there is an enum which holds the three choices and 
the main spring boot class DemoTestProjectApplication which runs the project.

The advantages of my implementation is that it basally expandable by creating as many users you want and let them have their own range of choices.
On the other side a disadvantage is that everything is written in code and there is no user interface or external source to change the configurations of the project like 
the amount of iterations.
