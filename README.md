# kmm-local-publish-sample
It is a sample project to demonstrate how to Publish KMM library to Local Maven and consume in an Android Project

![image](https://user-images.githubusercontent.com/10572239/227880826-4ad19d36-b9fa-4bff-bab6-f0d09e566ab7.png)
1. Build the library project you will see publication updated as above in the gradle tasks.

2. run *publishToLocalMaven gradle task.
3. now check ~/.m2 folder for your library project it usually starts from com/example/shared ...
4. If you can see yours folder check any xml file and you may find your artifactID and groupID with Version there
![image](https://user-images.githubusercontent.com/10572239/227881746-f4de0ce4-c155-4bdd-8f34-280791af77a8.png)

5. Now in Android App i.e KmmLibraryConsumer project add the following line(app level build.gradle)
![image](https://user-images.githubusercontent.com/10572239/227882101-a89af606-3783-4947-9768-54df834b00d6.png)


Note: In Shared Module there is configuration of Maven Publishing




