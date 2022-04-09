package tj.yoqub.test_library

import android.content.Context
import android.widget.Toast

fun Context.testLibraryHelloWorld(name: String = "World") {
    Toast.makeText(this, "Hello, $name", Toast.LENGTH_SHORT).show()
}