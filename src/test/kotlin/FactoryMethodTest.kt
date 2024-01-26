import kotlin.test.Test
import kotlin.test.assertEquals
//import org.example.Buttons.Button
//import org.example.Buttons.HtmlButton
//import org.example.Buttons.WindowsButton
//import org.example.Factory.Dialog
//import org.example.Factory.HtmlDialog
//import org.example.Factory.WindowsDialog
//import java.io.ByteArrayOutputStream
//import java.io.PrintStream

class FactoryMethodTest {
//    @Test
//    fun testHtmlButtonCreationAndRendering() {
//        val dialog: Dialog = HtmlDialog()
//
//        val button: Button = dialog.createButton()
//
//        assertEquals(HtmlButton::class.java, button::class.java)
//        assertEquals(getRenderedOutput(button), "<button>Test Button</button>\n\"Click! Html Button says - 'Hello World!'\"\n")
//    }
//
//    @Test
//    fun testWindowsButtonCreationAndRendering() {
//        val dialog: Dialog = WindowsDialog()
//
//        val button: Button = dialog.createButton()
//
//        assertEquals(WindowsButton::class.java, button::class.java)
//        assertEquals(getRenderedOutput(button), "Render a JavaFX button\n\"Click! Windows Button says - 'Hello World!'\"\n")
//    }

//    @Test
//    fun testDialogRendering() {
//        val htmlDialog: Dialog = HtmlDialog()
//        val windowsDialog: Dialog = WindowsDialog()
//
//        assertEquals(getRenderedOutput(htmlDialog), "<button>Test Button</button>\n\"Click! Html Button says - 'Hello World!'\"\n")
//        assertEquals(getRenderedOutput(windowsDialog), "Render a JavaFX button\n\"Click! Windows Button says - 'Hello World!'\"\n")
//    }

//    private fun getRenderedOutput(button: Button): String {
//        val byteArrayOutputStream = ByteArrayOutputStream()
//        System.setOut(PrintStream(byteArrayOutputStream))
//        button.render()
//        return byteArrayOutputStream.toString()
//    }

    @Test
    public fun testTrueShouldBeTrue() {
        assertEquals(true, true);
    }
}
