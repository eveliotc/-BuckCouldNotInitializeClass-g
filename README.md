BuckCouldNotInitializeClass
===========================

Demonstrates misleading error from buck `Could not initialize class`

From gradlew/Android Studio `./gradlew :library:testDebug` results:

```
Parallel execution with configuration on demand is an incubating feature.
Incremental java compilation is an incubating feature.
:library:preBuild UP-TO-DATE
:library:preDebugBuild UP-TO-DATE
:library:checkDebugManifest
:library:prepareDebugDependencies
:library:compileDebugAidl UP-TO-DATE
:library:compileDebugRenderscript UP-TO-DATE
:library:generateDebugBuildConfig UP-TO-DATE
:library:generateDebugResValues UP-TO-DATE
:library:generateDebugResources UP-TO-DATE
:library:packageDebugResources UP-TO-DATE
:library:processDebugManifest UP-TO-DATE
:library:processDebugResources UP-TO-DATE
:library:generateDebugSources UP-TO-DATE
:library:incrementalDebugJavaCompilationSafeguard UP-TO-DATE
:library:javaPreCompileDebug
:library:compileDebugJavaWithJavac UP-TO-DATE
:library:incrementalDebugUnitTestJavaCompilationSafeguard UP-TO-DATE
:library:javaPreCompileDebugUnitTest
:library:preDebugUnitTestBuild UP-TO-DATE
:library:prepareDebugUnitTestDependencies
:library:compileDebugUnitTestJavaWithJavac UP-TO-DATE
:library:processDebugJavaRes UP-TO-DATE
:library:processDebugUnitTestJavaRes UP-TO-DATE
:library:compileDebugUnitTestSources UP-TO-DATE
:library:mockableAndroidJar UP-TO-DATE
:library:assembleDebugUnitTest UP-TO-DATE
:library:testDebugUnitTest UP-TO-DATE

BUILD SUCCESSFUL

Total time: 2.599 secs
```

Buck `./buckw test //library:test_debug` (debug config irrelevant):
```
FAILURE evel.io.buckcouldnotinitializeclass.library.AnotherClassTest shouldDoThisThing: Could not initialize class evel.io.buckcouldnotinitializeclass.library.somepackage.SomeEnum
java.lang.NoClassDefFoundError: Could not initialize class evel.io.buckcouldnotinitializeclass.library.somepackage.SomeEnum
       	at evel.io.buckcouldnotinitializeclass.library.AnotherClassTest.shouldDoThisThing(AnotherClassTest.java:20)
       	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
       	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
       	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
       	at java.lang.reflect.Method.invoke(Method.java:497)
       	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
       	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
       	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
       	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
       	at org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)
       	at com.facebook.buck.testrunner.SameThreadFailOnTimeout$1.call(SameThreadFailOnTimeout.java:45)
       	at com.facebook.buck.testrunner.SameThreadFailOnTimeout$1.call(SameThreadFailOnTimeout.java:41)
       	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
       	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
       	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
       	at java.lang.Thread.run(Thread.java:745)

TESTS FAILED: 4 FAILURES
Failed target: //library:test_debug
FAIL evel.io.buckcouldnotinitializeclass.library.AnotherClassTest
```
