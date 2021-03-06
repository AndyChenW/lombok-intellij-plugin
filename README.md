lombok-intellij-plugin [![Build Status](https://travis-ci.org/mplushnikov/lombok-intellij-plugin.svg?branch=master)](https://travis-ci.org/mplushnikov/lombok-intellij-plugin) [![Code Coverage](https://img.shields.io/codecov/c/github/mplushnikov/lombok-intellij-plugin/master.svg)](https://codecov.io/github/mplushnikov/lombok-intellij-plugin?branch=master) [![Donate](https://www.paypal.com/en_US/i/btn/btn_donateCC_LG.gif)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=3F9HXD7A2SMCN)
======================

[![Join the chat at https://gitter.im/mplushnikov/lombok-intellij-plugin](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/mplushnikov/lombok-intellij-plugin?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

## Plugin for [IntelliJ IDEA](http://plugins.jetbrains.com/plugin/6317?pr=idea plugin) to support [Lombok](https://projectlombok.org) annotations. ##

Provides support for lombok annotations to write great Java code with IntelliJ IDEA.

**Last version (0.11) released on 04.04.2016**

Eighteenth version of plugin released. Bugfixes, performance optimization and new features support!

Install it automatically from IntelliJ Idea plugin repository.

Tested and supports IntelliJ versions: 12.1.7, 13.1.6, 14.1.4, 15.0.4, 2016.1.1  

Updated support for IntelliJ 11.1.5 by plugin version 0.11!

Last support for IntelliJ 10.5.4 by plugin version 0.8.7

With this plugin your IntelliJ can recognize all of generated getters, setters and some other things from lombok project, so that you get code completion and are able to work without errors stating the methods don't exists.


Features / Supports
--------
- [@Getter and @Setter](http://projectlombok.org/features/GetterSetter.html)
- [@ToString](http://projectlombok.org/features/ToString.html)
- [@EqualsAndHashCode](http://projectlombok.org/features/EqualsAndHashCode.html)
- [@AllArgsConstructor, @RequiredArgsConstructor and @NoArgsConstructor](http://projectlombok.org/features/Constructor.html)
- [@Log, @Log4j, @Log4j2, @Slf4j, @XSlf4j, @CommonsLog](http://projectlombok.org/features/Log.html)
- [@Data](http://projectlombok.org/features/Data.html)
- [@Builder](https://projectlombok.org/features/Builder.html)
- [@Singular](https://projectlombok.org/features/Builder.html#singular)
- [@Delegate](http://projectlombok.org/features/Delegate.html)
- [@Value](http://projectlombok.org/features/Value.html)
- [@Accessors](http://projectlombok.org/features/experimental/Accessors.html)
- [@Wither](http://projectlombok.org/features/experimental/Wither.html)
- [@SneakyThrows](http://projectlombok.org/features/SneakyThrows.html)
- [@val](http://projectlombok.org/features/val.html) with IntelliJ 14.1
- [lombok config files syntax highlighting](https://projectlombok.org/features/configuration.html)
- code inspections
- refactoring actions (lombok and delombok)

Installation
------------
### Plugin Installation
- Using IDE built-in plugin system on Windows:
  - <kbd>File</kbd> > <kbd>Settings</kbd> > <kbd>Plugins</kbd> > <kbd>Browse repositories...</kbd> > <kbd>Search for "lombok"</kbd> > <kbd>Install Plugin</kbd>
- Using IDE built-in plugin system on MacOs:
  - <kbd>Preferences</kbd> > <kbd>Settings</kbd> > <kbd>Plugins</kbd> > <kbd>Browse repositories...</kbd> > <kbd>Search for "lombok"</kbd> > <kbd>Install Plugin</kbd>
- Manually:
  - Download the [latest release](https://github.com/mplushnikov/lombok-intellij-plugin/releases/latest) and install it manually using <kbd>Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Install plugin from disk...</kbd>
  
Restart IDE.

### Required IntelliJ Configuration
In your project: Click Preferences, "Build, Execution, Deployment", Compiler, Annotation Processors. Click Enable Annotation Processing

### Lombok project dependency
Make sure you have Lombok dependency added to your project. This plugin **does not** automatically add it for you.

If you are using Gradle/Maven/Ivy, see example below:

##### Gradle
In your `build.gradle`:
```groovy
//'compile' can be changed to 'compileOnly' for Gradle 2.12+
// or 'provided' if using 'propdeps' plugin from SpringSource
compile "org.projectlombok:lombok:1.16.8"
```

##### Maven
In your `pom.xml`:
```xml
<dependencies>
	<dependency>
		<groupId>org.projectlombok</groupId>
		<artifactId>lombok</artifactId>
		<version>1.16.8</version>
		<scope>provided</scope>
	</dependency>
</dependencies>
```

##### Ivy
In your `ivy.xml`:
```xml
<dependency org="org.projectlombok" name="lombok" rev="1.16.8" conf="build" />
```

IntelliJ and Eclipse compiler
-----------------------------
If you're using Eclipse compiler with lombok, try this setup:
- install plugin
- make sure Lombok dependency is added to the project
- change compiler setting:
  - <kbd>...</kbd> > <kbd>Compiler</kbd> > <kbd>Java Compiler</kbd> > <kbd>Use Compiler: Eclipse</kbd>
  - <kbd>...</kbd> > <kbd>Compiler</kbd> > <kbd>Annotation Processors</kbd> > <kbd>Enable annotation processing: checked (default configuration)</kbd>
  - <kbd>...</kbd> > <kbd>Compiler</kbd> > <kbd>Additional build process VM options: -javaagent:lombok.jar</kbd>

Developed By
------------
[**@mplushnikov** Michail Plushnikov] (https://github.com/mplushnikov)

**Contributors**
- [**@AlexejK** Alexej Kubarev](https://github.com/AlexejK)
- [**@twillouer** William Delanoue](https://github.com/twillouer)
- [**@uvpoblotzki** Ulrich von Poblotzki](https://github.com/uvpoblotzki)
- [**@toadzky** David Harris](https://github.com/toadzky)
- [**@mlueders** Mike Lueders](https://github.com/mlueders)
- [**@mg6maciej** Maciej Górski](https://github.com/mg6maciej)
- [**@Sheigutn** Florian Böhm](https://github.com/Sheigutn)
- [**@siosio** siosio](https://github.com/siosio)
- [**@Siriah** Iris Hupkens](https://github.com/Siriah)

Supporters
--------
[<img src="https://www.yourkit.com/images/yklogo.png" />](https://www.yourkit.com/)

YourKit supports open source projects with its full-featured Java Profiler.
YourKit, LLC is the creator of [YourKit Java Profiler](https://www.yourkit.com/java/profiler/index.jsp) and [YourKit .NET Profiler](https://www.yourkit.com/.net/profiler/index.jsp), innovative and intelligent tools for profiling Java and .NET applications.


License
-------
Copyright (c) 2011-2016 Michail Plushnikov. See the [LICENSE](./LICENSE) file for license rights and limitations (BSD).
