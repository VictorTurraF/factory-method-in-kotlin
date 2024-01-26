package org.example.Factory

import org.example.Buttons.Button

/**
 * Base Creator
 *
 *  * Base factory class. Note that "factory" is merely a role for the class. It
 *  * should have some core business logic which needs different products to be
 *  * created.
 */
abstract class Dialog {
    public fun renderWindow() {
        val okButton: Button = createButton()
        okButton.render()
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract fun createButton(): Button
}