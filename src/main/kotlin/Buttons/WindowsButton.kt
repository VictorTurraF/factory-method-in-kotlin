package org.example.Buttons

/**
 * Concrete product 2
 *
 * Windows button implementation.
 */
class WindowsButton : Button {
    override fun render() {
        println("Render a JavaFX button")
        this.onClick()
    }

    override fun onClick() {
        println("\"Click! Windows Button says - 'Hello World!'\"")
    }
}