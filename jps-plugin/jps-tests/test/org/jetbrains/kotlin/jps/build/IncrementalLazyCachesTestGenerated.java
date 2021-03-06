/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.jps.build;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@RunWith(JUnit3RunnerWithInners.class)
public class IncrementalLazyCachesTestGenerated extends AbstractIncrementalLazyCachesTest {
    @TestMetadata("jps-plugin/testData/incremental/lazyKotlinCaches")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class LazyKotlinCaches extends AbstractIncrementalLazyCachesTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInLazyKotlinCaches() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/lazyKotlinCaches"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
        }

        @TestMetadata("class")
        public void testClass() throws Exception {
            runTest("jps-plugin/testData/incremental/lazyKotlinCaches/class/");
        }

        @TestMetadata("classInheritance")
        public void testClassInheritance() throws Exception {
            runTest("jps-plugin/testData/incremental/lazyKotlinCaches/classInheritance/");
        }

        @TestMetadata("constant")
        public void testConstant() throws Exception {
            runTest("jps-plugin/testData/incremental/lazyKotlinCaches/constant/");
        }

        @TestMetadata("function")
        public void testFunction() throws Exception {
            runTest("jps-plugin/testData/incremental/lazyKotlinCaches/function/");
        }

        @TestMetadata("inlineFunctionWithUsage")
        public void testInlineFunctionWithUsage() throws Exception {
            runTest("jps-plugin/testData/incremental/lazyKotlinCaches/inlineFunctionWithUsage/");
        }

        @TestMetadata("inlineFunctionWithoutUsage")
        public void testInlineFunctionWithoutUsage() throws Exception {
            runTest("jps-plugin/testData/incremental/lazyKotlinCaches/inlineFunctionWithoutUsage/");
        }

        @TestMetadata("noKotlin")
        public void testNoKotlin() throws Exception {
            runTest("jps-plugin/testData/incremental/lazyKotlinCaches/noKotlin/");
        }

        @TestMetadata("topLevelPropertyAccess")
        public void testTopLevelPropertyAccess() throws Exception {
            runTest("jps-plugin/testData/incremental/lazyKotlinCaches/topLevelPropertyAccess/");
        }

        @TestMetadata("jps-plugin/testData/incremental/lazyKotlinCaches/class")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Class extends AbstractIncrementalLazyCachesTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInClass() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/lazyKotlinCaches/class"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
            }
        }

        @TestMetadata("jps-plugin/testData/incremental/lazyKotlinCaches/classInheritance")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class ClassInheritance extends AbstractIncrementalLazyCachesTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInClassInheritance() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/lazyKotlinCaches/classInheritance"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
            }
        }

        @TestMetadata("jps-plugin/testData/incremental/lazyKotlinCaches/constant")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Constant extends AbstractIncrementalLazyCachesTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInConstant() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/lazyKotlinCaches/constant"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
            }
        }

        @TestMetadata("jps-plugin/testData/incremental/lazyKotlinCaches/function")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Function extends AbstractIncrementalLazyCachesTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInFunction() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/lazyKotlinCaches/function"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
            }
        }

        @TestMetadata("jps-plugin/testData/incremental/lazyKotlinCaches/inlineFunctionWithUsage")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class InlineFunctionWithUsage extends AbstractIncrementalLazyCachesTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInInlineFunctionWithUsage() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/lazyKotlinCaches/inlineFunctionWithUsage"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
            }
        }

        @TestMetadata("jps-plugin/testData/incremental/lazyKotlinCaches/inlineFunctionWithoutUsage")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class InlineFunctionWithoutUsage extends AbstractIncrementalLazyCachesTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInInlineFunctionWithoutUsage() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/lazyKotlinCaches/inlineFunctionWithoutUsage"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
            }
        }

        @TestMetadata("jps-plugin/testData/incremental/lazyKotlinCaches/noKotlin")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class NoKotlin extends AbstractIncrementalLazyCachesTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInNoKotlin() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/lazyKotlinCaches/noKotlin"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
            }
        }

        @TestMetadata("jps-plugin/testData/incremental/lazyKotlinCaches/topLevelPropertyAccess")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class TopLevelPropertyAccess extends AbstractIncrementalLazyCachesTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInTopLevelPropertyAccess() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/lazyKotlinCaches/topLevelPropertyAccess"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
            }
        }
    }

    @TestMetadata("jps-plugin/testData/incremental/changeIncrementalOption")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ChangeIncrementalOption extends AbstractIncrementalLazyCachesTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInChangeIncrementalOption() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/changeIncrementalOption"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
        }

        @TestMetadata("incrementalOff")
        public void testIncrementalOff() throws Exception {
            runTest("jps-plugin/testData/incremental/changeIncrementalOption/incrementalOff/");
        }

        @TestMetadata("incrementalOffOn")
        public void testIncrementalOffOn() throws Exception {
            runTest("jps-plugin/testData/incremental/changeIncrementalOption/incrementalOffOn/");
        }

        @TestMetadata("incrementalOffOnJavaChanged")
        public void testIncrementalOffOnJavaChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/changeIncrementalOption/incrementalOffOnJavaChanged/");
        }

        @TestMetadata("incrementalOffOnJavaOnly")
        public void testIncrementalOffOnJavaOnly() throws Exception {
            runTest("jps-plugin/testData/incremental/changeIncrementalOption/incrementalOffOnJavaOnly/");
        }

        @TestMetadata("jps-plugin/testData/incremental/changeIncrementalOption/incrementalOff")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class IncrementalOff extends AbstractIncrementalLazyCachesTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInIncrementalOff() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/changeIncrementalOption/incrementalOff"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
            }
        }

        @TestMetadata("jps-plugin/testData/incremental/changeIncrementalOption/incrementalOffOn")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class IncrementalOffOn extends AbstractIncrementalLazyCachesTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInIncrementalOffOn() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/changeIncrementalOption/incrementalOffOn"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
            }
        }

        @TestMetadata("jps-plugin/testData/incremental/changeIncrementalOption/incrementalOffOnJavaChanged")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class IncrementalOffOnJavaChanged extends AbstractIncrementalLazyCachesTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInIncrementalOffOnJavaChanged() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/changeIncrementalOption/incrementalOffOnJavaChanged"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
            }
        }

        @TestMetadata("jps-plugin/testData/incremental/changeIncrementalOption/incrementalOffOnJavaOnly")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class IncrementalOffOnJavaOnly extends AbstractIncrementalLazyCachesTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInIncrementalOffOnJavaOnly() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/changeIncrementalOption/incrementalOffOnJavaOnly"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
            }
        }
    }
}
