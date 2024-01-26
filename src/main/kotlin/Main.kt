package refactoring_guru.factory_method.example

import org.example.Factory.Dialog
import org.example.Factory.HtmlDialog
import org.example.Factory.WindowsDialog

/**
 * Demo class. Everything comes together here.
 */
object Main {
    private var dialog: Dialog? = null

    @JvmStatic
    fun main(args: Array<String>) {
        configure()
        runBusinessLogic()
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    private fun configure() {
        this.dialog = if (System.getProperty("os.name") == "Windows 10") {
            WindowsDialog()
        } else {
            HtmlDialog()
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    private fun runBusinessLogic() {
        this.dialog?.renderWindow()
    }
}