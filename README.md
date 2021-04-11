# Modeling language for GitHub Action workflow syntax
## Eclipse Setup
```
Version: 2020-12 (4.18.0)
Build id: 20201210-1552
Java compiler compliance level: 11
JRE version: jdk-11.0.10.9-hotspot (AdoptOpenJDK 11 Hotspot)
Xtext: 2.20.0
Xsemantics: 1.19.0
Xpect: 0.2.0
Epsilon: 2.2.0
Sirius: 6.4.1
Eclipse Modeling Framework: 2.25.0
Yaml Editor: 1.7.0
```
* Install Eclipse Modeling Framework from
  https://download.eclipse.org/modeling/emf/emf/builds/release
* Install Yaml Editor from Eclipse Marketplace

## Project Setup
1. Download release v1.0 of the repository
2. Import the following projects to eclipse
```
uk.ac.kcl.inf.mdd.project.githubaction.edit
uk.ac.kcl.inf.mdd.project.githubaction.editor
uk.ac.kcl.inf.mdd.project.githubaction.xtext
uk.ac.kcl.inf.mdd.project.githubaction
```
3. Launch a runtime eclipse
4. Import the follwing projects to your runtime eclipse
```
TestGraphicalSyntax
TestTextualSyntax
uk.ac.kcl.inf.mdd.project.githubaction.design
uk.ac.kcl.inf.mdd.project.githubaction.xpect 
```

## Example Projects
### `TestGraphicalSyntax`
* Open `NoticeBoardRepo.githubaction` with `Githubaction Editor` and edit the file
* In Modeling Perspective, view the corresponding graphical representation under `Notice Board Repository Diagram` 
* Note: Currently the graphical syntax cannot be edited and saved due to unknown errors
###  `TestTextualSyntax`
* Edit `test.githubaction` in the `src` folder
* `YAML` files and a statistics file are generated automatically in the `src-gen` when the `.githubaction` files are saved
### `uk.ac.kcl.inf.mdd.project.githubaction.xpect`
* Edit `test1.githubaction.xt` or `test2.githubaction.xt` files in the `src/uk.ac.kcl.inf.mdd.project.githubaction.xpect` folder
* Run the test by right clicking the file and select Run As > JUnit Test
