data class Foo(val a: String, val b: String, val c: String)

fun bar(f: Foo) {
    val (<caret>) = f
}