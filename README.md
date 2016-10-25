#Example libGDX using Box2D and Ashley ECS

This is a starter project available to get up and running with libgdx using Box2D in an Ashley ECS based structure. The code is very basic, and the game does very little at this time. This example will give you a starting point with:

 1. Configured texture-packer module that is wired into the gradle system so textures are re-packed when you run (see core/build.gradle)
 2. Simple Texture, Transform, Animation, State, and Body components.
 3. RenderingSystem that accounts for world units to pixels and Z indexing (based heavily on the ashley-superjumper example)
 4. AnimationSystem that supports animations for different States.
 5. PhysicsSystem that will run the World.step() and update TransformComponents for any physics Entities.
 6. A basic splash screen that will show the splash image and a progress bar based on the AssetManager loading progress.
 7. An Asset utility class to setup your AssetManager loading, and retrieval of assets in one location (you'll want to add code to this file to expose more assets)
 8. A crude Screen dipatching pattern that can allow each screen to signal when it has ended and needs to move to the next. You can implement your own IScreenDispatcher or modify the existing to do more complex screen swapping.
 9. Added the required `gdx.reflect.include` options for Ashley Components and Systems so that the GWT Html build works.
 
#Running

The project was created with the libGDX [setup application](https://libgdx.badlogicgames.com/download.html), and is [gradle](https://docs.gradle.org/current/release-notes) based. You can import it into your IDE of choice as a Gradle project. 

From the command line you can run the project:

    git clone https://github.com/RoaringCatGames/libgdx-ashley-box2d-example.git
    cd libgdx-ashley-box2d-example
    ./gradlew texture-packer:run desktop:run
    
NOTE: You only need to run the ```texture-packer:run``` target once after pulling down the project. If you add/update art assets in the texture-packer project, you'll need to re-run the ```texture-packer:run``` target

