learning spring
build tools:
    build tools will take the source code, add the libraries, compiles it and creates the final app.
    These will compile code, download dependencies and libraries, run tests, package the project and deploy it.
    some of the build tools are maven and gradle
    These need the config files like pom.xml, build.gradle etc just like the package.json in nodejs

Inversion of Control:
    it is a concept where the developer will write the logic, but the entire object creation, manging and destroying of object is done by other

Dependency injection:
    the object get its dependencies from outside. here someone else is injecting the object into your application that someone else is the spring framework in your application
    lets say there is a class named Teacher and in that class you want the object of the another class named Student. so spring will create the object for the Student and inject it into the Teacher class.
    This can be done by using different ways like @Autowired, or constructor injection or setter injection
    example: chief [class]  wants ingredients [dependencies], so he take the help of helper[spring]. this is called dependency injection

here bean generally refers to the object of the class
@Autowired → Automatically injects a dependency by type into a Spring-managed component.
@Qualifier → Specifies the exact bean to inject when multiple beans of the same type exist.
@Primary → Marks a bean as the default choice when multiple beans of the same type are available.
@Component → Tells Spring to treat the class as a bean and manage its lifecycle automatically.




