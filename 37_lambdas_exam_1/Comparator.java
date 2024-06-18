// @FunctionalInterface
// public abstract class AnnotationTest{
// 	abstract int foo();

// }

// @FunctionalInterface
// public interface AnnotationTest{
// default int foo(){};
// }

@FunctionalInterface
public interface Comparator <T>{
	int compare(T o1, T o2);
	boolean equals(Object obj);
}